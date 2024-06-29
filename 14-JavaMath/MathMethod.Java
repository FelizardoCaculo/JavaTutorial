import java.util.Scanner;

public class MathMethod{
    public static void main(String[] args){
        /*
         * A classe Math tem muitos métodos que permitem efectuar operações matemáticas em números
         */
        Scanner input = new Scanner(System.in);
        System.out.println("=== Maior/Menor ===");
        int x;
        int y;
        int randomNumber = (int) (Math.random() * 101); //Fórmula para gerar um número aleatório entre 0 à 100

        System.out.println("Digite o primeiro número: ");
        x = input.nextInt();
        System.out.println("Digite o segundo número: ");
        y = input.nextInt();
        
        System.out.println(randomNumber + " ===> Este é um número aleatório gerado entre 0 à 100");
        System.out.println("O maior número é: " + Math.max(x, y));
        System.out.println("O menor número é: " + Math.min(x, y));
        System.out.println("A raís quadrada de " + y + " é: " + Math.sqrt(y));
    }
}