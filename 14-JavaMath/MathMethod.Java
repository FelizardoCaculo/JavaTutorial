public class MathMethod{
    public static void main(String[] args){
        /*
         * A classe Math tem muitos métodos que permitem efectuar operações matemáticas em números
         */
        int x = 10;
        int y = 20;
        int randomNumber = (int) (Math.random() * 101); //Fórmula para gerar um número aleatório entre 0 à 100

        System.out.println(randomNumber + " ===> Este é um número aleatório gerado entre 0 à 100");
        System.out.println("O maior número entre " + x " é: " + y + " é: " + Math.max(x, y));
        System.out.println("O menor número entre " + x " é: " + y + " é: " + Math.min(x, y));
        System.out.println("A raís quadrada de " + y + " é: " + Math.sqrt(y));
    }
}