package com.r00t.temp.mk1;

import java.util.Arrays;

public class Functions {

    private static void f0() {
    }

    protected static void f1() {
    }

    public static void f2() {
    }

    // ================================================================================================================

    private void f3() {
    }

    protected void f4() {
    }

    public void f5() {
    }

    // ================================================================================================================

    public int f6() {
        return 10;
    }

    public String f7() {
        return "Ece";
    }

    // ================================================================================================================

    public int f8(int age) {
        return age * 2;
    }

    public String f9(String name) {
        return "Merhaba " + name;
    }

    // ================================================================================================================

    public int f10(int... ages) {
        return Arrays.stream(ages)
                     .sum();
    }
}
