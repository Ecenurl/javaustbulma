package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int total = 1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Üssü alınacak sayı: ");
        int n = sc.nextInt();
        System.out.print("Üs olacak sayı:");
        int us = sc.nextInt();
        for (int i = 1; i <= us; i++)
            total *= n;
        System.out.print(total);
    }
}
