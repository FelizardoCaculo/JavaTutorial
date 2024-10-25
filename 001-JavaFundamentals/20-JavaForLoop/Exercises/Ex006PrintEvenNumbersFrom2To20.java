package Exercises;

public class Ex006PrintEvenNumbersFrom2To20 {
    public static void main(String[] args) {
        System.out.println("\nListando números pares de 2 à 20\n");
        for (int controlVariable = 2; controlVariable <= 20; controlVariable += 2) {
            System.out.println(controlVariable);
        }
    }
}