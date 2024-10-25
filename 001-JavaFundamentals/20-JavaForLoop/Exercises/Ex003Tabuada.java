package Exercises;

import java.util.Scanner;

import java.text.DecimalFormat;

public class Ex003Tabuada {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#00");
        Scanner userInput = new Scanner(System.in);
        System.out.println("\nEscreva um número inteiro para calcular sua tabuada: ");
        int tabuada = userInput.nextInt();

        System.out.println("\nTabuada de: " + tabuada + "\n");
        System.out.println("=============\n");

        for (int counterVariable = 1; counterVariable <= 12; counterVariable++) {
            System.out.println(df.format(counterVariable) + " X " + df.format(tabuada) + " = " + df.format(counterVariable * tabuada));
        }
        System.out.println("\n=============\n");
        userInput.close();
    }
}