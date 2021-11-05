package com.r00t.temp.mk1;

public class Conditions {

    public static void ifConditions() {

        int age = 5;
        if (age == 5) {
            System.out.println("Age: 5");
        }

        if (age < 5) {
            System.out.println("Age smaller than 5");
        } else if (age > 5) {
            System.out.println("Age bigger than 5");
        } else {
            System.out.println("Age is 5");
        }

        // ============================================================================================================

        String name = "Ahmet";
        if (name.equals("Ahmet")) {
            System.out.println("Your name is Ahmet");
        }

        if (name.equals("Mehmet")) {
            System.out.println("Your name is Mehmet");
        } else if (name.equals("Hasan")) {
            System.out.println("Your name is Hasan");
        } else {
            System.out.println("I don't know your name");
        }

        // = with JDK 16 ==============================================================================================

        Object temp = "qwe";
        if (temp instanceof String s) {
            System.out.println(s);
        }

        if (temp instanceof String s) {
            System.out.println(s);
        } else if (temp instanceof Integer i) {
            System.out.println(i + 2);
        } else {
            System.out.println("I don't know what the object is");
        }

    }

    public static void switchConditions() {

        int day = 3;
        switch (day) {
            case 0:
                System.out.println("Pazartesi");
                break;
            case 1:
                System.out.println("Salı");
                break;
            case 2:
                System.out.println("Çarşamba");
                break;
            case 3:
                System.out.println("Perşembe");
                break;
            case 4:
                System.out.println("Cumar");
                break;
            case 5:
                System.out.println("Cumartesi");
                break;
            case 6:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("I don't know what day it is");
                break;
        }

        // = with JDK 16 ==============================================================================================

        switch (day) {
            case 0 -> System.out.println("Pazartesi");
            case 1 -> System.out.println("Salı");
            case 2 -> System.out.println("Çarşamba");
            case 3 -> System.out.println("Perşembe");
            case 4 -> System.out.println("Cumar");
            case 5 -> System.out.println("Cumartesi");
            case 6 -> System.out.println("Pazar");
            default -> System.out.println("I don't know what day it is");
        }

        String temp = switch (day) {
            case 0 -> "Pazartesi";
            case 1 -> "Salı";
            case 2 -> "Çarşamba";
            case 3 -> "Perşembe";
            case 4 -> "Cumar";
            case 5 -> "Cumartesi";
            case 6 -> "Pazar";
            default -> "I don't know what day it is";
        };
        System.out.println(temp);

        // = with JDK 17 ==============================================================================================

        Object o = "Ahmet";
        switch (o) {
            case String s -> System.out.println(s);
            case Integer i -> System.out.println(i + 2);
            default -> throw new IllegalStateException("Unexpected value: " + o);
        }
    }
}
