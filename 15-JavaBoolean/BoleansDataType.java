import java.util.Scanner;

public class BoleansDataType {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        int x = 10;
        int y = 20;
        int minhaIdade;
        int idadeParaVotar;

        System.out.println("Quantos anos voce tem? ");
        minhaIdade = input.nextInt();
        System.out.println("Qual é a idade mínima para votar no teu país? ");
        idadeParaVotar = input.nextInt();
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        System.out.println("\nO resultado da comparação (x > y) é: " + (x > y));
        System.out.println("O resultado da comparação (x < y) é: " + (x < y));
        System.out.println("O resultado da comparação (x == y) é: " + (x == y));
        if (minhaIdade >= idadeParaVotar) {
            System.out.println("\nMinha idade me permite votar!");
        } else {
            System.out.println("\nMinha idade não me permite votar!");
        }
    }
}
