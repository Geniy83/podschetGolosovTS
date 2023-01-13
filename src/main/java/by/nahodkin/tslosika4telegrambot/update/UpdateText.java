package by.nahodkin.tslosika4telegrambot.update;

import jakarta.xml.bind.JAXBElement;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.wml.ContentAccessor;
import org.docx4j.wml.Text;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Component
public class UpdateText {

    private WordprocessingMLPackage getTemplate() throws Docx4JException, FileNotFoundException {
        return WordprocessingMLPackage.load(new FileInputStream("./src/main/resources/originalProtocol.docx"));
    }

    private static List<Object> getAllElementFromObject(Object obj, Class<?> toSearch) {
        List<Object> result = new ArrayList<>();
        if (obj instanceof JAXBElement) obj = ((JAXBElement<?>) obj).getValue();
        if (obj.getClass().equals(toSearch)) result.add(obj);
        else if (obj instanceof ContentAccessor) {
            List<?> children = ((ContentAccessor) obj).getContent();
            for (Object child : children) {
                result.addAll(getAllElementFromObject(child, toSearch));
            }
        }
        return result;
    }
    public void replacePlaceholder(String name, String placeholder ) throws Docx4JException, FileNotFoundException {
        WordprocessingMLPackage template = getTemplate();
        List<Object> texts = getAllElementFromObject(template.getMainDocumentPart(), Text.class);
        for (Object text : texts) {
            Text textElement = (Text) text;
            if (textElement.getValue().equals(placeholder)) {
                textElement.setValue(name);
            }
        }
        writeDocxToStream(template);
    }

    private void writeDocxToStream(WordprocessingMLPackage template) throws Docx4JException {
        File f = new File("./src/main/resources/originalProtocol.docx");
        template.save(f);
    }
}
