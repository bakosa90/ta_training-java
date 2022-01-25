package com.epam.training.student_Sviatlana_Blotskaya.Java_Fundamentals.Optional_Task1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //2.Вывести числа в порядке возрастания (убывания) значений их длины.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of numbers: ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] array = new String[n];
        String temp;
        System.out.print("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++)
                if (array[i].length() > array[j].length()) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        }
        System.out.println("Numbers in ascending order of their length values: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++)
                if (array[i].length() < array[j].length()) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
        }
        System.out.println("Numbers in descending order of their length values: ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
