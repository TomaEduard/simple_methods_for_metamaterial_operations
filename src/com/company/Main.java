package com.company;

public class Main {

    public static void main(String[] args) {

//        amount
        System.out.println("the amount of two intigers is: " + amount.amount(4,6));
        System.out.println("the amount of two doubles is: " + amount.amount(4.55,13.17));

        System.out.println("---------------------------");
//        average
        System.out.println("the average of three intigers is: " + average.average(4,6,12));

        System.out.println("the average of two intigers is: " + average.average(157, 91));


//        System.out.println("the average of three doubles is: " + average.average(4.0, 5.0, 6.5));
        System.out.printf("the average of three doubles is: %5.9f\n",average.average(4.0, 5.0, 6.5));

        System.out.printf("the average of two doubles is: %5.2f\n",average.average(85.8, 78.12));




    }
}
