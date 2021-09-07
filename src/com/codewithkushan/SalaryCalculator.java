package com.codewithkushan;

import java.util.Scanner;

public class SalaryCalculator {
    public static double salaryCalc(double hoursPerWeek, double moneyPerHour) {

        double weeklyPayment = hoursPerWeek * moneyPerHour;
        return weeklyPayment * 52;

//        System.out.println("No Of Hours per week");
//        Scanner input1 = new Scanner(System.in);
//
//        System.out.println("Money per hour");
//        Scanner input2 = new Scanner(System.in);


    }

    public static void main(String[] args) {
        double salary = salaryCalc(48,15);
        System.out.println(salary);
    }
}
