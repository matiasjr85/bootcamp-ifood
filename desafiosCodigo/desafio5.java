package br.com.dio.exercicios.ex;

import java.util.Scanner;

public class desafio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] elementos = {64, 137, -16, 43, 67, 81, -90, 212, 10, 75};

        //TODO: Retorne o valor do elemento no Array junto de sua respectiva posição.

        int num = leitor.nextInt();
        boolean encontrou = false;

        for (int i = 0; i < elementos.length; i++) {
            if (num == elementos[i]) {
                encontrou = true;
                System.out.println("Achei " + num + " na posicao " + i);
            }

        }

        if (encontrou == false){

            System.out.println("Numero " + num + " nao encontrado!");
        }


//        for (int i = 0; i < elementos.length; i++) {
//            if (num != elementos[i]) {
//            }
//        }
//        System.out.println("Numero " + num + " nao encontrado!");
    }
}
