//Автор кода:
//Сокольский Михаил
//+7 926 8645511
//mysokolsky@gmail.com


import java.util.Scanner;



public class FirstProgram {

    private static Scanner input;

    public static void main(String[] args){
        System.out.println();

//        System.out.println("Hello, world!");
//        System.out.println("2+3");
//        System.out.println(2*3);
//
//        byte age = 18;
//        String name = "Вася";
//        char c = '%';
//        System.out.println("Вас зовут " + name + "! И Вам " + age + " лет!");
//
//        String text = "Привет, мой дорогой друг!";
//        System.out.println("Длина строки: " + text.length());
//        String s = "V";
//        String e = "!";
//        char c = 'о';
//        char c2 = 'Ы';
//
//        System.out.println("Cтрока начинается с символа " + s + " ?  " + text.startsWith(s));
//        System.out.println("Cтрока заканчивается на символ " + e + " ?  " + text.endsWith(e));
//        System.out.println("Замена символа " + c + " на символ  " + c2 + " :");
//        System.out.println(text.replace( c, c2));


//
//          Домашнее задание к 1 занятию:
//
//        1) Написать программу определяющую по значению переменной время года.
//        Решение представить с использованием операторов if и switch (2 варианта).
//        Сделать проверку данных на корректность (месяцы 1 -12)
//

//        byte month = 5;

        System.out.print("Введи номер месяца: ");

        input = new Scanner(System.in);
        byte month = input.nextByte();

        System.out.println();


        String checkmonth = (month < 1 || month > 12) ? "Не верное число. Введи месяц от 1 до 12" : "Всё в порядке, теперь определим время года.";

        System.out.println("Проверка с тернарным оператором: " + checkmonth);
        System.out.println();



        System.out.println("Решение с оператором условия if:");

        if ((month >= 1 && month <3) || month == 12 ) {
        System.out.println("зима :(");
        }
        if (month>2 && month <6) {
        System.out.println("Весна!");
        }
        if (month>5 && month <9) {
        System.out.println("ЛЕТО!!!");
        }
        if (month>8 && month <12) {
        System.out.println("Осень...");
        }
        if (month<1 || month >12) {
        System.out.println("Неправильно. Задай номер месяца от 1 до 12.");
        }

        System.out.println();


        System.out.println("Решение с оператором условия switch:");


        switch (month) {
            case 1,2,12:
                System.out.println("зима :(");
                break;
            case 3,4,5:
                System.out.println("Весна!");
                break;
            case 6,7,8:
                System.out.println("ЛЕТО!!!");
                break;
            case 9, 10, 11:
                System.out.println("Осень...");
                break;
            default:
                System.out.println("Неправильно. Задай номер месяца от 1 до 12.");
        }


//        2) Вспомним школу - написать программу для решения квадратного уравнения)
//        Коэффициенты задаются в виде переменных.

        System.out.println();
        System.out.println();
        System.out.println("Задача 2: решим квадратное уравнение");
        System.out.println();

        float a = 2F;
        float b = -5F;
        float c = 0;
        float D = b*b - 4*a*c;
        double x1, x2;

        if (D > 0F) {
            System.out.println("Уравнение имеет 2 корня:");
            x1 = (-b + Math.sqrt(D)) / (2 * a);
            x2 = (-b - Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }
        if (D == 0F) {
            System.out.println("Уравнение имеет 1 корень = " + (-b / (2 * a)));
        }
        if (D<0F) {
            System.out.println("Уравнение не имеет решения");
        }






    }
}
