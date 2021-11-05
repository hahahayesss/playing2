package com.r00t.temp.mk1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Loops {

    public static void forLoop() {

        int[] integerArray = new int[5];
        integerArray[0] = 0;
        integerArray[1] = 1;
        integerArray[2] = 2;
        integerArray[3] = 3;
        integerArray[4] = 4;

        for (int x = 0; x < 5; x++) {
            System.out.println(integerArray[x]);
        }

        for (int x = 0; x < 5 / 2; x += 2) {
            System.out.println(integerArray[x]);
        }

        for (int x = 4; x >= 0; x--) {
            System.out.println(integerArray[x]);
        }

        for (int x : integerArray) {
            System.out.println(x);
        }

    }

    public static void whileLoop() {

        int[] integerArray = new int[5];
        integerArray[0] = 0;
        integerArray[1] = 1;
        integerArray[2] = 2;
        integerArray[3] = 3;
        integerArray[4] = 4;

        int counter = 0;
        while (counter < 5) {
            System.out.println(integerArray[counter]);
            counter++;
        }

        List<Integer> integerList = new ArrayList<>();
        integerList.add(0);
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        ListIterator<Integer> iterator = integerList.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }

    public static void lambda() {

        int[] integerArray = new int[5];
        integerArray[0] = 0;
        integerArray[1] = 1;
        integerArray[2] = 2;
        integerArray[3] = 3;
        integerArray[4] = 4;

        Arrays.stream(integerArray)
              .forEach(value -> System.out.println(value));

        Arrays.stream(integerArray)
              .forEach(System.out::println);

        IntStream.range(0, 5)
                 .forEach(System.out::println);

        IntStream.of(0, 1, 2, 3, 4)
                 .forEach(System.out::println);

        IntStream.range(0, 5)
                 .filter(n -> n % 2 == 0)
                 .forEach(System.out::println);

        List<Integer> integerList = List.of(0, 1, 2, 3, 4);

        List<Integer> integerList2 = IntStream.range(0, 5)
                                              .boxed()
                                              .collect(Collectors.toList());

    }
}
