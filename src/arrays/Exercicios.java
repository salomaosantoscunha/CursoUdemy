package arrays;

import java.util.Arrays;

public class Exercicios {
    public static void main(String[] args) {

        double [] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 9.0;
        notasAlunoA[2] = 8.5;

        System.out.println(  Arrays.toString(notasAlunoA));
        double total = 0;
        for (int i = 0 ;i < notasAlunoA.length;i++){
            total += notasAlunoA[i];}

            System.out.println( "Media aluno A "+total / notasAlunoA.length);

        double[] notaAlunoB ={10,5.9,8.3};
        double totalB = 0;
        for ( int i =0 ;i < notaAlunoB.length;i++){
            totalB += notaAlunoB[i];}
            System.out.println( "Media aluno B "+totalB / notaAlunoB.length);
        }

    }



