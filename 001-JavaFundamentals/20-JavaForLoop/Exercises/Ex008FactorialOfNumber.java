package Exercises;

import java.util.Scanner;

public class Ex008FactorialOfNumber {    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int factorial = 1;
        int number;
        System.out.println("\nEscreva um número entre 1 à 16 para calcular seu fatorial: \n");
        number = userInput.nextInt();
        if (number < 0 || number > 16){
            System.out.println("👇👇👇👇Número inválido, Siga a instrução por favor!👇👇👇👇\n");
            System.out.println("Escreva um número entre 1 à 16 para calcular seu fatorial: \n");
        } else {
            for (int controlVariable = 1; controlVariable <= number; controlVariable++) {
                factorial *= controlVariable;
            }
            System.out.println("\nO fatorial de " + number + " é: " + factorial);
        }        
        userInput.close();
    }    
}
