import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args){
        //O sinal de adição + é usado para juntar Strings
        Scanner userInput = new Scanner(System.in);
        String firstName;
        String lastName;

        System.out.println("\nEscreva seu primeiro nome: ");
        firstName = userInput.next();
        System.out.println("Escreva seu último nome: ");
        lastName = userInput.next();
        System.out.println(firstName + lastName); //juntando strins sem espaço
        System.out.println(firstName + " " + lastName); //juntando strings com espaço
        //Também podemos usar o método abaixo para contenar
        System.out.println(firstName.concat(lastName));
        userInput.close();
    }
}
