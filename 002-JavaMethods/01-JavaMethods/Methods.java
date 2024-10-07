public class Methods {
    /*
     * A method is a block of code which only runs when it is called. You can pass data, known as paramethers, into a method.
     * Methods are used to perform certan actions, and they are also known as funtions. We use methods to reuse code.
     * A method must be declared within a class. It is defined whith the name of the method, folloed by parentheses().
     */
    
    //Creating a method
    static void myMethod(){
        System.out.println("\nEu sou um método que foi criado e depois executado 👋👋👋👋!");
    }

    public static void main(String[] args){

        //Calling a methd
        myMethod();

        //Calling a method multiple times
        System.out.println("\n========= Chamando um méthodo multiplas vezes ==========");
        myMethod();
        myMethod();
        myMethod();
    }

}