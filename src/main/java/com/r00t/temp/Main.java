package com.r00t.temp;

public class Main {

    public static void main(String[] args) {
        Object o = "test";
        switch (o) {
            case String s -> System.out.println(s);
            default -> throw new IllegalStateException("Unexpected value: " + o);
        }
    }
}
