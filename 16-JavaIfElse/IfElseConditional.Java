public class IfElseConditional{
    public static void main(String[] args) {
        /*
         * Java has the following condition statements
         * 1- Use "if" to specify a block of code to be executed, if a specified condition is true
         * 2- Use "else" to specify a block of code to be executed, if a specified condition is false
         * 3- Use "else if" to specify a new condition to test, if the first condition is false
         * 1- Use "switch" to specify meny alternative block of code to be executed.
         */
        int x = 20;
        int y = 18;
        int time = 22;

        //The if statement
        if (x > y) {
            System.out.println(x + " é maior que " + y);
        }
        
        //The else statement
        if (time < 18) {
            System.out.println("Bom dia!");
        } else {
            System.out.println("Boa noite!");
        }

        //The else if statement
        time = 17;
        if (time < 12) {
            System.println("Bom dia!");
        } else if (time > 12 && time < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite");
        }
    }
}