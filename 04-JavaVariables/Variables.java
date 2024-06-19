public class Variables{
    public static void main(String[] args){
        //Declaring variables ( type variableName = value )
        String name = "Felizardo";  //declaring and assigning a value
        int age = 36;
        double weight;  //declaring without assigning a value
        weight = 72.6;
        final String race = "Negra"; //declaring a contant (we use the final keyword)
        String FirstName = "Felizardo";
        String LastName = "Caculo";

        //Declare Many Variables using comma-separated
        int x = 5, y = 6, z = 50;
        int soma = x + y + z;

        //Printing Variables
        System.out.println("\nOlá, meu nome é, " + name + ", tenho " + age + " anos de idade");
        System.out.println("Quando eu tinha 30 anos pesava, " + weight + " kilos");
        weight = 75.3; //changing a variable value;
        System.out.println("Agora que tenho " + age + " anos, estou pesando " + weight + " kilos");
        System.out.println("Tenho muito orgulho de pertencer a raça, " + race);
        System.out.println("Nome Completo: " + FirstName + " " + LastName);
        System.out.println("A soma dos valores de X, Y e Z é: " + soma);

    }
}