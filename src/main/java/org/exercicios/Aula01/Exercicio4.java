package org.exercicios.Aula01;

import java.util.Scanner;

//Escrever um programa que receba vários números inteiros
// no teclado e no final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero)
public class Exercicio4 {
    public static void main(String[] args) {
        //int idades[]= new int[20]
        int valor;
        int mediaDosMultiplos=0;
        int cont=0;
        int multiplos=0;
        Scanner tc = new Scanner(System.in);//obj para ler dados
        do {
            System.out.println("Digite o multiplo");
            valor=tc.nextInt();
            if (valor!=0 && (valor%3==0)){//cleancode
                cont++; // cont=cont+
                multiplos+=valor;
                mediaDosMultiplos=multiplos/cont;
            }

        }while (valor!=0);
        System.out.println("Média dos valores é:"+mediaDosMultiplos);
        System.out.println("Soma dos valores é:"+multiplos);
        System.out.println("Encerrado");
    }
}
