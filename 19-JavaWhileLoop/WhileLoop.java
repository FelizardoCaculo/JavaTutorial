public class WhileLoop {
    public static void main(String[] args){
        //while loop
        System.out.println("\nLoop com while");
        int i = 0;
        int j = 0;
        while (i < 6){
            System.out.println(i);
            i++;
        }

        while (i < 21){
            System.out.println(i);
            i++;
        }
        //do while loop
        System.out.println("\nLoop com do while");
        do {
            System.out.println(j);
            j++;
        } while (i < 10);
    }
}
