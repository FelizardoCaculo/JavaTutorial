import java.util.Scanner;

public class Exercise003 {
    public static void main(String[] args) {
        //Exercise003 - Pauta do aluno
        Scanner userInput = new Scanner(System.in);
        float studantMarks;

        System.out.println("\n===============================================");
        System.out.println("\tPROGRAMA = NOTA FINAL DO ALUNO");
        System.out.println("===============================================\n");
        System.out.println("\nEscreva a Nota do Aluno entre 0 à 100: ");
        studantMarks = userInput.nextFloat();

        if(studantMarks < 50){
            System.out.println("\nReprovado!");
        } else if(studantMarks >= 50 && studantMarks < 60){
            System.out.println("\nNota D");
        } else if(studantMarks >= 60 && studantMarks < 70){
            System.out.println("\nNota C");
        } else if(studantMarks >= 70 && studantMarks < 80){
            System.out.println("\nNota B");
        } else if(studantMarks >= 80 && studantMarks < 90){
            System.out.println("\nNota A");
        } else if(studantMarks >= 90 && studantMarks <= 100){
            System.out.println("\nNota A+");
        } else {
            System.out.println("\nInválido!");
        }
        userInput.close();
    }
}
