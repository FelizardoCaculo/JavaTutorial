public class ForEachLoop {
    public static void main(String[] args) {
        /*
         * O laço for-each é usado exclusivamente para percorrer os elementos de arrays/listas
         */

        String[] carMarks = {"Volvo", "BMW", "Ford", "Mazda"};
        byte[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 15, 16, 17, 18, 19, 20};
        char[] theEnglishAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'w', 'y', 'z'};
        //For-Each structure in Java
        System.out.print("\nLista de Marcas de carros: ");
        for (String iterableName : carMarks) {
            System.out.print(iterableName.toUpperCase() + ", ");
        }

        System.out.print("\n\nContagem numérica até 20: ");
        for (byte iterableNumbers : numbers) {
            System.out.print(iterableNumbers + ", ");
        }

        System.out.print("\n\nAlfabeto Inglês: ");
        for (char iterableCharacters : theEnglishAlphabet) {
            System.out.print(iterableCharacters + ", ");
        }

        System.out.println("\n\n");
    }
}
