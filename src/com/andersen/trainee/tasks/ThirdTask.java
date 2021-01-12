/*
Составить алгоритм: на входе есть числовой массив,
необходимо вывести элементы массива кратные 3
*/

package com.andersen.trainee.tasks;

import java.util.Scanner;

public class ThirdTask {

    @SuppressWarnings("resources")
    public static void main(String[] args) {

        int k, sum = 0;

        Scanner s =  new Scanner(System.in);
        System.out.println("write array length:");
        k = s.nextInt();

        int[] mas = new int[k];

        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random()*(10 - 1 + 1)) + 1;
        }

        System.out.println("mas = ");

        for (int i = 0; i < mas.length; i++) {
            System.out.print(mas[i] + " | ");
        }

        System.out.println("\nArray elements are multiples of 3:");

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 3 == 0) {
                System.out.print(" mas[" + i + "]" + " = " + mas[i] + " | ");
                sum = sum + 1;
            }
        }

        if (sum == 0) {
            System.out.println("Aren't");
        }
    }
}

