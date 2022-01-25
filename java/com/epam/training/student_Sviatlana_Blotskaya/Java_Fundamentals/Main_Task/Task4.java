package com.epam.training.student_Sviatlana_Blotskaya.Java_Fundamentals.Main_Task;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //4.Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение)
        // и вывести результат на консоль.

        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int multiplicationOfNumbers = 1;
        System.out.print("Enter a number of arguments: ");
        int numberOfArguments = scanner.nextInt();
        int[] arrayOfArguments = new int[numberOfArguments];
        System.out.print("Enter integers as command line arguments: ");
        for (int i = 0; i < numberOfArguments; i++) {
            arrayOfArguments[i] = scanner.nextInt();
            sumOfNumbers = sumOfNumbers + arrayOfArguments[i];
            multiplicationOfNumbers = multiplicationOfNumbers * arrayOfArguments[i];
        }
        System.out.println("Sum of arguments= " + sumOfNumbers);
        System.out.println("Multiplication of arguments= " + multiplicationOfNumbers);
    }
}
