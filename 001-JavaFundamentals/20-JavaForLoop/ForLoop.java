//import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        //Scanner userInput = new Scanner(System.in);
        System.out.println("\nPrimeiro de repetição com for ...\n");
        for (int counterVariable = 1; counterVariable <= 10; counterVariable ++){
            System.out.println(counterVariable);
        }

        System.out.println("\nSegundo Laço de repetição com for ...\n");
        for(int counterVariable = 0; counterVariable <= 10; counterVariable++){
            System.out.println(counterVariable);
        }

        //Nested Loop
        System.out.println("\nTerceiro Laço for usando laço aninhado ...\n");
        for(int firstCounterVariable = 1; firstCounterVariable <= 2; firstCounterVariable++){
            System.out.println("Eu sou o primeiro laço de repetição");
            for(int secondCounterVariable = 1; secondCounterVariable <= 3; secondCounterVariable++){
                System.out.println("Eu sou o segundo laço de repetição e estou aninhado ao primeiro laço de repetição");
            }
        }
    }
}
