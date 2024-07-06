public class Arrays {
    public static void main(String[] args) {
        //Declaring an array
        String[] carsMark;

        //Assigning values to an array
        String secondCarsMark[] = {"Volvo", "BMW", "Ford", "Mazda"};

        //Declaring and assigning values
        String[] caculoBrothers = {"Felizardo", "Mérito", "Júbilo", "Memória", "Aurora", "Jesualda", "Ramísio", "Sílvio"};

        //printing all the array alements
        System.out.print("\nOs irmãos Caculo são: ");
        for(String iterableVariable : caculoBrothers){
            System.out.print(iterableVariable + " Caculo, ");
        }

        //Accessing the value of the first element
        System.out.println("\nO primogénito dos irmãos Caculo é o: " + caculoBrothers[0]);

        //Changing an Array element
        System.out.print("\n\nMarcas de Carro: ");
        for(String iterableVariable : secondCarsMark){
            System.out.print(iterableVariable + ", ");
        }
        secondCarsMark[0] = "Toyota";
        System.out.print("\n\nMarcas de carro: ");
        for(String iterableVariable : secondCarsMark){
            System.out.print(iterableVariable + ", ");
        }

        //The array length
        System.out.println("\n\nTemos " + secondCarsMark.length + " marcas de carro na nossa concessonária");
        System.out.println();
    }
}
