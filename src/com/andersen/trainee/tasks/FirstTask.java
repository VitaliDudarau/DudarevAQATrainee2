/*
Составить алгоритм: если введенное число больше 7, то вывести “Привет”
*/

package com.andersen.trainee.tasks;

import java.util.Scanner;

public class FirstTask {

    @SuppressWarnings("resources")
    public static void main(String[] args) {

        int a;

        Scanner s =  new Scanner(System.in);
        System.out.println("write a:");
        a = s.nextInt();

        if (a > 7) {
            System.out.println("Привет");
        } else {
            System.out.println("You wrote a number less than or equal to 7");
        }
    }
}