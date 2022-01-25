package com.epam.training.student_Sviatlana_Blotskaya.Java_Fundamentals.Main_Task;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //1. Приветствовать любого пользователя при вводе его имени через командную строку.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName);
    }
}
