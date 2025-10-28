package com.first_java_program;

import java.util.Scanner;

public class Sumof2Nums {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("The sum of the two numbers is " + sum);
    }
}
