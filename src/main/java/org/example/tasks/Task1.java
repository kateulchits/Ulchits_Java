package org.example.tasks;

import java.util.Scanner;

public class Task1 {
    public void methodForTask1() {
        Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                if (number > 7) {
                    System.out.println("Привет");
                }
            } else {
                System.out.println("Введите число ещё раз");
                methodForTask1();
            }
        }
    }

