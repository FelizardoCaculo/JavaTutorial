public class MethodParameters {

    /*
     * Information can be passed to methods as parameters. Parameters act as variables inside the method.
     * Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, 
     * just separate them with a comma.
     * When a parameter is passed to a method, it is called an argument.
     */

    public void myMethod(String name, int age) {
        System.out.println("");
        System.out.println(name + " tem " + age + " anos de idade");
    }

    public static void main(String[] args) {
        MethodParameters obj = new MethodParameters();
        obj.myMethod("Liam", 5);
    }
}   