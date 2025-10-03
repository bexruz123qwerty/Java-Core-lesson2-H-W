package com.example.lesson2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static final int EXCHANGE = 12500;

    public static void main(String[] args) {
        numberPrinter();

        System.out.print("введите число: ");
        int number = scanner.nextInt();
        System.out.println("сумма: " + sumTillNumber(number));

        System.out.print("введите число: ");
        int number2 = scanner.nextInt();
        System.out.println("произведение: " + multiplicationTillNumber(number2));

        System.out.println("сумма чётных чисел до 10: " + evenSum(10));
        System.out.println("сумма цифр числа 1234: " + sumOfDigits(1234));
        System.out.println("обратное число 1234: " + reverseNumber(1234));
        System.out.println("факториал 5: " + factorial(5));
        System.out.println("первое число >1000 и делится на 7: " + divisibleBy7AndMoreThan1000());

        printPrimesUpToN(100);
        starsPrinter();

        swapValues();
        multiplicationTable();
        currencyConverter();
        evenOrOdd();
        maxOfThree();
        calculator();
        averageOfNumbers();
        searchInArray();
        guessNumberGame();
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
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    private static int evenSum(int number) {
        int sum = 0;
        for (int i = 0; i <= number; i += 2) {
            sum += i;
        }
        return sum;
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            number /= 10;
        }
        return sum;
    }

    private static int reverseNumber(int number) {
        int reverse = 0;
        while (number != 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }
        return reverse;
    }

    private static int factorial(int number) {
        int res = 1;
        for (int i = 1; i <= number; i++) {
            res *= i;
        }
        return res;
    }

    private static int divisibleBy7AndMoreThan1000() {
        int number = 1001;
        while (true) {
            if (number % 7 == 0) {
                return number;
            }
            number++;
        }
    }

    private static boolean isPrimaryNumber(int number) {
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    private static void printPrimesUpToN(int n) {
        for (int number = 2; number <= n; number++) {
            if (isPrimaryNumber(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void starsPrinter() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
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

    private static void swapValues() {
        System.out.print("Введите первое число: ");
        String a = scanner.next();
        System.out.print("Введите второе число: ");
        String b = scanner.next();
        System.out.println("До обмена: a = " + a + ", b = " + b);
        String temp = a;
        a = b;
        b = temp;
        System.out.println("После обмена: a = " + a + ", b = " + b);
    }

    private static void multiplicationTable() {
        System.out.println("Выберите режим таблицы умножения:");
        System.out.println("1. Таблица для одного числа (1..10)");
        System.out.println("2. Полная таблица до n x n");
        System.out.print("Режим: ");
        String mode = scanner.next();
        if (mode.equals("1")) {
            System.out.print("Введите число: ");
            int num = scanner.nextInt();
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }
        } else if (mode.equals("2")) {
            System.out.print("Введите n: ");
            int n = scanner.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print((i * j) + "\t");
                }
                System.out.println();
            }
        } else {
            System.out.println("Неверный режим.");
        }
    }

    private static void currencyConverter() {
        System.out.print("Введите сумму в долларах (USD): ");
        double usd = scanner.nextDouble();
        double sum = usd * EXCHANGE;
        System.out.println(usd + " USD = " + sum + " сум (курс " + EXCHANGE + ")");
    }

    private static void evenOrOdd() {
        System.out.print("Введите целое число: ");
        long x = scanner.nextLong();
        if (x % 2 == 0) System.out.println(x + " — чётное");
        else System.out.println(x + " — нечётное");
    }

    private static void maxOfThree() {
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();
        System.out.print("Введите третье число: ");
        double c = scanner.nextDouble();
        double max = Math.max(a, Math.max(b, c));
        System.out.println("Максимальное: " + max);
    }

    private static void calculator() {
        System.out.print("Введите первое число: ");
        double a = scanner.nextDouble();
        System.out.print("Введите операцию (+, -, *, /): ");
        String op = scanner.next();
        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();
        double result = 0;
        if (op.equals("+")) result = a + b;
        else if (op.equals("-")) result = a - b;
        else if (op.equals("*")) result = a * b;
        else if (op.equals("/")) result = a / b;
        System.out.println("Результат: " + result);
    }

    private static void averageOfNumbers() {
        System.out.print("Сколько чисел вы введёте (n): ");
        int n = scanner.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            System.out.print("Введите число #" + i + ": ");
            double v = scanner.nextDouble();
            sum += v;
        }
        System.out.println("Среднее арифметическое: " + (sum / n));
    }

    private static void searchInArray() {
        System.out.print("Введите длину массива: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("arr[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
        System.out.print("Введите искомое число: ");
        int target = scanner.nextInt();
        boolean found = false;
        for (int value : arr) {
            if (value == target) {
                found = true;
                break;
            }
        }
        if (found) System.out.println("Число найдено в массиве.");
        else System.out.println("Число в массиве не найдено.");
    }

    private static void guessNumberGame() {
        Random rnd = new Random();
        int secret = rnd.nextInt(100) + 1;
        System.out.println("Я загадал число от 1 до 100. Попробуйте угадать!");
        int attempts = 0;
        while (true) {
            System.out.print("Ваше предположение (или 0 для выхода): ");
            int guess = scanner.nextInt();
            if (guess == 0) {
                System.out.println("Выход. Загаданное число было: " + secret);
                return;
            }
            attempts++;
            if (guess < secret) System.out.println("Больше.");
            else if (guess > secret) System.out.println("Меньше.");
            else {
                System.out.println("Поздравляю! Вы угадали за " + attempts + " попыток.");
                return;
            }
        }
    }
}
