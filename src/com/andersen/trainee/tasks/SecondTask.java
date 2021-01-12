/*
Составить алгоритм: если введенное имя совпадает с Вячеслав,
то вывести “Привет, Вячеслав”, если нет, то вывести "Нет такого имени"
*/

package com.andersen.trainee.tasks;

import java.util.Scanner;

public class SecondTask {

    @SuppressWarnings("resources")
    public static void main(String[] args) {

        String s1, s2;

        s2 = "Вячеслав";

        Scanner s =  new Scanner(System.in);
        System.out.println("write s1:");
        s1 = s.nextLine();

        if (s1.equals(s2)) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}