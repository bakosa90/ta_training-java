package com.epam.training.student_Sviatlana_Blotskaya.Java_Fundamentals.Optional_Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        //7.Найти число, состоящее только из различных цифр. Если таких чисел несколько, найти первое из них.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of numbers: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        for (int value : array) {
            char[] chars = String.valueOf(value).toCharArray();
            boolean isOnlyDiff = true;
            for (int i = 0; i < chars.length - 1; i++) {
                for (int j = i + 1; j < chars.length; j++) {
                    if (chars[i] == chars[j]) {
                        isOnlyDiff = false;
                        break;
                    }
                }
                if (!isOnlyDiff) {
                    break;
                } else if (i == chars.length - 2) {
                    System.out.println("First number: " + Arrays.toString(chars));
                    return;
                }
            }
        }
        System.out.println("No numbers");
    }
}
