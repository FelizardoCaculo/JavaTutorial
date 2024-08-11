import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args){
        //while loop
        Scanner userInput = new Scanner(System.in);
        int whileLoopCounter = 0;
        int doWhileLoopCounter = 0;
        int whileLoopControleVariable;
        int doWhileLoopControleVariable;

        System.out.println("\nLoop com while");
        System.out.println("\nEscreva um número inteiro para controlar o laço While: ");
        whileLoopControleVariable = userInput.nextInt();
        while (whileLoopCounter < whileLoopControleVariable){
            System.out.println(whileLoopCounter);
            whileLoopCounter++;
        }
        whileLoopCounter = 0;
        System.out.println("\nEscreva outro númeri inteiro para controlar o segundo laço while: ");
        whileLoopControleVariable = userInput.nextInt();
        while (whileLoopCounter < whileLoopControleVariable){
            System.out.println(whileLoopCounter);
            whileLoopCounter++;
        }
        //do while loop
        System.out.println("\nLoop com DoWhile");
        doWhileLoopControleVariable = userInput.nextInt();
        do {
            System.out.println(doWhileLoopCounter);
            doWhileLoopCounter++;
        } while (doWhileLoopCounter < doWhileLoopControleVariable);
        userInput.close();
    }
}
