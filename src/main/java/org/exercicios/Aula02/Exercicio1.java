package org.exercicios.Aula02;

import java.util.Scanner;

/*
Escreva uma classe que Leia 5 nomes e notas de uma turma, calcula e exibe a média das notas da
turma e em seguida exibe a relação de nomes cuja nota é superior a esta média. Utilize vetores
 para armazenar as notas.*/
public class Exercicio1 {
    public static void main(String[] args) {
        String nomeAluno;
        float notaAluno=0;
        String [] nomesDosAlunos=new String[5];
        float [] notaDosAlunos=new float[5];
        int totalNotas=0;
        int mediaNotas;
        int cont=0;
        Scanner tc = new Scanner(System.in);//obj para ler dados

        do {
            System.out.println("Digite o nome do aluno");
            nomeAluno=tc.nextLine();
            System.out.println("Digite a nota do aluno");
            notaAluno=Float.parseFloat(tc.nextLine());
            nomesDosAlunos[cont]=nomeAluno;
            notaDosAlunos[cont]=notaAluno;
            totalNotas+=notaAluno;
            mediaNotas=totalNotas/notaDosAlunos.length;
            cont++;


        }
        while(cont<5);
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<notaDosAlunos.length;i++){
            if (notaDosAlunos[i]>mediaNotas){
                stringBuilder.append("\n Nome Do Aluno: "+nomesDosAlunos[i] + " Nota:"+notaDosAlunos[i]);
            }
        }

        System.out.println("Alunos com notas acima da média, a média é: "+mediaNotas+"\n"+stringBuilder);
    }

}
