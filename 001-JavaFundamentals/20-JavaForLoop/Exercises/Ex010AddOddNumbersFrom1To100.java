package Exercises;

public class Ex010AddOddNumbersFrom1To100 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("\nImprimindo a soma dos números pares entre 1 à 100\n");
        for (int controlVariable = 2; controlVariable <= 100; controlVariable += 2) {
            sum += controlVariable;
        }
        System.out.println("\nO valor da soma é: " + sum);
    }
}