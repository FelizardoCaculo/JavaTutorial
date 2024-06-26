public class NumbersStrings {
    public static void main(String[] args){
        //usamos o sinal + para adição(números) e concatenação(Strings)
        int x = 10;
        int y = 20;
        int somaNumero = x + y; // o resultado será um número inteiro
        String a = "10";
        String b = "20";
        String somaTexto = a + b; // o resultado será uma string concatenada
        String somaNumeroComTexto = x + b;

        System.out.println("\nSomando números: 10 + 20 = " + somaNumero);
        System.out.println("Concatenando Strings: 10 + 20 = " + somaTexto);
        System.out.println("Somando número 10 e texto 20: 10 + 20 = " + somaNumeroComTexto);
    }
}
