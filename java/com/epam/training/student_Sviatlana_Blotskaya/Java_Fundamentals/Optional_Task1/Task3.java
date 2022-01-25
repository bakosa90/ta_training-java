package com.epam.training.student_Sviatlana_Blotskaya.Java_Fundamentals.Optional_Task1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //3.Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of numbers: ");
        int n = Integer.parseInt(scanner.nextLine());
        String[] array = new String[n];
        double avg = 0;
        System.out.print("Enter numbers: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextLine();
        }
        for (String arr : array) {
            avg = avg + arr.length();
        }
        System.out.println("Sum length over numbers: " + avg);
        if (n > 0) {
            avg = avg / n;
        }
        System.out.println("Average length over numbers: " + avg);
        System.out.print("Number shorter than average length: ");
        for (String arr : array) {
            if (arr.length() < avg) {
                System.out.println(arr + " length= " + arr.length());
            }
        }
        System.out.println("Number longer than average length: ");
        for (String arr : array) {
            if (arr.length() > avg) {
                System.out.println(arr + " length= " + arr.length());
            }
        }
    }
}

