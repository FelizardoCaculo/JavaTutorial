import java.util.Scanner;
import java.lang.Math;

public class MathLibrary {
    public static void main(String[] args){
        /*
         * A classe Math tem muitos métodos que permitem efectuar operações matemáticas em números
         */
        Scanner userInput = new Scanner(System.in);
        System.out.println("=== Maior/Menor ===");
        int firstNumber;
        int lastNumber;
        int randomNumber = (int) (Math.random() * 101); //Fórmula para gerar um número aleatório entre 0 à 100

        System.out.println("Digite o primeiro número: ");
        firstNumber = userInput.nextInt();
        System.out.println("Digite o segundo número: ");
        lastNumber = userInput.nextInt();
        
        System.out.println(randomNumber + " ===> Este é um número aleatório gerado entre 0 à 100");
        System.out.println("O maior número é: " + Math.max(firstNumber, lastNumber));
        System.out.println("O menor número é: " + Math.min(firstNumber, lastNumber));
        System.out.println("\nA raís quadrada de " + y + " é: " + Math.sqrt(lastNumber));
        userInput.close();
    }
}
