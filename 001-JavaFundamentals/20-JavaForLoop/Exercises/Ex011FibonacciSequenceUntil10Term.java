package Exercises;

public class Ex011FibonacciSequenceUntil10Term {
    public static void main(String[] args) {
        int firstNumber = 0, secondNumber = 1;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println("======Sequência de Fibonacci======");
        for (int i = 3; i <= 10; i++) {
            int fibonacci = firstNumber + secondNumber;
            System.out.println(fibonacci);
            firstNumber = secondNumber;
            secondNumber = fibonacci;
        }
    }
}