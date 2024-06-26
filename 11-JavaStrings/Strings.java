public class Strings{
    public static void main(String[] args){
        //Creating string variables to perform operations using methods
        String greeting = "Olá, Bom dia!";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        System.out.println("\n" + greeting);

        //Medindo o cumprimento (número de caracteres) de uma variável do tipo String
        System.out.println("O alfabeto contém " + alphabet.length() + " letras");

        //Mais métodos de Strings
        System.out.println("Letras Maiúsculas: " + alphabet.toUpperCase());
        System.out.println("Letras Minúsculas: " + alphabet.toLowerCase());
        System.out.println("A letra Y está é a " + alphabet.indexOf("Y") + "ª letra do alfabeto, contando a partir de zero");
        System.out.println("A letra L está é a " + alphabet.indexOf("L") + "ª letra do alfabeto, contando a partir de zero");

    }
}