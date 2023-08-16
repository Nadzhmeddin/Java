package Seminar_1;

import java.util.Scanner;
import java.time.LocalDateTime;

public class semi_1 {
    public static void main(String[] args) {
        // sayHi();
        // quantityOfSame();
        // magicIndex();
        reverseWords();
    }

    // 1.1. Написать программу, которая запросит пользователя ввести <Имя> в консоли.
    // Получит введенную строку и выведет в консоль сообщение "Привет!, <Имя>".
    // 1.2. Поприветствовать пользователя в соотвествии с текущим временем суток.
    static void sayHi() {
        Scanner scanner = new Scanner(System.in);
        int hour= LocalDateTime.now().getHour();
        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();
        String dayTime = "";
        if(hour >=4 && hour < 11)
            dayTime = "morning";
        else if(hour >=11 && hour < 17)
            dayTime = "day";
        else if(hour >= 17 && hour < 23)
            dayTime = "evening";
        else 
            dayTime = "night";

        System.out.printf("Good %s, %s!", dayTime, name);
        scanner.close();
    }



    // 2.1 Дан массив двоичных чисел, вывести максимальное количество идущих подряд единиц.
    // Например, [1,1,0,1,1,1]

    static void quantityOfSame() {
        int [] array = new int [] {1,1,0,1,1,1};

        int count = 0;
        int countMax = 0;

        for (int i = 0; i < array.length; i++) {
            if(array[i] == 1) count += 1;
            else if (count > countMax) {
                countMax = count;
                count = 0;
            }
            else count = 0;
        }
        if(count > countMax) countMax = count;
        System.out.println(countMax);
    }


    // 2.2 Задан массив, например, nums = [1,7,3,6,5,6].
    // Написать программу, которая найдет индекс i для этого массива такой,
    // что сумма элементов с индексами < i равна сумме элементов с индексами > i.

    static void magicIndex() {
        int [] array = new int [] {1,3,2,4,6};
        
        for (int i = 1; i < array.length - 1; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int i1 = 0; i1 < i; i1++) 
                leftSum += array[i1];
            for (int i2 = i+1; i2 < array.length; i2++) 
                rightSum += array[i2];
            
            if(leftSum == rightSum) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }


    
    // 2.3 Принимаем от пользователя строку и поменяем фразы в обратном порядке.

    static void reverseWords() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите Вашу фразу: ");
        String phrase = scanner.nextLine();

        String[] words = phrase.split(" ");
        String[] res = new String[words.length];
        for (int i = 0; i < words.length; i++) 
            res[i] = words[words.length - 1 - i];
        for (String word : res) {
            System.out.print(word + " ");
        }
        scanner.close();
    }
}
