package org.exercicios.OrdenacaoDeDados;

import java.util.ArrayList;
import java.util.Random;

public class InsertionSort {
    public static void main(String[] args) {
        ArrayList<Integer> arraySort= new ArrayList<>();
        for (int i = 0; i<1000; i++){
            arraySort.add(new Random().nextInt(1000));
        }
        Sort a = new Sort();
        a.sort(arraySort);
        arraySort.forEach(item-> System.out.println(item));
    }


    public static class Sort {
        int compara;
        int troca;
       public void sort(ArrayList<Integer> arraySort){
            Integer n = arraySort.size();
            long start = System.currentTimeMillis();
            for (int i = 1; i < n; i++){
                troca++;
                Integer key = arraySort.get(i);
                int j = i -1;

                while (j >=0 && arraySort.get(j) > key){
                    compara++;
                    arraySort.set(j+1,arraySort.get(j));
                    j = j -1;

                }
                arraySort.set(j+1, key);
            }
            long totalTime = System.currentTimeMillis()-start;
           System.out.println("O numero de comparações é:" + compara);
           System.out.println("O numero de trocas é:" + troca);
           System.out.println("O tempo que levou é:" + totalTime);
        }
    }

}
