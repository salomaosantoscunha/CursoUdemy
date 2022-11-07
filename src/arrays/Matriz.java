package arrays;

import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(" Quantos alunos? ");
        int qtAlunos = scanner.nextInt();

        System.out.print(" Quantos notas por aluno? ");
        int qtNotas = scanner.nextInt();

        double[][] notasDaTurma = new double[qtAlunos][qtNotas];

        double total = 0;
        for (int a = 0; a < notasDaTurma.length; a++) {
            for (int n = 0; n < notasDaTurma[a].length; n++) {

                System.out.printf("Informe a nota %d do aluno %d: ", n + 1, a + 1);
                notasDaTurma[a][n] = scanner.nextDouble();
                total += notasDaTurma[a][n];
            }
        }
        double media = total / (qtAlunos * qtNotas);
        System.out.println("Media da turma é " + media);

        scanner.close();

    }


}
