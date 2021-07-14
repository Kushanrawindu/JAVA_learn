package com.codewithkushan;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Date now = new Date();
//        System.out.println(now);

//        String message = "Hello World" + "!!";
//        System.out.println(message.replace("W","w"));

//        String msg1 = "Hello \"Kushan\"";
//        String msg2 = "Hello \tKushan";
//        System.out.println(msg1+msg2);

//        int [] numbers = {2,5,4,1,3};
//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

//        int [][] numbers = new int[2][3];
//        int [][] numbers = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(Arrays.deepToString(numbers));

//        double val = (double)10 / (double)3;
//        System.out.println(val);

//        int x =1;
//        int y = ++x;
//        System.out.println(x);
//        System.out.println(y);

//        short x = 1;
//        int y = x + 2;                                //implicit casting
//        System.out.println(y);
//
//        double a = 1.1;
//        int b = (int)a + 2;                          //explicit casting
//        System.out.println(b);
//
//        String i = "1";
//        int j = Integer.parseInt(i) + 2;
//        System.out.println(j);

//        int result = (int) (Math.random() * 100);
//        System.out.println(result);
//
//        int x = Math.max(1, 2);
//        System.out.println(x);
//
//        double y = Math.ceil(2.1);
//        System.out.println(y);

//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String x = currency.format(1234567.891);
//        System.out.println(x);
//
//        NumberFormat percent = NumberFormat.getPercentInstance();
//        String y = percent.format(0.1);
//        System.out.println(y);
//
//        String a = NumberFormat.getCurrencyInstance().format(9876543.213);              //short way
//        System.out.println(a);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Age: ");
//        byte age = scanner.nextByte();
//        System.out.println("You are " + age);
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = sc.nextLine();
//        System.out.println("I am " + name);

//        *************** sample project starts*****************

//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Principal: ");
//        int principal = scanner.nextInt();
//
//        System.out.print("Annual Interest Rate: ");
//        float annualInterest = scanner.nextFloat();
//        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//
//        System.out.print("Period (yesrs): ");
//        byte years = scanner.nextByte();
//        int numberOfPayments = years * MONTHS_IN_YEAR;
//
//        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
//
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.print("Mortgage: " + mortgageFormatted);

//        *************** sample project end*****************


        int temp = 12;
        boolean isWarm = temp > 20 && temp < 30;            //AND operator
        System.out.println(isWarm);

        boolean highIncome = true;
        boolean goodCredit = true;
        boolean criminalRecord = false;
        boolean isEligible = (highIncome || goodCredit) && !criminalRecord;              //OR operator
        System.out.println(isEligible);


    }
}
