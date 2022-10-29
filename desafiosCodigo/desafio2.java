package br.com.dio.exercicios.ex;
import java.util.Scanner;

public class desafio2 {
    public static void main(String[] args) {
            int A, N;
            int soma = 0;

            Scanner input = new Scanner(System.in);
            A = input.nextInt();
            N = input.nextInt();

            //TODO:  Retorne o valor da soma de todos múltiplos de "A" até o seu limite "N".

        for(int i = A; i <= N; i++) {
            if(i % A == 0) {
                soma += i;
            }
        }

            System.out.println(soma);
        }
    }
