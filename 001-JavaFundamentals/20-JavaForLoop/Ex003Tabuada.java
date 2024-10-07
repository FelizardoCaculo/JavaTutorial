import java.util.Scanner;

public class Ex003Tabuada {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("\nEscreva um número inteiro para calcular sua tabuada: ");
        int tabuada = userInput.nextInt();

        System.out.println("\nTabuada de: " + tabuada + "\n");
        System.out.println("=============\n");

        for(int counterVariable = 1; counterVariable <= 12; counterVariable++){
            System.out.println(counterVariable + " X " + tabuada + " = " + counterVariable * tabuada);
        }
        System.out.println("\n=============\n");
        userInput.close();
        
    }

}
