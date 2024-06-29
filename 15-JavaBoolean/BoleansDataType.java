import java.util.Scanner;

public class BoleansDataType {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        int firstNumber;
        int lastNumber;
        int myAge;
        int minimuAgeForCitizenToVote;
        boolean greaterThan;
        boolean lessThan;
        boolean equalTo;

        System.out.println("\nEscreva o primeiro número: ");
        firstNumber = userInput.nextInt();
        System.out.println("Escreva o último número: ");
        lastNumber = userInput.nextInt();
        System.out.println("Quantos anos voce tem? ");
        myAge = userInput.nextInt();
        System.out.println("Qual é a idade mínima para votar no teu país? ");
        minimuAgeForCitizenToVote = userInput.nextInt();

        greaterThan = firstNumber > lastNumber;
        lessThan = firstNumber < lastNumber;
        equalTo = firstNumber == lastNumber;

        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        System.out.println("\nO primeiro número digitado é maior? " + greaterThan);
        System.out.println("O último número digitado é maior? " + lessThan);
        System.out.println("O primeiro e o último número são iguais? " + equalTo);
        if (myAge >= minimuAgeForCitizenToVote) {
            System.out.println("\nMinha idade me permite votar!");
        } else {
            System.out.println("\nMinha idade não me permite votar!");
        }
        
        userInput.close();
    }
}
