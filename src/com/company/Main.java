package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println("the average of three intigers is: " + average.average(4,6,12));

        System.out.println("the average of two intigers is: " + average.average(157, 91));

        System.out.println("---------------------------");

//        System.out.println("the average of three doubles is: " + average.average(4.0, 5.0, 6.5));
        System.out.printf("the average of three doubles is:%5.9f\n",average.average(4.0, 5.0, 6.5));

        System.out.printf("the average of two doubles is: %5.2f\n",average.average(85.8, 78.12));


    }
}
