import java.util.Scanner;

public class Exercise001 {
    public static void main(String[] args) {
        //Exercise001 - Par ou Ímpar
        Scanner userInput = new Scanner(System.in);
        int chousenNumber;

        System.out.println("\n===========================================================");
        System.out.println("\t\tPROGRAMA = PAR OU ÍMPAR");
        System.out.println("===========================================================\n");
        System.out.println("\nEscolha e escreva um número inteiro qualquer: ");
        chousenNumber = userInput.nextInt();

        if(chousenNumber % 2 == 0){
            System.out.println("\nO número escolhido é PAR");
        } else {
            System.out.println("\nO número escolhido é ÍMPAR");
        }
        System.out.println();
        userInput.close();
    }
}
