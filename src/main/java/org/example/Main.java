package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k, i;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz :");
        k = inp.nextInt();

        for (i = 1; i <= k; i++) {
            if (i % 3 == 0) {
                if (i % 4 == 0) {
                    System.out.println("Girilen sayıdan sıfıra kadar üçe ve dörde tam bölünen sayılar :" + i);
                }
            }
        }
    }
}