package com.epam.training.student_Sviatlana_Blotskaya.Java_Fundamentals.Optional_Task2;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //2.Найти и вывести наибольшее число возрастающих (убывающих) элементов матрицы, идущих подряд.

        System.out.print("Enter size of array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        System.out.println("Enter max value of a random number in the array");
        int maxValue = scanner.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (-maxValue) + (int) (Math.random() * (maxValue - (-maxValue) + 1));
            }
        }
        System.out.println("Initial array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int[] increasingSequence;
        int maxIncreasingValue = 0;
        int count = 0;
        int indexLast = 0;
        int[] result = new int[size * size];
        for (int i = 0; i < size; i++) {
            System.arraycopy(array[i], 0, result, (i * size), size);
        }
        System.out.println(Arrays.toString(result));

        for (int i = 0; i < result.length - 1; i++) {
            if (result[i] < result[i + 1]) {
                count++;
                if (count > maxIncreasingValue) {
                    maxIncreasingValue = count;
                    indexLast = i + 1;
                }
            } else {
                count = 0;
            }
        }
        System.out.println("Maximal sequence of increasing of element: ");
        increasingSequence = new int[maxIncreasingValue + 1];
        System.arraycopy(result, (indexLast - maxIncreasingValue), increasingSequence, 0, (maxIncreasingValue + 1));
        System.out.println(Arrays.toString(increasingSequence) + " With capacity: " + (maxIncreasingValue + 1));
    }
}

