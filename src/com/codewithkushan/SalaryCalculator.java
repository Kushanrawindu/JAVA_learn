package com.codewithkushan;

import java.util.Scanner;

public class SalaryCalculator {
    public static double salaryCalc(double hoursPerWeek, double moneyPerHour, double vacationDays) {

        if( hoursPerWeek < 0){
            return -1;
        }

        if(moneyPerHour < 0){
            return -1;
        }


        double weeklyPayment = hoursPerWeek * moneyPerHour;
        double unpaidTime = vacationDays * moneyPerHour * 8;
        return (weeklyPayment * 52) - unpaidTime;

//        System.out.println("No Of Hours per week");
//        Scanner input1 = new Scanner(System.in);
//
//        System.out.println("Money per hour");
//        Scanner input2 = new Scanner(System.in);


    }

    public static void main(String[] args) {
        double salary = salaryCalc(48,15,8);
        System.out.println(salary);
    }
}
