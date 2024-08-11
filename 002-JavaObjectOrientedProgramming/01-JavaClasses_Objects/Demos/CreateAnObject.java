public class CreateAnObject {

    /*
     * In Java, an object is created from a class. We have already created the class named
     * CreateAnObject, so now we can use this to create objects.
     */

    int x = 5;
    int y = 6;
    int z = x + y;
    int sum = x + y + z;
    public static void main(String[] args) {
        //Create an object called "myObj" and print the value of x
        CreateAnObject myObj = new CreateAnObject();
        System.out.println("\nValor impresso no primeiro objecto da classe CreateAnObject: " + myObj.x);

        //Create another 2 objects to print the x variable value
        CreateAnObject myObj2 = new CreateAnObject();
        CreateAnObject myObj3 = new CreateAnObject();
        System.out.println("\nValor impresso no segundo objecto da classe CreateAnObject: " + myObj2.y);
        System.out.println("\nValor impresso no terceiro objecto da classe CreateAnObject: " + myObj3.z);
        System.out.println();
    }

}
