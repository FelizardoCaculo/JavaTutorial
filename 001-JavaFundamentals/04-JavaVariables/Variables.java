public class Variables{

    /*
     * Variable, is name of reserved area allocated in memory. n other words, it is a name of memory location. 
     * Thera are 3 types of variables:
     * 1 - Local Variable: it is declared inside the body of a method,
     *      constructor or block, they can not be defined with "static"
     *      keyword
     * 2 - Instance Variable: it is declared inside the class, but 
     *      outside of the body of the method, it is not declared as static.
     *      Its value is instance specific and is not shared among instances.
     * 3 - Static Variable: is declared as static (with static keyword). 
     *      It cannot be local. You can create a single copy of static variable 
     *      and share among all the instances of the class. Memory allocation
     *      for static variable happens only once when the class is loaded in memory.
     * 
     *      Resumo
     *      Local: Usada temporariamente dentro de métodos.
     *      Instância: Pertence a objetos, cada instância tem sua própria cópia.
     *      Estática: Compartilhada por todas as instâncias da classe.
     */

    // This is a "Local Variable:"
    public void myMethod() {
        int localVar = 10; // variável local
        System.out.println(localVar);
    }

    // This is an "Instance Variable"
    int instanceVar; // variável de instância

    // This is an "Static Variable"
    static int staticVar; // variável estática

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