package br.com.dio.exercicios.ex;
import java.util.Scanner;
public class desafio3 {
    public static void main(String[] args) {

        Scanner numero = new Scanner(System.in);

        int N = numero.nextInt();

        System.out.println(somatorio(N));
        //TODO: Imprima o somatório de N (utilize o método "somatorio").
    }

    /**
     * Método útil que calcula o somatório de um número usando recursividade.
     */
    static int somatorio(int numero) {
        if (numero == 0) {
            return 0;
        } else {
            return numero + somatorio(numero - 1);
        }
    }
}
