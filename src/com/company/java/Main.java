package com.company.java;

import java.util.Scanner;

/* The maximum hours an employee can work per week is 60 hours, and the
 maximum hourly rate is $25.00 per hour. If more than 35 hours are worked,
 payment for the overtime hours worked is calculated at time-and-a-half.
 */

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Employee number: ");
        String employeeNum = in.next();

        System.out.println("Pay rate: ");
        double pay = in.nextDouble();

        System.out.println("Hourse worked: ");
        int hours = in.nextInt();

        double totalPay = 0;
        double regularPAy = 0;
        if(pay<0 || pay>25){
            System.out.println("Invaldid");
        }else {
            if(hours > 60 ) {
                System.out.println("Invalid");
            }else if(hours > 35 || hours < 60 ){
                int extraHus = hours - 35;
                totalPay = pay * 35 + (extraHus * (pay * 1.5));
                System.out.println(totalPay);
            }else if(hours <35){
                regularPAy = hours * pay;
                System.out.println(regularPAy);
            }
        }

        System.out.println(totalPay);
    }
}
