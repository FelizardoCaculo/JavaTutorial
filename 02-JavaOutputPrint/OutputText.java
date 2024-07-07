public class OutputText{
    public static void main(String[] args){
        //Java Output / Print
        System.out.println("\n===== Saída usando println =====");
        System.out.println("Hello world!");
        System.out.println("I am learning Java.");
        System.out.println("It is awesome!");

        System.out.println("\n===== Saída usando print =====");
        System.out.print("Hey! ");
        System.out.print("I will print on the same line!\n");

        /*
         *  %d => serve para representar dados inteiros
         *  %s => serve para representar strings
         *  %f => serve para representar floats
         */
        System.out.println("\n===== Saída usando printf =====");
        System.out.printf("I am %d years old\n", 36);
        System.out.printf("%s: %.2f kilos", "Meu peso é ", 76.2); //O .2 serve para delimitar o número de casas decimais depois da vírgula.

        System.out.println();
    }
}