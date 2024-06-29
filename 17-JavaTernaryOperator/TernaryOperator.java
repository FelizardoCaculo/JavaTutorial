import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
      /*
      * Sintax
      * variable = (condition) ? expressionTrue : expressionFalse;
      */
      Scanner userInput = new Scanner(System.in);
      int timeInHour;

      System.out.println("\nQue horas são?");
      timeInHour = userInput.nextInt();
      //if else statement
      if (timeInHour < 18) {
         System.out.println("Good day!");
      } else {
         System.out.println("Good evening!");
      }
      //Ternary Operator
      String resultWithTernaryOperator = (timeInHour < 18) ? "Good day!" : "Good evening!";
      System.out.println(resultWithTernaryOperator);
      userInput.close();
   }       
}
