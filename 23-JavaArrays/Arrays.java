public class Arrays {
    public static void main(String[] args) {
        //Declaring an array
        String[] carsMark = new String[3];//o 3 represente o de elementos que o array vai conter

        //Assigning values to an array
        carsMark[0] = "Fiat";
        carsMark[1] = "Tesla";
        carsMark[2] = "Ferrarri";

        //Declaring and assigning values to an array
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

        //Printing an array
        System.out.print("\n\nMarcas de Carro - Lista 1: ");
        for(String iterableVariable : carsMark){
            System.out.print(iterableVariable + ", ");
        }

        //Changing an Array element
        System.out.print("\n\nMarcas de Carro - Lista 2: ");
        for(String iterableVariable : secondCarsMark){
            System.out.print(iterableVariable + ", ");
        }
        secondCarsMark[0] = "Toyota";
        System.out.print("\n\nMarcas de carro - Lista 3: ");
        for(String iterableVariable : secondCarsMark){
            System.out.print(iterableVariable + ", ");
        }

        //The array length
        System.out.println("\n\nTemos " + secondCarsMark.length + " marcas de carro na nossa concessonária");
        System.out.println();
    }
}
