package by.nahodkin.tslosika4telegrambot.podschet;

import by.nahodkin.tslosika4telegrambot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Podschet {
    @Autowired
    private UserService userService;


    public void protocol() {

        Integer VsegoProgolosovalo = userService.getAllByStatusTrue("1");
        Double DolyVsegoProgolosovalo = userService.getAllByShareTrue("1");

        //--------------------- Вопрос 1 ---------------------------------
        long ProgolosovaloZa1 = userService.getAllCountByQ11();
        Double ProgolosovaloZaDoly1 = userService.getAllSumByQ11();
        long ProgolosovaloProtiv1 = userService.getAllCountByQ12();
        Double ProgolosovaloProtivDoly1 = userService.getAllSumByQ12();
        long ProgolosovaloVozder1 = userService.getAllCountByQ13();
        Double ProgolosovaloVozderDoly1 = userService.getAllSumByQ13();


        if(VsegoProgolosovalo >= 60 && DolyVsegoProgolosovalo >= 66.6) {
            System.out.println("Собрание состоялось");
            System.out.println("Проголосовало " + userService.getAllByStatusTrue("1") + " собственников обладающие долей от общего имущества " + userService.getAllByShareTrue("1") + " %");

            if ((ProgolosovaloZa1 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly1 >= DolyVsegoProgolosovalo/2)) {
                System.out.println("Вопрос 1 - Принят");
                System.out.println("ЗА - " + ProgolosovaloZa1 + " человек обладающих долями = "+ ProgolosovaloZaDoly1 + "%, что составляет " + (ProgolosovaloZaDoly1*100/DolyVsegoProgolosovalo) + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv1 + " человек обладающих долями = " + ProgolosovaloProtivDoly1 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder1 + " человек обладающих долями = " + ProgolosovaloVozderDoly1 + "%");
            } else {
                System.out.println("Вопрос 1 - Не принят");
                System.out.println("ЗА - " + ProgolosovaloZa1 + " человек обладающих долями = " + ProgolosovaloZaDoly1 + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv1 + " человек обладающих долями = " + ProgolosovaloProtivDoly1 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder1 + " человек обладающих долями = " + ProgolosovaloVozderDoly1 + "%");
            }




        } else {
            System.out.println("Собрание не состоялось");
            System.out.println("Проголосовало " + userService.getAllByStatusTrue("1") + " собственников обладающие долей от общего имущества " + userService.getAllByShareTrue("1") + " %");

        }
    }
}
