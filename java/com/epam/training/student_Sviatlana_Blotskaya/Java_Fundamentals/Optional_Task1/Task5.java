package com.epam.training.student_Sviatlana_Blotskaya.Java_Fundamentals.Optional_Task1;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //5.Найти количество чисел, содержащих только четные цифры,
        // а среди оставшихся — количество чисел с равным числом четных и нечетных цифр.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of numbers: ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] array = new String[n];
        int hasOnlyEvenDig = 0;
        int hasEvenOddDig = 0;
        System.out.print("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }
        for (String value : array) {
            char[] letters = value.toCharArray();
            int countOfEvenDig = 0;
            int countOfOddDig = 0;
            for (char letter : letters) {
                if (letter % 2 == 0) {
                    countOfEvenDig++;
                } else {
                    countOfOddDig++;
                }
            }
            if (countOfEvenDig == letters.length) {
                hasOnlyEvenDig++;
            } else if (countOfEvenDig == countOfOddDig) {
                hasEvenOddDig++;
            }
        }

        System.out.println("number of numbers containing only even digits: " + hasOnlyEvenDig);
        System.out.println("The number of numbers with an equal number of even and odd digits: " + hasEvenOddDig);
    }
}
