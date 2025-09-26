package com.example.lesson2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        Scanner scanner = new Scanner(System.in);
        // 1 задание
        main.numberPrinter();

        //2 задание
        System.out.print("введите число: ");
        int number = scanner.nextInt();

        int result = main.sumTillNumber(number);
        System.out.println("сумма: " + result);

        //3 задание
        System.out.print("введите число: ");
        int number2 = scanner.nextInt();

        int result2 = main.multiplicationTillNumber(number2);
        System.out.println("произведение: " + result2);

        System.out.println(main.evenSum(10));
        System.out.println(main.sumOfDigits(1234));
        System.out.println(main.reverseNumber(1234));
        System.out.println(main.factorial(5));
        System.out.println(main.divisibleBy7AndMoreThan1000());
        main.printPrimesUpToN(100);

        main.starsPrinter();
    }

    private void numberPrinter() {
        for (int i = 0; i < 101; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
                System.out.println();
            } else System.out.print(i + " ");
        }
    }

    private int sumTillNumber(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            sum += i;
        }
        return sum;
    }

    public int multiplicationTillNumber(int number) {
        int result = 1;
        for (int i = 0; i < number; i++) {
            result *= i;
        }
        return result;
    }

    public int evenSum(int number) {
        int sum = 0;

        for (int i = 0; i <= number; i = i + 2) {
            sum += i;
        }
        return sum;
    }

    public int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            if (digit != 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public int reverseNumber(int number) {
        String reverse = "";
        while (number != 0) {
            String digit = String.valueOf(number % 10);
            reverse += digit;
            number /= 10;
        }
        return Integer.parseInt(reverse);
    }

    public int factorial(int number) {
        int res = 1;
        for (int i = 1; i <= number; i++) {
            res *= i;
        }
        return res;
    }

    public int divisibleBy7AndMoreThan1000() {
        int number = 1000;
        while (true) {
            if (number % 7 == 0) {
                return number;
            }
            number++;
        }
    }

    private boolean isPrimaryNumber(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void printPrimesUpToN(int n) {
        for (int number = 2; number <= n; number++) {
            if (isPrimaryNumber(number)) {
                System.out.print(number + " ");
            }
        }
    }

    public void starsPrinter() {

        //1
        for (int i = -1; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
