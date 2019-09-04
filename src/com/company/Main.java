package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // declare variables
        int employeeNum;
        double hrWorked;
        double payRate;
        double wklyPay;
        final double MAX_HRLY_RATE = 25.0;
        final double MAX_HR_ALLOWED = 60.0;
        final double basePayHr = 35.0;

        // get values
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the employee number: ");
        employeeNum = keyboard.nextInt(); // nextLine will read to the end of the line
        keyboard.nextLine();
        System.out.println("Enter the pay rate: ");
        payRate = keyboard.nextDouble();
        System.out.println("Enter the number of hours worked in the week: ");
        hrWorked = keyboard.nextDouble();

        // display the inputs
        System.out.println("The employee number is " + employeeNum);
        System.out.println("The pay rate is $" + payRate + "/hr");
        System.out.println("The number of hours worked in the week is " + hrWorked + "\n");

        // validate whether pay rate and hours worked are in range
        if(payRate <= MAX_HRLY_RATE && hrWorked <= MAX_HR_ALLOWED){
            // calculate weekly pay
            if(hrWorked <= basePayHr){
                wklyPay = hrWorked * payRate;
            } else
                System.out.println("You worked overtime.");
                wklyPay = basePayHr * payRate + (hrWorked-basePayHr)*(payRate*1.5);
            System.out.println("The weekly pay for recorded hours of " + hrWorked + " is $" + wklyPay);
        } else
            System.out.println("ERROR: The value you entered is out of range. \n" +
                    "The maximum pay rate is $25/hr and the maximum " +
                    "hours allowed per week is 60. \n" +
                    "Please enter the correct value.");
    }
}
