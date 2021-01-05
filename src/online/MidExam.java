package online;
import java.util.Scanner;

public class MidExam {
    public void seriesPrinter() {
        Scanner input = new Scanner(System.in);
        int n, sum = 0, tmp;
        System.out.print("PLease, input N: ");
        n = input.nextInt();
        System.out.println();

        for(int i = 0; i < n; ++i) {
            if(i % 2 != 0) {
                tmp = i * i;
            }
            else {
                tmp = i * i * i;
            }
            sum += tmp;
            System.out.print(tmp + " ");
        }
        System.out.print("  " + "sum=" + sum);
    }


    public void calculator() {
        int num1, num2, choice;
        Scanner input = new Scanner(System.in);

        System.out.print("Number 1: ");
        num1 = input.nextInt();
        System.out.println();

        System.out.print("Number 2: ");
        num2 = input.nextInt();
        System.out.println();

        System.out.println("Which operation do you want to perform?\n" +
                "1. Add\n" +
                "2. Subtract\n" +
                "3. Multiply\n" +
                "4. Divide\n" +
                "5. Remainder"
        );

        System.out.print("Your operation: ");
        choice = input.nextInt();

        if(choice == 1) {
            System.out.println("Result: " + (num1 + num2));
        }
        else if(choice == 2) {
            System.out.println("Result: " + (num1 - num2));
        }
        else if(choice == 3) {
            System.out.println("Result: " + (num1 * num2));
        }
        else if(choice == 4) {
            if(num2 == 0) {
                System.out.println("Can not divide a number by ZERO!");
                return;
            }
            System.out.println("Result: " + (num1 / num2));
        }
        else {
            System.out.println("Result: " + (num1 % num2));
        }
    }
}
