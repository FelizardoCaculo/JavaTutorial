package Exercises;

public class Ex005PrintOddNumbersFrom1To30 {
    public static void main(String[] args) {
        System.out.println("\nImprimir números ímpares de 1 a 30: \n");
        for (int controlVariable = 1; controlVariable <= 30; controlVariable += 2) {
            System.out.println(controlVariable);
        }
    }
}