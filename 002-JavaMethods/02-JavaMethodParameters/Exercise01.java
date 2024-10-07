import java.util.Scanner;

public class Exercise01 {

    Scanner userInput = new Scanner(System.in);
    public void myMethod(String name, int age){
        System.out.println("\nEscreva seu nome: ");
        name = userInput.nextLine();
        System.out.println("\nEscreva sua idade: ");
        age = userInput.nextInt();
        System.out.println();
        System.out.println(name + " tem " + age + " anos de idade");
    }

    public static void main(String[] args) {
        Exercise01 obj = new Exercise01();
        obj.myMethod(null, 0);;
    }
}
