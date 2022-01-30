package com.Nimshi;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your Buying price per share: ");
        double buyingPrice = scan.nextDouble();
        int day = 1;
        double closingPrice = 0.1;

        while (true){
            System.out.println("Enter the closing price for Day " + day +"(any negative value to leave: ");
            closingPrice = scan.nextDouble();
            if (closingPrice < 0.0) break;
            double profit = closingPrice - buyingPrice;
            if (profit > 0){
                System.out.println("After day" + day + ", you earned " + profit + "per share.");

            } else if (profit < 0.0){
                System.out.println("After day" + day + ", you lost " + (-profit) + "per share.");
            } else {
                System.out.println("After day " + day + ", you have no earnings per share.");
            }
            day +=1;
        }
        scan.close();




    }
}
