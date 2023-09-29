package org.example;

import org.example.tasks.Task1;
import org.example.tasks.Task2;
import org.example.tasks.Task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String listOfTasks = "\n1. Задание№1\n2. Задание№2\n3. Задание№3\n4. Выход\n";
            System.out.print(listOfTasks + "Выберите задание:");

            if (scanner.hasNextInt()) {
                int taskNumber = scanner.nextInt();
                switch (taskNumber) {
                    case 1:
                        Task1 taskFor1 = new Task1();
                        taskFor1.methodForTask1();
                        break;
                    case 2:
                        Task2 taskFor2 = new Task2();
                        taskFor2.methodForTask2();
                        break;
                    case 3:
                        Task3 taskFor3 = new Task3();
                        taskFor3.methodForTask3();
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Введён неправильный номер");
                }
            } else {
                System.out.println("Было введено нечисловое значение");
                scanner.next();
            }
        }
    }
}


