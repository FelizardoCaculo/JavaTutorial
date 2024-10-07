public class Ex004AddNumbersFrom1To100 {

    public static void main(String[] args) {
        
        System.out.println("\nAdicionando números de 1 a 100: \n");
        int sumOfNumbers = 0;
        for (int counterVariable = 1; counterVariable <=100; counterVariable++) {
            sumOfNumbers += counterVariable; 
        }
        System.out.println("Soma: " + sumOfNumbers);

    }

}