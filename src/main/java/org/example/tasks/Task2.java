package org.example.tasks;

import java.util.Scanner;

public class Task2 {
    public void methodForTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        name = name.trim();
        if(name.equals("Вячеслав")) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
