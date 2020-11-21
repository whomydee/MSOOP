/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author Shad Humydee
 */
public class LoopsRelatedProblems {
    static void normalSeries() {
        System.out.println("Normal Series Printer\n---------------------");
        System.out.print("Please, enter your number: ");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i = 0; i < a; ++i) {
            System.out.print(i + 1);
            if(i != a - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    static void oddSeries() {
        System.out.println("Odd Series Printer\n---------------------");
        System.out.print("Please, enter your number: ");
        
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        for (int i = 1; i <= a; ++i) {
            if (i % 2 != 0) {
                System.out.print(i);
                if (i < a) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println();
    }
    
    static void binaryDigit() {
        System.out.println("Binary Digit Printer\n---------------------");
        System.out.print("Please, enter your number: ");

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        boolean flag = true;
        for (int i = 1; i <= a; ++i) {
            if (flag) {
                System.out.print(1);
                flag = !flag;
            }
            else {
                System.out.print(0);
                flag = !flag;
            }
            if (i != a) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
    
    static void average() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double sum = 0.0;
        for(int  i = 0; i < n; ++i) {
            sum += input.nextDouble();
        }
        System.out.println("AVG of " + n + " inputs: " + sum / n);
    }
}
