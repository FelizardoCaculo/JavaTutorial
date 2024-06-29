import java.util.Scanner;

public class NumbersStrings {
    public static void main(String[] args){
        //usamos o sinal + para adição(números) e concatenação(Strings)
        Scanner userInput = new Scanner(System.in);
        int firstNumber;
        int lasteNumber;
        String firstString = "10";
        String lastString = "20";
        System.out.println("\nEscreva o primeiro número: ");
        firstNumber = userInput.nextInt();
        System.out.println("Escreva o último número: ");
        lasteNumber = userInput.nextInt();

        System.out.println("\nSomando números temos como resultado: " + (firstNumber + lasteNumber));
        System.out.println("Concatenando Strings temos como resultado: " + (firstString + lastString));
        System.out.println("Concatenando Número e String temos como resultado: " + (firstNumber + lastString));
        userInput.close();
    }
}
