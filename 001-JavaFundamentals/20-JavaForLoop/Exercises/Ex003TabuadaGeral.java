package Exercises;
public class Ex003TabuadaGeral {
    public static void main(String[] args) {

        // Exemple using nested loop
        System.out.println("\n=== Tabuada Geral de 1 à 12 ===");
        for (int counterVariable = 1; counterVariable <= 12; counterVariable++) {
            System.out.println("\nTabuada de: " + counterVariable + "\n");
            for (int tabuada = 1; tabuada <= 12; tabuada++) {
                System.out.println(counterVariable + " X " + tabuada + " = " + counterVariable * tabuada);
            }
            System.out.println("=============");
        }

    }

}
