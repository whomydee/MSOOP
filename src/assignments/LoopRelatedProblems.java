/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignments;

import java.util.Scanner;

/**
 *
 * @author Shad Humydee
 */
public class LoopRelatedProblems {
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
        System.out.print("How many numbers you need to average? : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double sum = 0.0;
        for(int  i = 0; i < n; ++i) {
            sum += input.nextDouble();
        }
        System.out.println("AVG of " + n + " inputs: " + sum / n);
    }

    static void squareIncrement() {
        Scanner input = new Scanner(System.in);
        System.out.print("X and Y: ");
        int x = input.nextInt();
        int y = input.nextInt();

        while(x != y) {
            System.out.print(x * x + ", ");
            if(x < y) x++;
            else x--;
        }
        System.out.println("Reached!");
    }

    static void guessingGame() {
        Scanner input = new Scanner(System.in);
        System.out.print("Player 1, please input your number: ");
        int x = input.nextInt();
        System.out.print("How many tries Player 2 gets? : ");
        int n = input.nextInt();

        for(int i = 0; i < n; ++i) {
            System.out.print("Player 2, Guess: ");
            int tmp = input.nextInt();
            if (tmp == x) {
                System.out.println("Right, Player-2 wins!");
            } else if (i != n - 1) {
                System.out.println("Wrong, " + (n - i - 1) + " Choice(s) Left!\n");
            } else {
                System.out.println("Player-1 wins!\n");
            }
        }
    }

    static void inputPrinter() {
        int i = 0;
        while(true) {
            Scanner input = new Scanner(System.in);
            char ch = input.next().charAt(0);
            if(ch == 'A') {
                break;
            }
            System.out.println("Input " + i + 1 + ": " + ch);
            i++;
        }
    }

    static void reverseDigits() {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        while((a / 10) != 0) {
            System.out.print(a % 10);
            a /= 10;
        }
        System.out.print(a);
    }

    static void weirdSeriesSum() {
        Scanner input = new Scanner(System.in);
        System.out.print("How long do you want me to print the sum?: ");
        int n = input.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; ++i) {
            if(i % 2 == 0) {
                sum += (-1 * i);
            }
            else sum += i;
        }
        System.out.println("Result: " + sum);
    }

    static void fibonacci() {
        int before = 0, after = 1;
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        if(n == 1) {
            System.out.print("1");
        }
        else{
            System.out.print("1, ");
        }

        for(int i = 2; i <= n; ++i) {
            if(i == n) {
                System.out.print(before + after);
            }
            else{
                System.out.print(before + after + ", ");
            }
            int tmp = after;
            after += before;
            before = tmp;
        }
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(), res = 1;
        System.out.print(n + "! = ");
        for(int i = n; i >= 1; --i) {
            res *= i;
            if (i != 1) {
                System.out.print(i + " X ");
            }
            else {
                System.out.print(i + " = " + res);
            }
        }
    }
}
