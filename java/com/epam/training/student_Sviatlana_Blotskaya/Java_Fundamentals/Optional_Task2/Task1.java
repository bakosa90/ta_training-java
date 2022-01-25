package com.epam.training.student_Sviatlana_Blotskaya.Java_Fundamentals.Optional_Task2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //1.Упорядочить строки (столбцы) матрицы в порядке возрастания значений элементов k-го столбца (строки).

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
        System.out.println("Enter number of line you want change:");
        int lineNum = scanner.nextInt();
        if (lineNum >= size) {
            System.out.println("Number of line must be from 0 to " + (size - 1));
        }
        for (int i = 0; i < size; i++) {
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < size - 1; j++) {
                    if (array[lineNum][j] > array[lineNum][j + 1]) {
                        int temp = array[lineNum][j];
                        array[lineNum][j] = array[lineNum][j + 1];
                        array[lineNum][j + 1] = temp;
                        isSorted = false;
                    }
                }
            }
        }
        System.out.println("Resulting array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}

