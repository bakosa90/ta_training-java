package com.epam.training.student_Sviatlana_Blotskaya.Java_Fundamentals.Main_Task;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of numbers: ");
        int num = scanner.nextInt();
        int[] arrayOfNumbers = new int[num];
        System.out.println("Random numbers with newline: ");
        for (int i = 0; i < num; i++) {
            arrayOfNumbers[i] = (int) (Math.random() * 10);
            System.out.println(arrayOfNumbers[i]);
        }
        System.out.println("Random numbers without newline: ");
        for (int i = 0; i < num; i++) {
            arrayOfNumbers[i] = (int) (Math.random() * 10);
            System.out.print(arrayOfNumbers[i] + " ");
        }
    }
}
