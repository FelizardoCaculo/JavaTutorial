public class TypeCasting {
    public static void main(String[] args){
        /*
        * Type casting is when assign a value of one primitive data to another type:
        * Thera are two ways in Java
        */

        //Widening Casting (automatically) 
        //byte -> short -> char -> int -> long -> float -> double
        int myInt = 9;
        System.out.println(myInt);
        double myDouble = myInt; // Automatic casting int to double
        System.out.println(myDouble);

        //Narrowing Casting (manually)
        //double -> float -> long -> int -> char -> short -> byte
        double myNewDouble = 9.78d;
        System.out.println(myNewDouble);
        int myNewInt = (int) myNewDouble; //Manual casting double to int
        System.out.println(myNewInt);
    }
}
