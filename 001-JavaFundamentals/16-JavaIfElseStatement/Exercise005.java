import java.util.Scanner;

public class Exercise005 {
    public static void main(String[] args) {
        //Exercise005 - Elegibilidade para
        Scanner userInput = new Scanner(System.in);
        int age;
        double weight;

        System.out.println("\n===============================================");
        System.out.println("\tPROGRAMA = ELEGIBILIDADE PARA DOAR SANGUE");
        System.out.println("===============================================\n");

        System.out.println("\nQuantos anos você tem? ");
        age = userInput.nextInt();
        System.out.println("\nQuanto você pesa? ");
        weight = userInput.nextDouble();

        if(age >= 18){
            if(weight > 50){
                System.out.println("\nVocê é elegível para doar sangue!");
            } else {
                System.out.println("\nVocê não é elegível para doar sangue!");
            }
        } else {
            System.out.println("\nSua idade deve ser maior que 18");
        }

        userInput.close();
    }
}
