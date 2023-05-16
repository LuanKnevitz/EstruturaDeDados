package org.exercicios.Aula01;

import java.util.Scanner;

//Escrever um programa que leia, valores
// inteiros, até ser lido o valor-99. Quando isso acontecer, o
// deverá escrever a soma e a média dos valores lidos
public class Exercicio3 {
    public static void main(String[] args) {
        //int idades[]= new int[20]
        int valor;
        int media=0;
        int cont=0;
        int soma=0;
        Scanner tc = new Scanner(System.in);//obj para ler dados
        do {
            System.out.println("Digite o valor");
            valor=tc.nextInt();
            if (valor!=-99){
                cont++; // cont=cont+
                soma+=valor;
                //totalIdade+=idade
                media=soma/cont;
            }

        }while (valor!=-99);
        System.out.println("Média dos valores é:"+media);
        System.out.println("Soma dos valores é:"+soma);
        System.out.println("Encerrado");
    }

}
