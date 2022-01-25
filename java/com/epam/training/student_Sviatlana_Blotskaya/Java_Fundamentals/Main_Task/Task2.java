package com.epam.training.student_Sviatlana_Blotskaya.Java_Fundamentals.Main_Task;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //2.Отобразить в окне консоли аргументы командной строки в обратном порядке.

        System.out.println("input string for reverse");
        Scanner arguments = new Scanner(System.in);
        StringBuilder text = new StringBuilder(arguments.nextLine());
        text.reverse();
        System.out.println(text);
    }
}

