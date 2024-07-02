public class ForEachLoop {
    public static void main(String[] args) {
        /*
         * O laço for-each é usado exclusivamente para percorrer os elementos de arrays/listas
         */

        String[] carMarks = {"Volvo", "BMW", "Ford", "Mazda"};
        //For-Each structure in Java
        System.out.println("\n");
        for (String iterableName : carMarks) {
            System.out.println(iterableName);
        }
        System.out.println("\n");
    }
}
