package org.example;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This calculator tells you how many years you have until you turn 100.");
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println(Main.yearsToOneHundred(age));

        input.close();
    }

    public static String yearsToOneHundred(int age) {
        int yearsDifference = 100 - age;
        return "You have " + yearsDifference + " years until you turn 100";
    }
}