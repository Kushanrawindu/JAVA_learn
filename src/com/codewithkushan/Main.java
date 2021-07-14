package com.codewithkushan;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

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

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String x = currency.format(1234567.891);
        System.out.println(x);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String y = percent.format(0.1);
        System.out.println(y);

        String a = NumberFormat.getCurrencyInstance().format(9876543.213);
        System.out.println(a);


    }
}
