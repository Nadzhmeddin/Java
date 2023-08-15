package Lecture_1;

import java.util.Scanner;

public class First_lec {

    public static void main(String[] args) {
        // int s = 123;
        // short s = 10;
        
        // float s = 3.12f;
        // double e = 3.12;

        // System.out.println(s);
        // System.out.println(e);

        // char ch = '{';
        // System.out.println(ch);

        // int a = 13;
        // double d = a;

        // boolean f = true ^ false;
        // System.out.println(f);

        // String s = "qwer";

        // char a = s.charAt(1);
        // System.out.println(a);

        // int a = 123;
        // System.out.println(a++);

        Scanner scanner = new Scanner(System.in);
        System.out.printf("name: ");
        boolean flag = scanner.hasNextInt();
        System.out.println(flag);
        int age = scanner.nextInt();
        System.out.printf("Hello, %s!", age);
        scanner.close();
    }
}