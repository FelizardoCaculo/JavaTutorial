import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
      /*
      * Sintax
      * variable = (condition) ? expressionTrue : expressionFalse;
      */
      Scanner input = new Scanner(System.in);
      int time;

      System.out.println("\nQue horas são?");
      time = input.nextInt();
      //if else statement
      if (time < 18) {
         System.out.println("Good day!");
      } else {
         System.out.println("Good evening!");
      }
      //Ternary Operator
      String result = (time < 18) ? "Good day!" : "Good evening!";
      System.out.println(result);
   }       
}
