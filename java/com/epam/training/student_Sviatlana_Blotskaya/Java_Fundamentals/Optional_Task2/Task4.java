package com.epam.training.student_Sviatlana_Blotskaya.Java_Fundamentals.Optional_Task2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //4.Найти максимальный элемент в матрице и удалить из матрицы все строки и столбцы, его содержащие.

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
        int maxElement = 0;
        int iMax = 0;
        int jMax = 0;
        System.out.println("Initial array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + " ");
                if (array[i][j] > maxElement) {
                    maxElement = array[i][j];
                    iMax = i;
                    jMax = j;
                }
            }
            System.out.println();
        }
        System.out.println("Max element of array: " + maxElement + ",number of line: " + (iMax) + ",number of column: " + (jMax));
        System.out.println("Resulting array:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == iMax || j == jMax) {
                    String empty = "  ";
                    System.out.print(" " + empty);
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
