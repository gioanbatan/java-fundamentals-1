package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        String fizzBuzzText ="";
        int numbersQty;

        // Richiesta della quantità di numeri;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Inserisci un numero maggiore di 0 e minore di 1000: ");

            numbersQty = Integer.parseInt(scan.nextLine());
        } while (numbersQty <= 0 || numbersQty >= 1000);

        // Ciclo for che scorre i numeri
        for (int i = 1; i <= numbersQty; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
            if (i % 3 == 0) {
                fizzBuzzText += "Fizz ";
            }
            if (i % 5 == 0) {
                fizzBuzzText += "Buzz ";
            }

            System.out.print(fizzBuzzText);
            // Svuotamento stringa
            fizzBuzzText = "";
        }
    }
}
