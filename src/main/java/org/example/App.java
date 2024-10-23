package org.example;

import java.util.Scanner;

public class App
{
    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть порядковий номер числа Фібоначчі: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci of " + n + " is: " + fibonacci(n));
    }
}
