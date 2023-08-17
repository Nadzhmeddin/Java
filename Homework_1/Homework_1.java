package Homework_1;

import java.util.Scanner;

public class Homework_1 {

    public static void main(String[] args) {
        // allNums();
        // multiplNums();
        // calculator();
    }

    // 1. Вычислить n-ое треугольное число (сумма чисел от 1 до n).

    static void allNums() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        boolean flag = scanner.hasNextInt();
        System.out.println(flag);
        int nums = scanner.nextInt();
        for (int i = 0; i < nums+1; i++) {
            if(i > 0) 
            System.out.print(i + " ");
        }
        scanner.close();
    }

    // 1.2 Вычислить произведение чисел от 1 до n.

    static void multiplNums() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        boolean flag = scanner.hasNextInt();
        System.out.println(flag);

        int nums = scanner.nextInt();
        int res = 1;
        for (int i = 0; i <= nums; i++) {
            if(i > 0) {
                res *= i;
            }
        }
        System.out.println(res);
        scanner.close();
    }

    //2. Реализовать простой калькулятор

    static void calculator() {
        
        Scanner first_num = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        double first = first_num.nextDouble();

        Scanner second_num = new Scanner(System.in);
        System.out.print("Введите второе число: ");
        double second = second_num.nextDouble();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер операции: \n1- Сложение\n2-Вычитание\n3-Умножение\n4-Деление\n5-Выход\n");
        int operation = scanner.nextInt();
        double res = 0;
        if(operation == 1) {
            System.out.println("Производим процесс сложения...");
            res = first + second;
            System.out.printf("Результат вычисления %.2f", res);
        }
        else if(operation == 2) {
            System.out.println("Проиводим процесс вычитания...");
            res = first - second;
            System.out.printf("Результат вычисления: %.2f", res);
        }
        else if(operation == 3) {
            System.out.println("Проводим процесс умножения...");
            res = first * second;
            System.out.printf("Результат вычисления: %.2f", res);
        }
        else if(operation == 4) {
            System.out.println("Проводим процесс деления...");
            res = first / second;
            System.out.printf("Результат вычисления: %.2f", res);
        }
        else if(operation == 5) {
            System.out.println("Уже уходишь? Пока-пока!");
        }
        else {
            System.out.println("Ошибка! Нет такой операции!");
        }

        first_num.close();
        second_num.close();
        scanner.close();
    }
}