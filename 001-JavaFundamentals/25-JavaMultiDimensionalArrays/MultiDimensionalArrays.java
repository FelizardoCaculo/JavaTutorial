public class MultiDimensionalArrays {
    public static void main(String[] args) {
        //Creating two-dimensional array
        int [][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} }; //it's an array with two arrays as its elements

        //Accessing elements
        System.out.println("\nAcessando elemento de uma lista de 2 dimenções: \n");
        System.out.println(myNumbers[1][2]);

        //Change Element values
        myNumbers[1][2] = 9;
        System.out.println("\nMudando elemento de uma lista de 2 dimenções: \n");
        System.out.println(myNumbers[1][2]);

        //Loop through a Multi-Dimensional Array
        System.out.println("\nIterando uma lista de 2 dimenções usando for: \n");
        int [][] mySecondNumber = { {1, 2, 3, 4,}, {5, 6, 7}};
        for(int firstIterableVariable = 0; firstIterableVariable < mySecondNumber.length; ++firstIterableVariable){
            for(int secondIterableVariable = 0; secondIterableVariable < mySecondNumber[firstIterableVariable].length; ++secondIterableVariable){
                System.out.println(mySecondNumber[firstIterableVariable][secondIterableVariable]);
            }
        }
        System.out.println("\nIterando uma lista de 2 dimenções usando for-each: \n");
        for(int [] row : mySecondNumber){
            for(int iterableVariable : row){
                System.out.println(iterableVariable);
            }
        }
        System.out.println();
    }    
}
