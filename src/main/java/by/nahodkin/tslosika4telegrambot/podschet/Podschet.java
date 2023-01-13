package by.nahodkin.tslosika4telegrambot.podschet;

import by.nahodkin.tslosika4telegrambot.service.QuestionsService;
import by.nahodkin.tslosika4telegrambot.service.UserService;
import by.nahodkin.tslosika4telegrambot.update.UpdateText;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Component
public class Podschet {
    @Autowired
    private UserService userService;

    @Autowired
    private QuestionsService questionsService;

    @Autowired
    private UpdateText updateText;

    public void protocol() throws FileNotFoundException, Docx4JException {

        Date date = new Date();
        SimpleDateFormat formatForDateNow = new SimpleDateFormat("dd.MM.yyyy");
        String dataGolosovaniy = formatForDateNow.format(date);
        updateText.replacePlaceholder(dataGolosovaniy, "data");

        List<String> questions = questionsService.getAllQuestions();
        updateText.replacePlaceholder(questions.get(0), "Q1");
        updateText.replacePlaceholder(questions.get(1), "Q2");
        updateText.replacePlaceholder(questions.get(2), "Q3");
        updateText.replacePlaceholder(questions.get(3), "Q4");
        updateText.replacePlaceholder(questions.get(4), "Q5");
        updateText.replacePlaceholder(questions.get(5), "Q6");
        updateText.replacePlaceholder(questions.get(6), "Q7");
        updateText.replacePlaceholder(questions.get(7), "Q8");
        updateText.replacePlaceholder(questions.get(8), "Q9");

        Double VsegoProgolosovalo = Double.valueOf(userService.getAllByStatusTrue("1"));
        Double DolyVsegoProgolosovalo = userService.getAllByShareTrue("1");

        //--------------------- Вопрос 1 ---------------------------------
        long ProgolosovaloZa1 = userService.getAllCountByQ11();
        double ProgolosovaloZaDoly1 = userService.getAllSumByQ11();
        long ProgolosovaloProtiv1 = userService.getAllCountByQ12();
        double ProgolosovaloProtivDoly1 = userService.getAllSumByQ12();
        long ProgolosovaloVozder1 = userService.getAllCountByQ13();
        double ProgolosovaloVozderDoly1 = userService.getAllSumByQ13();
        String Za11 = String.format("%.3f" ,ProgolosovaloZa1 * 100 / VsegoProgolosovalo);
        String Za12 = String.format("%.3f" ,ProgolosovaloZaDoly1 * 100 / DolyVsegoProgolosovalo);
        String Protiv11 = String.format("%.3f" ,ProgolosovaloProtiv1 * 100 / VsegoProgolosovalo);
        String Protiv12 = String.format("%.3f" ,ProgolosovaloProtivDoly1 * 100 / DolyVsegoProgolosovalo);
        String Vozder11 = String.format("%.3f" ,ProgolosovaloVozder1 * 100 / VsegoProgolosovalo);
        String Vozder12 = String.format("%.3f" ,ProgolosovaloVozderDoly1 * 100 / DolyVsegoProgolosovalo);

        //--------------------- Вопрос 2 ---------------------------------
        long ProgolosovaloZa2 = userService.getAllCountByQ21();
        double ProgolosovaloZaDoly2 = userService.getAllSumByQ21();
        long ProgolosovaloProtiv2 = userService.getAllCountByQ22();
        double ProgolosovaloProtivDoly2 = userService.getAllSumByQ22();
        long ProgolosovaloVozder2 = userService.getAllCountByQ23();
        double ProgolosovaloVozderDoly2 = userService.getAllSumByQ23();
        String Za21 = String.format("%.3f" ,ProgolosovaloZa2 * 100 / VsegoProgolosovalo);
        String Za22 = String.format("%.3f" ,ProgolosovaloZaDoly2 * 100 / DolyVsegoProgolosovalo);
        String Protiv21 = String.format("%.3f" ,ProgolosovaloProtiv2 * 100 / VsegoProgolosovalo);
        String Protiv22 = String.format("%.3f" ,ProgolosovaloProtivDoly2 * 100 / DolyVsegoProgolosovalo);
        String Vozder21 = String.format("%.3f" ,ProgolosovaloVozder2 * 100 / VsegoProgolosovalo);
        String Vozder22 = String.format("%.3f" ,ProgolosovaloVozderDoly2 * 100 / DolyVsegoProgolosovalo);

        //--------------------- Вопрос 3 ---------------------------------
        long ProgolosovaloZa3 = userService.getAllCountByQ31();
        double ProgolosovaloZaDoly3 = userService.getAllSumByQ31();
        long ProgolosovaloProtiv3 = userService.getAllCountByQ32();
        double ProgolosovaloProtivDoly3 = userService.getAllSumByQ32();
        long ProgolosovaloVozder3 = userService.getAllCountByQ33();
        double ProgolosovaloVozderDoly3 = userService.getAllSumByQ33();
        String Za31 = String.format("%.3f" ,ProgolosovaloZa3 * 100 / VsegoProgolosovalo);
        String Za32 = String.format("%.3f" ,ProgolosovaloZaDoly3 * 100 / DolyVsegoProgolosovalo);
        String Protiv31 = String.format("%.3f" ,ProgolosovaloProtiv3 * 100 / VsegoProgolosovalo);
        String Protiv32 = String.format("%.3f" ,ProgolosovaloProtivDoly3 * 100 / DolyVsegoProgolosovalo);
        String Vozder31 = String.format("%.3f" ,ProgolosovaloVozder3 * 100 / VsegoProgolosovalo);
        String Vozder32 = String.format("%.3f" ,ProgolosovaloVozderDoly3 * 100 / DolyVsegoProgolosovalo);

        //--------------------- Вопрос 4 ---------------------------------
        long ProgolosovaloZa4 = userService.getAllCountByQ41();
        double ProgolosovaloZaDoly4 = userService.getAllSumByQ41();
        long ProgolosovaloProtiv4 = userService.getAllCountByQ42();
        double ProgolosovaloProtivDoly4 = userService.getAllSumByQ42();
        long ProgolosovaloVozder4 = userService.getAllCountByQ43();
        double ProgolosovaloVozderDoly4 = userService.getAllSumByQ43();
        String Za41 = String.format("%.3f" ,ProgolosovaloZa4 * 100 / VsegoProgolosovalo);
        String Za42 = String.format("%.3f" ,ProgolosovaloZaDoly4 * 100 / DolyVsegoProgolosovalo);
        String Protiv41 = String.format("%.3f" ,ProgolosovaloProtiv4 * 100 / VsegoProgolosovalo);
        String Protiv42 = String.format("%.3f" ,ProgolosovaloProtivDoly4 * 100 / DolyVsegoProgolosovalo);
        String Vozder41 = String.format("%.3f" ,ProgolosovaloVozder4 * 100 / VsegoProgolosovalo);
        String Vozder42 = String.format("%.3f" ,ProgolosovaloVozderDoly4 * 100 / DolyVsegoProgolosovalo);

        //--------------------- Вопрос 5 ---------------------------------
        long ProgolosovaloZa5 = userService.getAllCountByQ51();
        double ProgolosovaloZaDoly5 = userService.getAllSumByQ51();
        long ProgolosovaloProtiv5 = userService.getAllCountByQ52();
        double ProgolosovaloProtivDoly5 = userService.getAllSumByQ52();
        long ProgolosovaloVozder5 = userService.getAllCountByQ53();
        double ProgolosovaloVozderDoly5 = userService.getAllSumByQ53();
        String Za51 = String.format("%.3f" ,ProgolosovaloZa5 * 100 / VsegoProgolosovalo);
        String Za52 = String.format("%.3f" ,ProgolosovaloZaDoly5 * 100 / DolyVsegoProgolosovalo);
        String Protiv51 = String.format("%.3f" ,ProgolosovaloProtiv5 * 100 / VsegoProgolosovalo);
        String Protiv52 = String.format("%.3f" ,ProgolosovaloProtivDoly5 * 100 / DolyVsegoProgolosovalo);
        String Vozder51 = String.format("%.3f" ,ProgolosovaloVozder5 * 100 / VsegoProgolosovalo);
        String Vozder52 = String.format("%.3f" ,ProgolosovaloVozderDoly5 * 100 / DolyVsegoProgolosovalo);

        //--------------------- Вопрос 6 ---------------------------------
        long ProgolosovaloZa6 = userService.getAllCountByQ61();
        double ProgolosovaloZaDoly6 = userService.getAllSumByQ61();
        long ProgolosovaloProtiv6 = userService.getAllCountByQ62();
        double ProgolosovaloProtivDoly6 = userService.getAllSumByQ62();
        long ProgolosovaloVozder6 = userService.getAllCountByQ63();
        double ProgolosovaloVozderDoly6 = userService.getAllSumByQ63();
        String Za61 = String.format("%.3f" ,ProgolosovaloZa6 * 100 / VsegoProgolosovalo);
        String Za62 = String.format("%.3f" ,ProgolosovaloZaDoly6 * 100 / DolyVsegoProgolosovalo);
        String Protiv61 = String.format("%.3f" ,ProgolosovaloProtiv6 * 100 / VsegoProgolosovalo);
        String Protiv62 = String.format("%.3f" ,ProgolosovaloProtivDoly6 * 100 / DolyVsegoProgolosovalo);
        String Vozder61 = String.format("%.3f" ,ProgolosovaloVozder6 * 100 / VsegoProgolosovalo);
        String Vozder62 = String.format("%.3f" ,ProgolosovaloVozderDoly6 * 100 / DolyVsegoProgolosovalo);

        //--------------------- Вопрос 7 ---------------------------------
        long ProgolosovaloZa7 = userService.getAllCountByQ71();
        double ProgolosovaloZaDoly7 = userService.getAllSumByQ71();
        long ProgolosovaloProtiv7 = userService.getAllCountByQ72();
        double ProgolosovaloProtivDoly7 = userService.getAllSumByQ72();
        long ProgolosovaloVozder7 = userService.getAllCountByQ73();
        double ProgolosovaloVozderDoly7 = userService.getAllSumByQ73();
        String Za71 = String.format("%.3f" ,ProgolosovaloZa7 * 100 / VsegoProgolosovalo);
        String Za72 = String.format("%.3f" ,ProgolosovaloZaDoly7 * 100 / DolyVsegoProgolosovalo);
        String Protiv71 = String.format("%.3f" ,ProgolosovaloProtiv7 * 100 / VsegoProgolosovalo);
        String Protiv72 = String.format("%.3f" ,ProgolosovaloProtivDoly7 * 100 / DolyVsegoProgolosovalo);
        String Vozder71 = String.format("%.3f" ,ProgolosovaloVozder7 * 100 / VsegoProgolosovalo);
        String Vozder72 = String.format("%.3f" ,ProgolosovaloVozderDoly7 * 100 / DolyVsegoProgolosovalo);

        //--------------------- Вопрос 8 ---------------------------------
        long ProgolosovaloZa8 = userService.getAllCountByQ81();
        double ProgolosovaloZaDoly8 = userService.getAllSumByQ81();
        long ProgolosovaloProtiv8 = userService.getAllCountByQ82();
        double ProgolosovaloProtivDoly8 = userService.getAllSumByQ82();
        long ProgolosovaloVozder8 = userService.getAllCountByQ83();
        double ProgolosovaloVozderDoly8 = userService.getAllSumByQ83();
        String Za81 = String.format("%.3f" ,ProgolosovaloZa8 * 100 / VsegoProgolosovalo);
        String Za82 = String.format("%.3f" ,ProgolosovaloZaDoly8 * 100 / DolyVsegoProgolosovalo);
        String Protiv81 = String.format("%.3f" ,ProgolosovaloProtiv8 * 100 / VsegoProgolosovalo);
        String Protiv82 = String.format("%.3f" ,ProgolosovaloProtivDoly8 * 100 / DolyVsegoProgolosovalo);
        String Vozder81 = String.format("%.3f" ,ProgolosovaloVozder8 * 100 / VsegoProgolosovalo);
        String Vozder82 = String.format("%.3f" ,ProgolosovaloVozderDoly8 * 100 / DolyVsegoProgolosovalo);

        //--------------------- Вопрос 9 ---------------------------------
        long ProgolosovaloZa9 = userService.getAllCountByQ91();
        double ProgolosovaloZaDoly9 = userService.getAllSumByQ91();
        long ProgolosovaloProtiv9 = userService.getAllCountByQ92();
        double ProgolosovaloProtivDoly9 = userService.getAllSumByQ92();
        long ProgolosovaloVozder9 = userService.getAllCountByQ93();
        double ProgolosovaloVozderDoly9 = userService.getAllSumByQ93();
        String Za91 = String.format("%.3f" ,ProgolosovaloZa9 * 100 / VsegoProgolosovalo);
        String Za92 = String.format("%.3f" ,ProgolosovaloZaDoly9 * 100 / DolyVsegoProgolosovalo);
        String Protiv91 = String.format("%.3f" ,ProgolosovaloProtiv9 * 100 / VsegoProgolosovalo);
        String Protiv92 = String.format("%.3f" ,ProgolosovaloProtivDoly9 * 100 / DolyVsegoProgolosovalo);
        String Vozder91 = String.format("%.3f" ,ProgolosovaloVozder9 * 100 / VsegoProgolosovalo);
        String Vozder92 = String.format("%.3f" ,ProgolosovaloVozderDoly9 * 100 / DolyVsegoProgolosovalo);



        if(VsegoProgolosovalo >= 60 && DolyVsegoProgolosovalo >= 66.6) {
            updateText.replacePlaceholder("Собрание состоялось", "status");
            System.out.println("Собрание состоялось");
            updateText.replacePlaceholder(Integer.toString(userService.getAllByStatusTrue("1")), "vsego");
            updateText.replacePlaceholder(userService.getAllByShareTrue("1") + "%", "vsedol");
            System.out.println("Проголосовало " + userService.getAllByStatusTrue("1") + " собственников обладающие долей от общего имущества " + userService.getAllByShareTrue("1") + " %");

            //--------------------------------- Вопрос 1 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa1 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly1 >= DolyVsegoProgolosovalo/2)) {
                updateText.replacePlaceholder("Принят", "Q11");
                System.out.println("Вопрос 1 - Принят");
            } else {
                updateText.replacePlaceholder("Не принят", "Q11");
                System.out.println("Вопрос 1 - Не принят");
            }
            updateText.replacePlaceholder(Long.toString(ProgolosovaloZa1), "$111");
            updateText.replacePlaceholder(Za11, "$112");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloZaDoly1), "$113");
            updateText.replacePlaceholder(Za12, "$114");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloProtiv1), "$121");
            updateText.replacePlaceholder(Protiv11, "$122");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloProtivDoly1), "$123");
            updateText.replacePlaceholder(Protiv12, "$124");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloVozder1), "$131");
            updateText.replacePlaceholder(Vozder11, "$132");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloVozderDoly1), "$133");
            updateText.replacePlaceholder(Vozder12, "$134");

            System.out.println(questions.get(0));
            System.out.println("ЗА - " + ProgolosovaloZa1 + " (" + Za11 + "%)" + " человек обладающих долями = "+ ProgolosovaloZaDoly1 + " (" + Za12 + "%)");
            System.out.println("ПРОТИВ - " + ProgolosovaloProtiv1 + " (" + Protiv11 + "%)" + " человек обладающих долями = " + ProgolosovaloProtivDoly1 + " (" + Protiv12 + "%)");
            System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder1 + " (" + Vozder11 + "%)" + " человек обладающих долями = " + ProgolosovaloVozderDoly1 + " (" + Vozder12 + "%)");

            //--------------------------------- Вопрос 2 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa2 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly2 >= DolyVsegoProgolosovalo/2)) {
                updateText.replacePlaceholder("Принят", "Q21");
                System.out.println("Вопрос 2 - Принят");
            } else {
                updateText.replacePlaceholder("Не принят", "Q21");
                System.out.println("Вопрос 2 - Не принят");
            }
            updateText.replacePlaceholder(Long.toString(ProgolosovaloZa2), "$211");
            updateText.replacePlaceholder(Za21, "$212");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloZaDoly2), "$213");
            updateText.replacePlaceholder(Za22, "$214");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloProtiv2), "$221");
            updateText.replacePlaceholder(Protiv21, "$222");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloProtivDoly2), "$223");
            updateText.replacePlaceholder(Protiv22, "$224");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloVozder2), "$231");
            updateText.replacePlaceholder(Vozder21, "$232");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloVozderDoly2), "$233");
            updateText.replacePlaceholder(Vozder22, "$234");

            System.out.println(questions.get(1));
            System.out.println("ЗА - " + ProgolosovaloZa2 + " (" + Za21 + "%)" + " человек обладающих долями = "+ ProgolosovaloZaDoly2 + " (" + Za22 + "%)");
            System.out.println("ПРОТИВ - " + ProgolosovaloProtiv2 + " (" + Protiv21 + "%)" + " человек обладающих долями = " + ProgolosovaloProtivDoly2 + " (" + Protiv22 + "%)");
            System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder2 + " (" + Vozder21 + "%)" + " человек обладающих долями = " + ProgolosovaloVozderDoly2 + " (" + Vozder22 + "%)");

            //--------------------------------- Вопрос 3 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa3 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly3 >= DolyVsegoProgolosovalo/2)) {
                updateText.replacePlaceholder("Принят", "Q31");
                System.out.println("Вопрос 3 - Принят");
            } else {
                updateText.replacePlaceholder("Не принят", "Q31");
                System.out.println("Вопрос 3 - Не принят");
            }
            updateText.replacePlaceholder(Long.toString(ProgolosovaloZa3), "$311");
            updateText.replacePlaceholder(Za31, "$312");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloZaDoly3), "$313");
            updateText.replacePlaceholder(Za32, "$314");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloProtiv3), "$321");
            updateText.replacePlaceholder(Protiv31, "$322");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloProtivDoly3), "$323");
            updateText.replacePlaceholder(Protiv32, "$324");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloVozder3), "$331");
            updateText.replacePlaceholder(Vozder31, "$332");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloVozderDoly3), "$333");
            updateText.replacePlaceholder(Vozder32, "$334");

            System.out.println(questions.get(2));
            System.out.println("ЗА - " + ProgolosovaloZa3 + " (" + Za31 + "%)" + " человек обладающих долями = "+ ProgolosovaloZaDoly3 + " (" + Za32 + "%)");
            System.out.println("ПРОТИВ - " + ProgolosovaloProtiv3 + " (" + Protiv31 + "%)" + " человек обладающих долями = " + ProgolosovaloProtivDoly3 + " (" + Protiv32 + "%)");
            System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder3 + " (" + Vozder31 + "%)" + " человек обладающих долями = " + ProgolosovaloVozderDoly3 + " (" + Vozder32 + "%)");

            //--------------------------------- Вопрос 4 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa4 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly4 >= DolyVsegoProgolosovalo/2)) {
                updateText.replacePlaceholder("Принят", "Q41");
                System.out.println("Вопрос 4 - Принят");
            } else {
                updateText.replacePlaceholder("Не принят", "Q41");
                System.out.println("Вопрос 4 - Не принят");
            }
            updateText.replacePlaceholder(Long.toString(ProgolosovaloZa4), "$411");
            updateText.replacePlaceholder(Za41, "$412");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloZaDoly4), "$413");
            updateText.replacePlaceholder(Za42, "$414");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloProtiv4), "$421");
            updateText.replacePlaceholder(Protiv41, "$422");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloProtivDoly4), "$423");
            updateText.replacePlaceholder(Protiv42, "$424");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloVozder4), "$431");
            updateText.replacePlaceholder(Vozder41, "$432");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloVozderDoly4), "$433");
            updateText.replacePlaceholder(Vozder42, "$434");

            System.out.println(questions.get(3));
            System.out.println("ЗА - " + ProgolosovaloZa4 + " (" + Za41 + "%)" + " человек обладающих долями = "+ ProgolosovaloZaDoly4 + " (" + Za42 + "%)");
            System.out.println("ПРОТИВ - " + ProgolosovaloProtiv4 + " (" + Protiv41 + "%)" + " человек обладающих долями = " + ProgolosovaloProtivDoly4 + " (" + Protiv42 + "%)");
            System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder4 + " (" + Vozder41 + "%)" + " человек обладающих долями = " + ProgolosovaloVozderDoly2 + " (" + Vozder42 + "%)");

            //--------------------------------- Вопрос 5 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa5 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly5 >= DolyVsegoProgolosovalo/2)) {
                updateText.replacePlaceholder("Принят", "Q51");
                System.out.println("Вопрос 5 - Принят");
            } else {
                updateText.replacePlaceholder("Не принят", "Q51");
                System.out.println("Вопрос 5 - Не принят");
            }
            updateText.replacePlaceholder(Long.toString(ProgolosovaloZa5), "$511");
            updateText.replacePlaceholder(Za51, "$512");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloZaDoly5), "$513");
            updateText.replacePlaceholder(Za52, "$514");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloProtiv5), "$521");
            updateText.replacePlaceholder(Protiv51, "$522");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloProtivDoly5), "$523");
            updateText.replacePlaceholder(Protiv52, "$524");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloVozder5), "$531");
            updateText.replacePlaceholder(Vozder51, "$532");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloVozderDoly5), "$533");
            updateText.replacePlaceholder(Vozder52, "$534");

            System.out.println(questions.get(4));
            System.out.println("ЗА - " + ProgolosovaloZa5 + " (" + Za51 + "%)" + " человек обладающих долями = "+ ProgolosovaloZaDoly5 + " (" + Za52 + "%)");
            System.out.println("ПРОТИВ - " + ProgolosovaloProtiv5 + " (" + Protiv51 + "%)" + " человек обладающих долями = " + ProgolosovaloProtivDoly5 + " (" + Protiv52 + "%)");
            System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder5 + " (" + Vozder51 + "%)" + " человек обладающих долями = " + ProgolosovaloVozderDoly5 + " (" + Vozder52 + "%)");

            //--------------------------------- Вопрос 6 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa6 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly6 >= DolyVsegoProgolosovalo/2)) {
                updateText.replacePlaceholder("Принят", "Q61");
                System.out.println("Вопрос 6 - Принят");
            } else {
                updateText.replacePlaceholder("Не принят", "Q61");
                System.out.println("Вопрос 6 - Не принят");
            }
            updateText.replacePlaceholder(Long.toString(ProgolosovaloZa6), "$611");
            updateText.replacePlaceholder(Za61, "$612");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloZaDoly6), "$613");
            updateText.replacePlaceholder(Za62, "$614");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloProtiv6), "$621");
            updateText.replacePlaceholder(Protiv61, "$622");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloProtivDoly6), "$623");
            updateText.replacePlaceholder(Protiv62, "$624");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloVozder6), "$631");
            updateText.replacePlaceholder(Vozder61, "$632");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloVozderDoly6), "$633");
            updateText.replacePlaceholder(Vozder62, "$634");

            System.out.println(questions.get(5));
            System.out.println("ЗА - " + ProgolosovaloZa6 + " (" + Za61 + "%)" + " человек обладающих долями = "+ ProgolosovaloZaDoly6 + " (" + Za62 + "%)");
            System.out.println("ПРОТИВ - " + ProgolosovaloProtiv6 + " (" + Protiv61 + "%)" + " человек обладающих долями = " + ProgolosovaloProtivDoly6 + " (" + Protiv62 + "%)");
            System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder6 + " (" + Vozder61 + "%)" + " человек обладающих долями = " + ProgolosovaloVozderDoly6 + " (" + Vozder62 + "%)");

            //--------------------------------- Вопрос 7 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa7 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly7 >= DolyVsegoProgolosovalo/2)) {
                updateText.replacePlaceholder("Принят", "Q71");
                System.out.println("Вопрос 7 - Принят");
            } else {
                updateText.replacePlaceholder("Не принят", "Q71");
                System.out.println("Вопрос 7 - Не принят");
            }
            updateText.replacePlaceholder(Long.toString(ProgolosovaloZa7), "$711");
            updateText.replacePlaceholder(Za71, "$712");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloZaDoly7), "$713");
            updateText.replacePlaceholder(Za72, "$714");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloProtiv7), "$721");
            updateText.replacePlaceholder(Protiv71, "$722");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloProtivDoly7), "$723");
            updateText.replacePlaceholder(Protiv72, "$724");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloVozder7), "$731");
            updateText.replacePlaceholder(Vozder71, "$732");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloVozderDoly7), "$733");
            updateText.replacePlaceholder(Vozder72, "$734");

            System.out.println(questions.get(6));
            System.out.println("ЗА - " + ProgolosovaloZa7 + " (" + Za71 + "%)" + " человек обладающих долями = "+ ProgolosovaloZaDoly7 + " (" + Za72 + "%)");
            System.out.println("ПРОТИВ - " + ProgolosovaloProtiv7 + " (" + Protiv71 + "%)" + " человек обладающих долями = " + ProgolosovaloProtivDoly7 + " (" + Protiv72 + "%)");
            System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder7 + " (" + Vozder71 + "%)" + " человек обладающих долями = " + ProgolosovaloVozderDoly7 + " (" + Vozder72 + "%)");

            //--------------------------------- Вопрос 8 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa8 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly8 >= DolyVsegoProgolosovalo/2)) {
                updateText.replacePlaceholder("Принят", "Q81");
                System.out.println("Вопрос 8 - Принят");
            } else {
                updateText.replacePlaceholder("Не принят", "Q81");
                System.out.println("Вопрос 8 - Не принят");
            }
            updateText.replacePlaceholder(Long.toString(ProgolosovaloZa8), "$811");
            updateText.replacePlaceholder(Za81, "$812");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloZaDoly8), "$813");
            updateText.replacePlaceholder(Za82, "$814");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloProtiv8), "$821");
            updateText.replacePlaceholder(Protiv81, "$822");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloProtivDoly8), "$823");
            updateText.replacePlaceholder(Protiv82, "$824");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloVozder8), "$831");
            updateText.replacePlaceholder(Vozder81, "$832");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloVozderDoly8), "$833");
            updateText.replacePlaceholder(Vozder82, "$834");

            System.out.println(questions.get(7));
            System.out.println("ЗА - " + ProgolosovaloZa8 + " (" + Za81 + "%)" + " человек обладающих долями = "+ ProgolosovaloZaDoly8 + " (" + Za82 + "%)");
            System.out.println("ПРОТИВ - " + ProgolosovaloProtiv8 + " (" + Protiv81 + "%)" + " человек обладающих долями = " + ProgolosovaloProtivDoly8 + " (" + Protiv82 + "%)");
            System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder8 + " (" + Vozder81 + "%)" + " человек обладающих долями = " + ProgolosovaloVozderDoly8 + " (" + Vozder82 + "%)");

            //--------------------------------- Вопрос 9 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa9 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly9 >= DolyVsegoProgolosovalo/2)) {
                updateText.replacePlaceholder("Принят", "Q91");
                System.out.println("Вопрос 9 - Принят");
            } else {
                updateText.replacePlaceholder("Не принят", "Q91");
                System.out.println("Вопрос 9 - Не принят");
            }
            updateText.replacePlaceholder(Long.toString(ProgolosovaloZa9), "$911");
            updateText.replacePlaceholder(Za91, "$912");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloZaDoly9), "$913");
            updateText.replacePlaceholder(Za92, "$914");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloProtiv9), "$921");
            updateText.replacePlaceholder(Protiv91, "$922");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloProtivDoly9), "$923");
            updateText.replacePlaceholder(Protiv92, "$924");

            updateText.replacePlaceholder(Long.toString(ProgolosovaloVozder9), "$931");
            updateText.replacePlaceholder(Vozder91, "$932");
            updateText.replacePlaceholder(Double.toString(ProgolosovaloVozderDoly9), "$933");
            updateText.replacePlaceholder(Vozder92, "$934");

            System.out.println(questions.get(8));
            System.out.println("ЗА - " + ProgolosovaloZa9 + " (" + Za91 + "%)" + " человек обладающих долями = "+ ProgolosovaloZaDoly9 + " (" + Za92 + "%)");
            System.out.println("ПРОТИВ - " + ProgolosovaloProtiv9 + " (" + Protiv91 + "%)" + " человек обладающих долями = " + ProgolosovaloProtivDoly9 + " (" + Protiv92 + "%)");
            System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder9 + " (" + Vozder91 + "%)" + " человек обладающих долями = " + ProgolosovaloVozderDoly9 + " (" + Vozder92 + "%)");
            } else {
            updateText.replacePlaceholder("Собрание не состоялось", "status");
            System.out.println("Собрание не состоялось");
            updateText.replacePlaceholder(Integer.toString(userService.getAllByStatusTrue("1")), "vsego");
            System.out.println("Проголосовало " + userService.getAllByStatusTrue("1") + " собственников обладающие долей от общего имущества " + userService.getAllByShareTrue("1") + " %");

        }
    }
}