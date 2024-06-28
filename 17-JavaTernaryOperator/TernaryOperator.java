public class TernaryOperator {
    public static void main(String[] args) {
        /*
         * Sintax
         * variable = (condition) ? expressionTrue : expressionFalse;
         */

         int time = 20;
         
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
