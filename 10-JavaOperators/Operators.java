public class Operators {
    public static void main(String[] args){
        /*
         * Operators are used to perform o+erations on variables and values
         */
        //1º Arithmetic Operators
        int x = 100;
        int y = 50;
        int sum = x + y;
        int minus = x - y;
        int multiply = x * y;
        float devide = x / y;
        float remind = x % y;
        int incrementOfSum = ++sum;
        int decrementOfSum = --sum;
        //2º Comparison Operators
        boolean equalTo = x == y;
        boolean lessThan = x < y;
        boolean graterThan = x > y;
        boolean graterThanOrEgualTo = x >= y;
        boolean lessThanOrEqualTo = x <= y;
        //3º Logical Operators
        boolean logicalAnd = x < 5 && x < 10;
        boolean logicalOr = y < 5 || y < 4;
        boolean logicalNot = !(x < 5 && x < 10);

        System.out.println("\n========== 1º Operadores Aritméticos ==========\n");
        System.out.println("Soma ===============> " + x + " + " + y + " = " + sum);
        System.out.println("Subtração ==========> " + x + " - " + y + " = " + minus);
        System.out.println("Multiplicação ======> " + x + " x " + y + " = " + multiply);
        System.out.println("Divisão ============> " + x + " : " + y + " = " + devide);
        System.out.println("Resto da Divisão ===> " + x + " % " + y + " = " + remind);
        System.out.println("Incremento da Soma => " + incrementOfSum);
        System.out.println("Decremento da Soma => " + decrementOfSum);

        System.out.println("\n========== 2º Operadores de Comparação ==========\n");
        System.out.println("Igual a ==============>   " + x + " == " + y + " Resultado: " + equalTo);
        System.out.println("Menor que ============>   " + x + " < " + y + "  Resultado: " + lessThan);
        System.out.println("Maior que ============>   " + x + " > " + y + "  Resultado: " + graterThan);
        System.out.println("Menor ou igual que ===>   " + x + " <= " + y + " Resultado: " + lessThanOrEqualTo);
        System.out.println("Maior ou igual que ===>   " + x + " >= " + y + " Resultado: " + graterThanOrEgualTo);

        System.out.println("\n========== 3º Logical Operators ==========\n");
        System.out.println("Operador lógico E ===> x < 5 && x < 10      Resultado: " + logicalAnd);
        System.out.println("Operador lógico OU ==> y < 5 || y < 4       Resultado: " + logicalOr);
        System.out.println("Operador lógico Não => !(x < 5 && x < 10)   Resultado: " + logicalNot);
    }
}