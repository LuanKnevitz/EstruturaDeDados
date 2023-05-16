package org.exercicios.Aula01;

import java.util.Arrays;

//Escreva um programa que crie um array de inteiros data e use um
// laço for para criar um novo String que exiba o conteúdo do array data entre chaves e
// separado por vírgulas. Por exemplo,
// se o array data tiver tamanho 4 e armazenar os valores 3, 4, 1, 5, o String “{3, 4, 1, 5}” deve ser criado e exibido.
public class Vetores1 {
    public static void main(String[] args) {
        int[] array = {3, 4, 1, 5};
        StringBuilder lista = new StringBuilder();
        Arrays.stream(array).forEach(num -> lista.append(num + ","));
        System.out.println(lista.replace(lista.length() - 1, lista.length(), ""));

    }
}
