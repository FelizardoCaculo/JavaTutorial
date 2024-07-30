import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args) {
        /*
         * Java has the following condition statements
         * 1- Use "if" to specify a block of code to be executed, if a specified condition is true
         * 2- Use "else" to specify a block of code to be executed, if a specified condition is false
         * 3- Use "else if" to specify a new conditions to test, if the first condition is false
         * 1- Use "switch" to specify meny alternative block of code to be executed.
         */
        Scanner userInput = new Scanner(System.in);
        int firstNumber;
        int lastNumber;
        int timeInHour;
        byte idade = 20;

        System.out.println("\nDigite o primeiro número inteiro: ");
        firstNumber = userInput.nextInt();
        System.out.println("Digite o segundo número inteiro: ");
        lastNumber = userInput.nextInt();
        System.out.println("Que horas são? ");
        timeInHour = userInput.nextInt();

        //The if statement
        if (firstNumber > lastNumber) {
            System.out.println(firstNumber + " é maior que " + lastNumber);
        }

        if(idade > 18){
            System.out.println("\nIdade é maior que " + idade);
        }
        

        //The else statement / if else
        if (timeInHour < 18) {
            System.out.println("Bom dia!");
        } else {
            System.out.println("Boa noite!");
        }


        //The else if statement
        timeInHour = 17;
        if (timeInHour < 12) {
            System.out.println("Ainda não são 12 horas. Bom dia!\n");
        } else if (timeInHour > 12 && timeInHour < 18) {
            System.out.println("Ainda não são 18 horas. Boa tarde!\n");
        } else {
            System.out.println("Ja passou das 17 horas. Boa noite!\n");
        }

        //Nested if statement
        System.out.println("\nQuantos kilos você pesa?");
        double weight = userInput.nextDouble();
        if(idade >= 18){
            if(weight > 50){
                System.out.println("Vocé é elegível para doar sangue!");
            }
        }

        userInput.close();
    }
}
