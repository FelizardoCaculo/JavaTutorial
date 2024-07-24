import java.util.Scanner;

public class Exercise004 {
    public static void main(String[] args) {
        //Exercise004 - Verifica se um número é positivo ou negativo
        Scanner userInput = new Scanner(System.in);
        int integerNumber;

        System.out.println("\n===============================================");
        System.out.println("\tPROGRAMA = POSITIVO OU NEGATIVO");
        System.out.println("===============================================\n");
        
        
        System.out.println("\nEscreva um número inteiro qualquer: ");
        integerNumber = userInput.nextInt();

        if(integerNumber > 0){
            System.out.println("\nNúmero POSITIVO!");
        } else if(integerNumber < 0){
            System.out.println("\nNúmero NEGATIVO!");
        } else {
            System.out.println("\nZero!");
        }

        userInput.close();
    }
}
