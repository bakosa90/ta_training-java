package com.epam.training.student_Sviatlana_Blotskaya.Java_Fundamentals.Optional_Task1;

import java.util.Scanner;

public class Task4 {
    //4.Найти число, в котором количество различных цифр минимально.
    // Если таких чисел несколько, найти первое из них.

    public static int countOfDifDig(int arr) {
        int[] arrayOfCount = new int[10];
        if (arr == 0) {
            return 1;
        }
        while (arr > 0) {
            int indexOfSameDig = arr % 10;
            arrayOfCount[indexOfSameDig]++;
            arr = arr / 10;
        }
        int countOfDiff = 0;
        for (int i = 0; i < 10; i++) {
            if (arrayOfCount[i] > 0) {
                countOfDiff++;
            }
        }
        return countOfDiff;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of numbers: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.print("Enter numbers: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int minDifDig = countOfDifDig(array[0]);
        int minElem = array[0];
        for (int j = 1; j < array.length; j++) {
            int maxIndexDifDig = countOfDifDig(array[j]);
            if (maxIndexDifDig < minDifDig) {
                minDifDig = maxIndexDifDig;
                minElem = array[j];
            }
        }
        System.out.println("First number: " + minElem);
    }
}


