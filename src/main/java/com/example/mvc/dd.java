package com.example.mvc;

import java.util.Scanner;

public class dd {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < 10 - i; j++)
                System.out.print(" ");
            for (int k = 0; k < (2 * i + 1); k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
