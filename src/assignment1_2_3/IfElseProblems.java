/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment1_2_3;

import java.util.Scanner;

/**
 *
 * @author Shad Humydee
 */
public class IfElseProblems {
    static void isPositive() {
        System.out.println("Positive/Negative Tester\n-------------------------------");
        System.out.print("Please, enter your number: ");
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        if(a < 0) {
            System.out.println("Negative");
        }
        else{
            System.out.println("Positive");
        }
        System.out.println("");
    }
    
    static void isOdd() {
        System.out.println("Odd/Even Tester\n-------------------------------");
        System.out.print("Please, enter your number: ");
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        if(a % 2 == 0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        System.out.println("");
    }
    
    static void digitInEnglish() {
        System.out.println("Digit in English Printer\n-------------------------------");
        System.out.print("Please, enter your number: ");
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        if(a == 1) {
            System.out.println("One");
        }
        else if(a == 2) {
            System.out.println("Two");
        }
        else if(a == 3) {
            System.out.println("Three");
        }
        else if(a == 4) {
            System.out.println("Four");
        }
        else if(a == 5) {
            System.out.println("Five");
        }
        else if(a == 6) {
            System.out.println("Six");
        }
        else if(a == 7) {
            System.out.println("Seven");
        }
        else if(a == 8) {
            System.out.println("Eight");
        }
        else if(a == 9) {
            System.out.println("Nine");
        }
        else{
            System.out.println("Zero");
        }
        System.out.println("");
    }
    
    static void isTriangle() {
        System.out.println("Triangle Checker\n-------------------------------");
        System.out.print("Please, enter your numbers: ");
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        
        if(0 < a && a < 180 && 0 < b && b < 180 && 0 < c && c < 180) {
            if(a + b + c == 180) {
                System.out.println("Yes");
            }
            else {
                System.out.println("No");
            }
        }   
        else{
            System.out.println("No");
        }
        System.out.println("");
    }
    
    static void isPowerOfTwo() {
        System.out.println("Power of 2 Tester\n-------------------------------");
        System.out.print("Please, enter your number: ");
        
        Scanner input = new Scanner(System.in);
        
        int a = input.nextInt();
        if( (a & (a - 1) ) == 0) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        System.out.println("");
    }
    
    static void largestNumber() {
        System.out.println("Largest Number Finder\n-------------------------------");
        System.out.print("Please, enter your numbers: ");

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        if (a >= b && a >= c) {
            System.out.println(a + " is the largest");
        }
        else if (b >= a && b >= c) {
            System.out.println(b + " is the largest");
        }
        else {
            System.out.println(c + " is the largest");
        }
        System.out.println("");
    }
    
    static void leapYearChecker() {
        System.out.println("Leap Year Checker\n-------------------------------");
        System.out.print("Please, enter your Year: ");

        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
       
        if (a % 400 == 0) {
            System.out.println(a + " is a leap year!");
        }
        else if (a % 4 == 0 && a % 100 != 0) {
            System.out.println(a + " is a leap year!");
        }
        else {
            System.out.println(a + " is not a leap year!");
        }
        System.out.println("");
    }
}
