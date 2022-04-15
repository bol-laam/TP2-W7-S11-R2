package com.bol.laam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Belajar Deret Aritmatika, Geometri dan menghitung Faktorial\n");

        System.out.print("Masukkan banyak angka yang mau dicetak [2..10]: ");
        int printSize = input.nextInt();
        if (printSize < 2 || printSize > 10) {
            System.out.println("Maaf angka tidak valid!");
            return;
        }

        System.out.print("Masukkan beda masing-masing angka [2..9]: ");
        int gapNumber = input.nextInt();
        if (gapNumber < 2 || gapNumber > 9) {
            System.out.println("Maaf angka tidak valid!");
            return;
        }

        ArrayList<Integer> arithmeticNumbers = new ArrayList<>(List.of(1));
        for (int i = 1; arithmeticNumbers.size() < printSize; i++) {
            int arithmetic = arithmeticNumbers.get(i - 1) + gapNumber;
            arithmeticNumbers.add(arithmetic);
        }
        System.out.println("\n" + "Deret Aritmatika :");
        arithmeticNumbers.forEach(e -> System.out.print(e + " "));

        ArrayList<Integer> geometricNumbers = new ArrayList<>(List.of(1));
        for (int i = 1; geometricNumbers.size() < printSize; i++) {
            int geometric = geometricNumbers.get(i - 1) * gapNumber;
            geometricNumbers.add(geometric);
        }
        System.out.println("\n\n" + "Deret Geometri :");
        geometricNumbers.forEach(e -> System.out.print(e + " "));

        System.out.println("\n\n" + "Faktorial dari " + printSize + " :");
        int factorialNumber = 1;
        for (int i = printSize; i != 0; i--) {
            if (i != 1) {
                System.out.print(i + " * ");
            } else {
                System.out.print(i);
            }
            factorialNumber = factorialNumber * i;
        }
        System.out.print(" = " + factorialNumber);
    }
}
