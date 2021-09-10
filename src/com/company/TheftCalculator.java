package com.company;
import java.util.Scanner;
public class TheftCalculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Principle Amount:");
        int principalAmount = input.nextInt();

        System.out.print("Interest Rate:");
        double rate = input.nextDouble();

        System.out.print("Number of Years:");
        int year = input.nextInt();

        System.out.print("What is the number of times the interest is compounded per year? ");
        int n = input.nextInt();

        double A = principalAmount*Math.pow(1+((rate*.01)/n),n*year);
        System.out.printf("$%d invested at %.1f%% for %d years compounded %d times per year is $%.2f.\n",
            principalAmount, rate, year, n, A);

        input.close();
    }
}
