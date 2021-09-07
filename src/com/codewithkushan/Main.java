package com.codewithkushan;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

//    static int x = 10;
//    int i = 8;
//    int j = 9;

    public static void main(String[] args) {

        int [] x = {1,2,3,4};
        int [] y = x;

        x = new int[3];

        for(int i=0; i < x.length; i++)
            System.out.print(y[i] + " ");



//        add();

//        byte B = 6;
//        B += 7;
//        System.out.println(B);
//        B = (byte) (B+7);
//        System.out.println(B);

//        Main main = new Main();
//        Main main1 = new Main();
//        main.x += 1;
//        System.out.println(main.x + main1.x);



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
//        int principal = 0;
//        float monthlyInterest = 0;
//        int numberOfPayments = 0;
//
//        Scanner scanner = new Scanner(System.in);
//
//        while(true) {
//            System.out.print("Principal: ");
//            principal = scanner.nextInt();
//            if(principal >= 1000 && principal <= 1_000_000)
//                break;
//            System.out.println("Enter value between 1000 and 1000000");
//        }
//
//        while(true) {
//            System.out.print("Annual Interest Rate: ");
//            float annualInterest = scanner.nextFloat();
//            if(annualInterest >= 1 && annualInterest <= 30){
//                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//                break;
//            }
//            System.out.println("Enter value between 1 and 30");
//        }
//
//        while (true) {
//            System.out.print("Period (yesrs): ");
//            byte years = scanner.nextByte();
//            if(years >= 1 && years <= 30) {
//                numberOfPayments = years * MONTHS_IN_YEAR;
//                break;
//            }
//            System.out.println("Enter value between 1 and 30");
//        }
//
//        double mortgage = principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1));
//
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.print("Mortgage: " + mortgageFormatted);

//        *************** sample project end*****************


//        int temp = 12;
//        boolean isWarm = temp > 20 && temp < 30;            //AND operator
//        System.out.println(isWarm);
//
//        boolean highIncome = true;
//        boolean goodCredit = true;
//        boolean criminalRecord = false;
//        boolean isEligible = (highIncome || goodCredit) && !criminalRecord;              //OR operator
//        System.out.println(isEligible);

//        int temp = 25;
//        if (temp > 30){
//            System.out.println("Hot day");
//            System.out.println("Drink water");
//        }
//        else if (temp > 20)
//            System.out.println("Beautiful day");
//        else
//            System.out.println("Cold day");


//        int income = 20_000;
//        String className = income > 100_000 ? "First" : "Economy";
//        System.out.println(className);

//        String role = "admin";
//        switch(role) {
//            case "admin" :
//                System.out.println("you are admin");
//                break;
//
//            case "moderator":
//                System.out.println("you are moderator");
//                break;
//
//            default:
//                System.out.println("You are guest");
//
//        }


//        *************** simple project *****************

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("number: ");
//        int number = scanner.nextInt();
//
//        if(number % 5 == 0 && number % 3 == 0)
//            System.out.println("FizzBuzz");
//        else if(number % 3 == 0)
//            System.out.println("Buzz");
//        else if(number % 5 == 0)
//            System.out.println("Fizz");
//        else
//            System.out.println(number);


//        for (int i = 0; i<5; i++)
//            System.out.println("Hello World " + i);



//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while(!input.equals("quit")){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }


//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        do{
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        }while(!input.equals("quit"));


//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while(!input.equals("quit")){
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if(input.equals("pass"))
//                continue;
//            if(input.equals("quit"))
//                break;
//            System.out.println(input);
//        }

//        String[] fruits = {"Apple", "Mango", "Banana"};
//
//        for(String fruit : fruits)
//            System.out.println(fruit);



    }

//    public static void add(){
//        int k = i+j;
//        System.out.println(k);
//    }
}
