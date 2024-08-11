import java.util.Scanner;

public class TernaryOperator {
   public static void main(String[] args) {
      /*
      * Sintax
      * variable = (condition) ? expressionTrue : expressionFalse;
      */
      Scanner userInput = new Scanner(System.in);
      int integerNumber;

      System.out.println("\nEscreva um número inteiro qualquer: ");
      integerNumber = userInput.nextInt();

      //Ternary Operator
      String resultWithTernaryOperator = (integerNumber % 2 == 0) ? "O número digitado é PAR!" : "O número digitado é ÍMPAR!";
      System.out.println(resultWithTernaryOperator);
      userInput.close();
   }       
}
