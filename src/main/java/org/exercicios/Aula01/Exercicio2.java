package org.exercicios.Aula01;

import java.util.Scanner;

//Solicitar a idade de um número indefinido de pessoas e imprimir a
// média de idade lidas. O programa se encerra quando a média de idade for
// superior a 20 anos ou que tenha lido 10 pessoas.
public class Exercicio2 {
    public static void main(String[] args) {
        //int idades[]= new int[20]
        float idade;
        float totalIdade=0;
        float media=0;
        int cont=0;
        Scanner tc = new Scanner(System.in);//obj para ler dados
        do {
            System.out.println("Digite a Idade");
            idade=tc.nextFloat();
            cont++; // cont=cont+
            totalIdade=totalIdade+idade;
            //totalIdade+=idade
            media=totalIdade/cont;
            System.out.println("Média das idades é:"+media);

        }while (media<20);
        System.out.println("Encerrado");
    }

}
