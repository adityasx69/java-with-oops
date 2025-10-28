package com.aditya;

import java.util.Scanner;

public class Inputs {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your roll no: ");
        int roll_no = scanner.nextInt();
        System.out.println(roll_no);

        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println(name);

        System.out.print("Enter your marks: ");
        Float marks = scanner.nextFloat();
        System.out.println(marks);

        System.out.print("True/False: ");
        Boolean bool = scanner.nextBoolean();
        System.out.println(bool);
    }
}
