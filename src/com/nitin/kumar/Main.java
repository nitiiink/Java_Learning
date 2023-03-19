package com.nitin.kumar;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //primitve type
        int age = 23;

        //reference type
        Date now = new Date();
        System.out.println("The current date is" + now);

        //eg for string
        String test = "Hello" + "!!";
        System.out.println(test.endsWith("!!"));

        //escape sequence \ (backslash) (\n (nextLine) (\t tab)
        System.out.println("C:\\Windows\\ProgramFiles");
        System.out.print("this will print the line in next line \n");
        System.out.print("this will tab \t everything next to it \n");

        //Arrays
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 12;
        System.out.println(Arrays.toString(numbers));
    }
}