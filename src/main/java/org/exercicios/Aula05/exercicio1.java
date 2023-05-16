package org.exercicios.Aula05;

/*Implemente uma fila de String com
 as operações básicas de uma fila num vetor de 10 elementos.*/
public class exercicio1 {
    Integer queueSize = 0;
    String [] fila = new String[10];

    private static void grow(String[] oldList){
    }
    private String add(String toAdd){
        fila[queueSize]=toAdd;
        this.queueSize++;
        return fila[--queueSize];
    };
    private String remove(){
            return fila[0];
    };

}
