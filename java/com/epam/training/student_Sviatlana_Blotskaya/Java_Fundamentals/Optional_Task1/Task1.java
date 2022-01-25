package com.epam.training.student_Sviatlana_Blotskaya.Java_Fundamentals.Optional_Task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of numbers: ");
        int n = Integer.parseInt(scanner.nextLine());
        int min = 0;
        int max = 0;
        String[] array = new String[n];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length() <= array[min].length()) {
                min = i;
            }
            if (array[i].length() > array[max].length()) {
                max = i;
            }
        }
        System.out.println("The shortest number is: " + array[min] + " its length is: " + array[min].length());
        System.out.println("The longest number is: " + array[max] + " its length is: " + array[max].length());
    }
}
