package com.example.cucumberspring1.library;

import java.util.Arrays;

public class Nedbank {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Matt");
        int[] array = {19, 12, 1, 32, 48, 44, 40, 1, 6, 8};
        int temp;

        for (int i = 1; i < array.length; i++) {
            for (int j = i; j < 0; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("-- Nhlanhla Version --");
        Arrays.stream(array)
                .sorted()
                .forEach(System.out::println);
    }
}
