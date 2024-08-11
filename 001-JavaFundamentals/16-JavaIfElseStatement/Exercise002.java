import java.util.Scanner;

public class Exercise002 {
    public static void main(String[] args) {
        //Exercise002 - Ano Bissexto
        Scanner userInput = new Scanner(System.in);
        int chousenYear;

        System.out.println("\n================================================");
        System.out.println("\tPROGRAMA = ANO COMUM/BISSEXTO");
        System.out.println("================================================\n");
        System.out.println("\nEscolha um ano para verificar se é comum ou Bissexto: ");
        chousenYear = userInput.nextInt();

        if(((chousenYear % 4 == 0) && (chousenYear % 100 != 0)) || (chousenYear % 400 ==0)){
            System.out.println("\nO ano escolhido é um: ANO BISSEXTO!\n");
        } else {
            System.out.println("\nO ano escolhido é um: ANO COMUM!\n");
        }
        userInput.close();
    }
}
