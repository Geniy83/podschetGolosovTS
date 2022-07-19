package by.nahodkin.tslosika4telegrambot.podschet;

import by.nahodkin.tslosika4telegrambot.service.UserService;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.docx4j.wml.ContentAccessor;
import org.docx4j.wml.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Component
public class Podschet {
    @Autowired
    private UserService userService;

    private WordprocessingMLPackage getTemplate() throws Docx4JException, FileNotFoundException {
        return WordprocessingMLPackage.load(new FileInputStream("./src/main/resources/template.docx"));
    }

    private static List<Object> getAllElementFromObject(Object obj, Class<?> toSearch) {
        List<Object> result = new ArrayList<>();
        if (obj instanceof JAXBElement) obj = ((JAXBElement<?>) obj).getValue();
        if (obj.getClass().equals(toSearch))
            result.add(obj);
        else if (obj instanceof ContentAccessor) {
            List<?> children = ((ContentAccessor) obj).getContent();
            for (Object child : children) {
                result.addAll(getAllElementFromObject(child, toSearch));
            }

        }
        return result;
    }

    private void writeDocxToStream(WordprocessingMLPackage template, String target) throws Docx4JException {
        File f = new File(target);
        template.save(f);
    }

    public void protocol() throws FileNotFoundException, Docx4JException {

        List<Object> texts = getAllElementFromObject(getTemplate().getMainDocumentPart(), Text.class);
        for (Object text : texts) {
            Text textElement = (Text) text;
            System.out.println(textElement.getValue());
            if (textElement.getValue().equals("Q23")) {
                textElement.setValue("huhidvivrig");
            }
        }

        System.out.println("---------------- После замены текста--------------");
        for (Object text : texts) {
            Text textElement = (Text) text;
            System.out.println(textElement.getValue());
        }


//        File f = new File("./src/main/resources/NEW.docx");
//        WordprocessingMLPackage templateNew = null;
//        for (Object text : texts) {
//            templateNew = (WordprocessingMLPackage) text;
//        }
//        assert templateNew != null;
//        templateNew.save(f);

//        MainDocumentPart mainDocumentPart = getTemplate().getMainDocumentPart();
//        String textNodesXPath = "//w:t";
//        List<Object> textNodes= mainDocumentPart.getJAXBNodesViaXPath(textNodesXPath, true);
//        for (Object obj : textNodes) {
//            Text text = (Text) ((JAXBElement<?>) obj).getValue();
//            String textValue = text.getValue();
//            System.out.println(textValue);
//        }

        Double uchastnikovSobraniy = userService.getAllByShareTrue("1");
        System.out.println("S=" + userService.getAllByArea() + " доля =" + userService.getAllByShare());
        System.out.println("На данный момент проголосовало " + userService.getAllByStatusTrue("1") + " собственников, обладающие долей от общего имущества " + userService.getAllByShareTrue("1") + " %");
        System.out.println("На Вопрос 1 ЗА проголосовало " + userService.getAllUserByQ11("1") + " собственников, обладающие " + userService.getAllByQ11("1") / userService.getAllByShareTrue("1") * 100 + " % голосов от учавствовших в собрании собственников");
    }
}
