package com.codewithkushan;

public class Test {
    public static void calculateTotalMealPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        double result = listedMealPrice + tip + tax;

        System.out.println("your total meal price is " + result);
    }

    public static void main(String[] args) {
        calculateTotalMealPrice(15,.2,.08);
    }
}
