package assignment1_2_3;

//import java.util.Scanner;

public class TeachingAssistant {
    String name;
    String id;

    public TeachingAssistant(String name, String id) {
        this.name = name;
        this.id = id;
    }

    void printEarnings() {
        System.out.println("Name of the Teaching Assistant: " + this.name);
        System.out.println("ID of the Teaching Assistant: " + this.id);
    }
}

class Grader extends TeachingAssistant {
    int count, payPerAssignment;

    public Grader(String name, String id, int count, int payPerAssignment) {
        super(name, id);
        this.count = count;
        this.payPerAssignment = payPerAssignment;
    }

    @Override
    void printEarnings() {
        super.printEarnings();
        int tmp = count * payPerAssignment;
        System.out.println("Earning of Grader: " + tmp);
        System.out.println("====================================");
    }
}

class LabAssistant extends TeachingAssistant {
    int hour, hourlyPay;

    public LabAssistant(String name, String id, int hour, int hourlyPay) {
        super(name, id);
        this.hour = hour;
        this.hourlyPay = hourlyPay;
    }

    @Override
    void printEarnings() {
        super.printEarnings();
        int tmp = hour * hourlyPay;
        System.out.println("Earning of Lab Assistant: " + tmp);
        System.out.println("====================================");
    }
}
