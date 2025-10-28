package com.first_java_program;

import java.util.Scanner;

public class TypeCasting {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        float num = scanner.nextFloat(); // will input an integer
        System.out.println(num); // automatic type conversion

//         typecasting

        int num1 = (int)(342.131f);
        System.out.println(num1);

//         automatic type promotion in expressions

        int a = 257;
        byte b = (byte)(a);
        System.out.println(b);

        byte a1 = 40;
        byte b1 = 50;
        byte c1 = 100;
        int d1 = a1 * b1 / c1;
        System.out.println(d1);

        System.out.println("नमस्ते"); // java follows unicode

        byte b2 = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b2) + (i/c) - (d*s);
        // float + integer - double = double
        System.out.println((f*b2) + " " + (i/c) + " " + (d*s));
        System.out.println(result);
    }
}
