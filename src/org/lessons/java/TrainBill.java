package org.lessons.java;

import java.util.Scanner;

public class TrainBill {
    public static void main(String[] args) {
        int tripDistance = 0;
        int userAge = 0;
        double priceForKm = 0.21;
        double totalPrice = 0;
        double finalPrice = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Ciao!");

        // Viene chiesto all'utente la distanza da percorrere
        System.out.print("Per favore, inserisci il numero di chilometri che vuoi percorrere: ");

        tripDistance = Integer.parseInt(scan.nextLine());

        // Viene chiesto all'utente l'età'
        System.out.print("Per favore, inserisci la tua età: ");

        userAge = Integer.parseInt(scan.nextLine());

        // Calcolo del prezzo totale
        totalPrice = priceForKm * tripDistance;

        System.out.println("Il prezzo totale del viaggio è: " + totalPrice);

        // Calcolo di eventuali sconti
        if (userAge < 18) {
            System.out.println("Hai diritto a uno sconto del 20%!");
            finalPrice = totalPrice - ((totalPrice/100) * 20);
        } else if (userAge > 65) {
            System.out.println("Hai diritto a uno sconto del 40%!");
            finalPrice = totalPrice - ((totalPrice/100) * 40);
        } else {
            System.out.println("Non hai diritto a nessuno sconto");
            finalPrice = totalPrice;
        }

        // Output del prezzo finale
        System.out.println("Prezzo finale del biglietto: " + finalPrice);
    }
}