package Exercises;

public class Ex011FibonacciSequenceUntil10Term {
    public static void main(String[] args) {
        int firstNumber = 0, secondNumber = 1;
        System.out.println("\n=======Sequência de Fibonacci========\n");
        System.out.println("1º Termo da sequência de Fibonacci: " + firstNumber);
        System.out.println("2º Termo da sequência de Fibonacci: " + secondNumber);
        for (int i = 3; i <= 10; i++) {
            int fibonacci = firstNumber + secondNumber;
            System.out.println(i + "º Termo da sequência de Fibonacci: " + fibonacci);
            firstNumber = secondNumber;
            secondNumber = fibonacci;
        }
    }
}