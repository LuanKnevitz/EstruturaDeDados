package org.exercicios.Aula01;

import java.util.Random;

public class Vetores3 {
    public static void main(String[] args) {
        String[] meses={

                "Janeiro","Fevereiro", "Março","Abril",
                "Maio", "Junho","Julho","Agosto","Setembro","Outubro",
                "Novembro","Dezembro"};
        Random random=new Random();

        System.out.println(meses[random.nextInt(12)]);

    }
}
