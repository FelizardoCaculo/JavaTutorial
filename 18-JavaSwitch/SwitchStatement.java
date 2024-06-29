import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args){
        /*
         * The switch statement selects one of many code blocks to be executed
         */
        Scanner userInput = new Scanner(System.in);
        int weekDay;

        System.out.println("\nEscreva um número entre 1 a 7 para ver o dia da semana correspondente: ");
        weekDay = userInput.nextInt();

        switch (weekDay){
            case 1:
                System.out.println("Domingo\n");
                break;
            case 2:
                System.out.println("Segunda-Feira\n");
                break;
            case 3:
                System.out.println("Terça-Feira\n");
                break;
            case 4:
                System.out.println("Quarta-Feiran\n");
                break;
            case 5:
                System.out.println("Quinta-feira\n");
                break;
            case 6:
                System.out.println("Sexta-Feira\n");
                break;
            case 7:
                System.out.println("Sábado\n");
                break;
            default:
                System.out.println("Escolha somente um número no intervalo de 1 a 7!!!");
        }
    }
}
