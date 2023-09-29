package org.example.tasks;

import java.util.Arrays;

public class Task3 {
    public void methodForTask3() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Массив:\n" + Arrays.toString(array));
        System.out.println("Элементы, кратные 3:");
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 3 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
