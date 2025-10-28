package com.first_java_program;

import java.util.Scanner;

public class TemperatureConversion {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temp in C: ");
        float c = scanner.nextFloat();

        float f = (9.0f/5.0f) * c + 32;

        System.out.println("The temp in F is: " + f);
    }
}
