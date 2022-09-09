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

        //--------------------- Вопрос 2 ---------------------------------
        long ProgolosovaloZa2 = userService.getAllCountByQ21();
        Double ProgolosovaloZaDoly2 = userService.getAllSumByQ21();
        long ProgolosovaloProtiv2 = userService.getAllCountByQ22();
        Double ProgolosovaloProtivDoly2 = userService.getAllSumByQ22();
        long ProgolosovaloVozder2 = userService.getAllCountByQ23();
        Double ProgolosovaloVozderDoly2 = userService.getAllSumByQ23();

        //--------------------- Вопрос 3 ---------------------------------
        long ProgolosovaloZa3 = userService.getAllCountByQ31();
        Double ProgolosovaloZaDoly3 = userService.getAllSumByQ31();
        long ProgolosovaloProtiv3 = userService.getAllCountByQ32();
        Double ProgolosovaloProtivDoly3 = userService.getAllSumByQ32();
        long ProgolosovaloVozder3 = userService.getAllCountByQ33();
        Double ProgolosovaloVozderDoly3 = userService.getAllSumByQ33();

        //--------------------- Вопрос 4 ---------------------------------
        long ProgolosovaloZa4 = userService.getAllCountByQ41();
        Double ProgolosovaloZaDoly4 = userService.getAllSumByQ41();
        long ProgolosovaloProtiv4 = userService.getAllCountByQ42();
        Double ProgolosovaloProtivDoly4 = userService.getAllSumByQ42();
        long ProgolosovaloVozder4 = userService.getAllCountByQ43();
        Double ProgolosovaloVozderDoly4 = userService.getAllSumByQ43();

        //--------------------- Вопрос 5 ---------------------------------
        long ProgolosovaloZa5 = userService.getAllCountByQ51();
        Double ProgolosovaloZaDoly5 = userService.getAllSumByQ51();
        long ProgolosovaloProtiv5 = userService.getAllCountByQ52();
        Double ProgolosovaloProtivDoly5 = userService.getAllSumByQ52();
        long ProgolosovaloVozder5 = userService.getAllCountByQ53();
        Double ProgolosovaloVozderDoly5 = userService.getAllSumByQ53();

        //--------------------- Вопрос 6 ---------------------------------
        long ProgolosovaloZa6 = userService.getAllCountByQ61();
        Double ProgolosovaloZaDoly6 = userService.getAllSumByQ61();
        long ProgolosovaloProtiv6 = userService.getAllCountByQ62();
        Double ProgolosovaloProtivDoly6 = userService.getAllSumByQ62();
        long ProgolosovaloVozder6 = userService.getAllCountByQ63();
        Double ProgolosovaloVozderDoly6 = userService.getAllSumByQ63();

        //--------------------- Вопрос 7 ---------------------------------
        long ProgolosovaloZa7 = userService.getAllCountByQ71();
        Double ProgolosovaloZaDoly7 = userService.getAllSumByQ71();
        long ProgolosovaloProtiv7 = userService.getAllCountByQ72();
        Double ProgolosovaloProtivDoly7 = userService.getAllSumByQ72();
        long ProgolosovaloVozder7 = userService.getAllCountByQ73();
        Double ProgolosovaloVozderDoly7 = userService.getAllSumByQ73();

        //--------------------- Вопрос 8 ---------------------------------
        long ProgolosovaloZa8 = userService.getAllCountByQ81();
        Double ProgolosovaloZaDoly8 = userService.getAllSumByQ81();
        long ProgolosovaloProtiv8 = userService.getAllCountByQ82();
        Double ProgolosovaloProtivDoly8 = userService.getAllSumByQ82();
        long ProgolosovaloVozder8 = userService.getAllCountByQ83();
        Double ProgolosovaloVozderDoly8 = userService.getAllSumByQ83();

        //--------------------- Вопрос 9 ---------------------------------
        long ProgolosovaloZa9 = userService.getAllCountByQ91();
        Double ProgolosovaloZaDoly9 = userService.getAllSumByQ91();
        long ProgolosovaloProtiv9 = userService.getAllCountByQ92();
        Double ProgolosovaloProtivDoly9 = userService.getAllSumByQ92();
        long ProgolosovaloVozder9 = userService.getAllCountByQ93();
        Double ProgolosovaloVozderDoly9 = userService.getAllSumByQ93();



        if(VsegoProgolosovalo >= 60 && DolyVsegoProgolosovalo >= 66.6) {
            System.out.println("Собрание состоялось");
            System.out.println("Проголосовало " + userService.getAllByStatusTrue("1") + " собственников обладающие долей от общего имущества " + userService.getAllByShareTrue("1") + " %");

            //--------------------------------- Вопрос 1 ---------------------------------------------
            System.out.println();
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

            //--------------------------------- Вопрос 2 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa2 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly2 >= DolyVsegoProgolosovalo/2)) {
                System.out.println("Вопрос 2 - Принят");
                System.out.println("ЗА - " + ProgolosovaloZa2 + " человек обладающих долями = "+ ProgolosovaloZaDoly2 + "%, что составляет " + (ProgolosovaloZaDoly2*100/DolyVsegoProgolosovalo) + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv2 + " человек обладающих долями = " + ProgolosovaloProtivDoly2 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder2 + " человек обладающих долями = " + ProgolosovaloVozderDoly2 + "%");
            } else {
                System.out.println("Вопрос 2 - Не принят");
                System.out.println("ЗА - " + ProgolosovaloZa2 + " человек обладающих долями = " + ProgolosovaloZaDoly2 + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv2 + " человек обладающих долями = " + ProgolosovaloProtivDoly2 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder2 + " человек обладающих долями = " + ProgolosovaloVozderDoly2 + "%");
            }

            //--------------------------------- Вопрос 3 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa3 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly3 >= DolyVsegoProgolosovalo/2)) {
                System.out.println("Вопрос 3 - Принят");
                System.out.println("ЗА - " + ProgolosovaloZa3 + " человек обладающих долями = "+ ProgolosovaloZaDoly3 + "%, что составляет " + (ProgolosovaloZaDoly3*100/DolyVsegoProgolosovalo) + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv3 + " человек обладающих долями = " + ProgolosovaloProtivDoly3 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder3 + " человек обладающих долями = " + ProgolosovaloVozderDoly3 + "%");
            } else {
                System.out.println("Вопрос 3 - Не принят");
                System.out.println("ЗА - " + ProgolosovaloZa3 + " человек обладающих долями = " + ProgolosovaloZaDoly3 + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv3 + " человек обладающих долями = " + ProgolosovaloProtivDoly3 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder3 + " человек обладающих долями = " + ProgolosovaloVozderDoly3 + "%");
            }

            //--------------------------------- Вопрос 4 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa4 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly4 >= DolyVsegoProgolosovalo/2)) {
                System.out.println("Вопрос 4 - Принят");
                System.out.println("ЗА - " + ProgolosovaloZa4 + " человек обладающих долями = "+ ProgolosovaloZaDoly4 + "%, что составляет " + (ProgolosovaloZaDoly4*100/DolyVsegoProgolosovalo) + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv4 + " человек обладающих долями = " + ProgolosovaloProtivDoly4 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder4 + " человек обладающих долями = " + ProgolosovaloVozderDoly4 + "%");
            } else {
                System.out.println("Вопрос 4 - Не принят");
                System.out.println("ЗА - " + ProgolosovaloZa4 + " человек обладающих долями = " + ProgolosovaloZaDoly4 + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv4 + " человек обладающих долями = " + ProgolosovaloProtivDoly4 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder4 + " человек обладающих долями = " + ProgolosovaloVozderDoly4 + "%");
            }

            //--------------------------------- Вопрос 5 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa5 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly5 >= DolyVsegoProgolosovalo/2)) {
                System.out.println("Вопрос 5 - Принят");
                System.out.println("ЗА - " + ProgolosovaloZa5 + " человек обладающих долями = "+ ProgolosovaloZaDoly5 + "%, что составляет " + (ProgolosovaloZaDoly5*100/DolyVsegoProgolosovalo) + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv5 + " человек обладающих долями = " + ProgolosovaloProtivDoly5 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder5 + " человек обладающих долями = " + ProgolosovaloVozderDoly5 + "%");
            } else {
                System.out.println("Вопрос 5 - Не принят");
                System.out.println("ЗА - " + ProgolosovaloZa5 + " человек обладающих долями = " + ProgolosovaloZaDoly5 + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv5 + " человек обладающих долями = " + ProgolosovaloProtivDoly5 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder5 + " человек обладающих долями = " + ProgolosovaloVozderDoly5 + "%");
            }

            //--------------------------------- Вопрос 6 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa6 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly6 >= DolyVsegoProgolosovalo/2)) {
                System.out.println("Вопрос 6 - Принят");
                System.out.println("ЗА - " + ProgolosovaloZa6 + " человек обладающих долями = "+ ProgolosovaloZaDoly6 + "%, что составляет " + (ProgolosovaloZaDoly6*100/DolyVsegoProgolosovalo) + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv6 + " человек обладающих долями = " + ProgolosovaloProtivDoly6 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder6 + " человек обладающих долями = " + ProgolosovaloVozderDoly6 + "%");
            } else {
                System.out.println("Вопрос 6 - Не принят");
                System.out.println("ЗА - " + ProgolosovaloZa6 + " человек обладающих долями = " + ProgolosovaloZaDoly6 + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv6 + " человек обладающих долями = " + ProgolosovaloProtivDoly6 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder6 + " человек обладающих долями = " + ProgolosovaloVozderDoly6 + "%");
            }

            //--------------------------------- Вопрос 7 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa7 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly7 >= DolyVsegoProgolosovalo/2)) {
                System.out.println("Вопрос 7 - Принят");
                System.out.println("ЗА - " + ProgolosovaloZa7 + " человек обладающих долями = "+ ProgolosovaloZaDoly7 + "%, что составляет " + (ProgolosovaloZaDoly7*100/DolyVsegoProgolosovalo) + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv7 + " человек обладающих долями = " + ProgolosovaloProtivDoly7 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder7 + " человек обладающих долями = " + ProgolosovaloVozderDoly7 + "%");
            } else {
                System.out.println("Вопрос 7 - Не принят");
                System.out.println("ЗА - " + ProgolosovaloZa7 + " человек обладающих долями = " + ProgolosovaloZaDoly7 + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv7 + " человек обладающих долями = " + ProgolosovaloProtivDoly7 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder7 + " человек обладающих долями = " + ProgolosovaloVozderDoly7 + "%");
            }

            //--------------------------------- Вопрос 8 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa8 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly8 >= DolyVsegoProgolosovalo/2)) {
                System.out.println("Вопрос 8 - Принят");
                System.out.println("ЗА - " + ProgolosovaloZa8 + " человек обладающих долями = "+ ProgolosovaloZaDoly8 + "%, что составляет " + (ProgolosovaloZaDoly8*100/DolyVsegoProgolosovalo) + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv8 + " человек обладающих долями = " + ProgolosovaloProtivDoly8 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder8 + " человек обладающих долями = " + ProgolosovaloVozderDoly8 + "%");
            } else {
                System.out.println("Вопрос 8 - Не принят");
                System.out.println("ЗА - " + ProgolosovaloZa8 + " человек обладающих долями = " + ProgolosovaloZaDoly8 + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv8 + " человек обладающих долями = " + ProgolosovaloProtivDoly8 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder8 + " человек обладающих долями = " + ProgolosovaloVozderDoly8 + "%");
            }

            //--------------------------------- Вопрос 9 ---------------------------------------------
            System.out.println();
            if ((ProgolosovaloZa9 >= VsegoProgolosovalo/2) && (ProgolosovaloZaDoly9 >= DolyVsegoProgolosovalo/2)) {
                System.out.println("Вопрос 9 - Принят");
                System.out.println("ЗА - " + ProgolosovaloZa9 + " человек обладающих долями = "+ ProgolosovaloZaDoly9 + "%, что составляет " + (ProgolosovaloZaDoly9*100/DolyVsegoProgolosovalo) + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv9 + " человек обладающих долями = " + ProgolosovaloProtivDoly9 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder9 + " человек обладающих долями = " + ProgolosovaloVozderDoly9 + "%");
            } else {
                System.out.println("Вопрос 9 - Не принят");
                System.out.println("ЗА - " + ProgolosovaloZa9 + " человек обладающих долями = " + ProgolosovaloZaDoly9 + "%");
                System.out.println("ПРОТИВ - " + ProgolosovaloProtiv9 + " человек обладающих долями = " + ProgolosovaloProtivDoly9 + "%");
                System.out.println("ВОЗДЕРЖАЛОСЬ - " + ProgolosovaloVozder9 + " человек обладающих долями = " + ProgolosovaloVozderDoly9 + "%");
            }
        } else {
            System.out.println("Собрание не состоялось");
            System.out.println("Проголосовало " + userService.getAllByStatusTrue("1") + " собственников обладающие долей от общего имущества " + userService.getAllByShareTrue("1") + " %");

        }
    }
}