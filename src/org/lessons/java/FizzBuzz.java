package org.lessons.java;

public class FizzBuzz {
    public static void main(String[] args) {
        String fizzBuzzText ="";

        // Ciclo for che scorra da numero a numero
        for (int i = 1; i < 101; i++) {
            if (i % 3 == 0) {
                fizzBuzzText += "Fizz ";
            }
            if (i % 5 == 0) {
                fizzBuzzText += "Buzz ";
            }

            if (fizzBuzzText != "") {
                System.out.print(fizzBuzzText);
            } else {
                System.out.print(i + " ");
            }

            fizzBuzzText = "";
        }
    }
}
