package Exercises;

public class Ex007PrintMultiplesOf3From3To30 {
    public static void main(String[] args) {
        System.out.println("\nListando números múltiplos de 3, de 1 até 30\n");
        for (int controlVariable = 3; controlVariable <= 30; controlVariable +=3) {
            System.out.println(controlVariable);
        }
    }
}