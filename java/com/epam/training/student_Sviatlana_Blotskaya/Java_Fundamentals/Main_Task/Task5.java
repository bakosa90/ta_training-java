package com.epam.training.student_Sviatlana_Blotskaya.Java_Fundamentals.Main_Task;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        //Ввести число от 1 до 12. Вывести на консоль название месяца, соответствующего данному числу.
        // Осуществить проверку корректности ввода чисел.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of month: ");
        int numberOfMonth = scanner.nextInt();
        String[] month = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" };
        if (numberOfMonth > 0 && numberOfMonth < month.length) {
            System.out.println(month[numberOfMonth]);
        } else {
            System.out.println("Month not found, enter number of month from 1 to 12");
        }
    }
}
