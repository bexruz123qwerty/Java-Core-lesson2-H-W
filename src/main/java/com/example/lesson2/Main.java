package com.example.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1 задание
        numberPrinter();

        //2 задание
        System.out.print("введите число: ");
        int number = scanner.nextInt();

        int result = sumTillNumber(number);
        System.out.println("сумма: " + result);

        //3 задание
        System.out.print("введите число: ");
        int number2 = scanner.nextInt();

        int result2 = multiplicationTillNumber(number2);
        System.out.println("произведение: " + result2);
    }

    private static void numberPrinter() {
        for (int i = 0; i < 101; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
                System.out.println();
            } else System.out.print(i + " ");
        }
    }

    private static int sumTillNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += i;
        }
        return sum;
    }

    private static int multiplicationTillNumber(int number) {
        int result = 1;
        for (int i = 0; i < number; i++) {
            result*=i;
        }
        return result;
    }
}
