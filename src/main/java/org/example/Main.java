package org.example;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);

            Date now = new Date();
             var manu = "Hi, manu";

            System.out.println(manu);
            System.out.println(now);

//            independant values
            byte x = 1;
            byte y = x ;
            x = 2;
            System.out.println(y);
            System.out.println(x);

            Point point = new Point(1,1 );
            Point point2 = point;
            point.x = 3;
            System.out.println(point2);

//            string variable
//            strings are immutable in java
            String message = "Hello world" + "!!";
            System.out.println(message.endsWith("!!"));
            System.out.println(message.contains("!!"));
            System.out.println(message.startsWith("!!"));
            System.out.println(message.length());
            System.out.println(message.indexOf("H"));
            System.out.println(message.replace("H","K"));
            System.out.println(message);
            System.out.println(message.toLowerCase());

//            escape sequence
            String message1 = "Hello \"Manu\"";
            System.out.println(message1);

            String message2 = " c:\tWindows\\...";
            System.out.println(message2);


// arrays in java
//            Used to store a list of items.
//            arrays are fixed sizes in java

            int[] numbers = new int[5];
            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
            numbers[3] = 4;
            numbers[4] = 5;
            System.out.println(Arrays.toString(numbers));
            System.out.println(numbers);

            int[] newNumbers = { 2,3,4,5,6,7,8,-3};
            Arrays.sort(newNumbers);
            System.out.println(newNumbers.length);

//            nested arrays
            int[][] nestedNumbers = new int[2][3];
            nestedNumbers[0][0] = 1;
            System.out.println(Arrays.deepToString(nestedNumbers));

//            constants in java
            final float PI = 3.14f;
            System.out.println(PI);

//            formatting numbers
//            NumberFormat currency = new Num
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String result = currency.format(1234567.8901);
            System.out.println(result);

//            reading input from user

            Scanner scanner = new Scanner(System.in);
            System.out.println("Ask users age");
            String age = scanner.nextLine().trim();
            System.out.println("You are " + age);



        }


    }
}