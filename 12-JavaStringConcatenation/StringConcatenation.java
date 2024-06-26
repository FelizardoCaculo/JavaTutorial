public class StringConcatenation {
    public static void main(String[] args){
        //O sinal de adição + é usado para juntar Strings
        String firstName = "Felizardo";
        String lastName = "Caculo";

        System.out.println(firstName + lastName); //juntando strins sem espaço
        System.out.println(firstName + " " + lastName); //juntando strings com espaço

        //Também podemos usar o método abaixo para contenar
        System.out.println(firstName.concat(lastName));
    }
}
