public class UsingMultipleClasses {

    public static void main(String[] args) {
        /*
         * We can create an object of a class and access it in another class. This is often used for better
         * organization of classes (One class has all the attributes and methods, while the other class holds the main() 
         * method(code to be executed)).
         */

        //Accessing the objects created in CreateAnObject class
        CreateAnObject myObj = new CreateAnObject();
        CreateAnObject myObj2 = new CreateAnObject();
        CreateAnObject myObj3 = new CreateAnObject();
        CreateAnObject myObj4 = new CreateAnObject();
        //Accessin variables created in another class
        System.out.println("\n" + myObj.x);
        System.out.println("\n" + myObj2.y);
        System.out.println("\n" + myObj3.z);
        System.out.println(myObj4.sum);
        System.out.println();
    
    }

}
