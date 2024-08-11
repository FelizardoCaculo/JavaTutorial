public class ArraysLoop {
    public static void main(String[] args) {
        //Loop through an array using for
        String[] carsMark = {"Toyota", "Hunday", "Kia", "Mercedes", "Audi"};
        System.out.print("\nMarcas de carro: ");
        for(int iterableVariable = 0; iterableVariable < carsMark.length; iterableVariable++){
            System.out.print(carsMark[iterableVariable] + ", ");
        }
        System.out.println("\n");

        //Loop through an array using for-each
        System.out.print("\nMarcas de carro: ");
        for(String iterableVariable : carsMark){
            System.out.print(iterableVariable + ", ");
        }

        System.out.println("\n");
    }
}
