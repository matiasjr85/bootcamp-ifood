package br.com.dio.exercicios.ex;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n1, n2;

        System.out.println("Digite o primeiro numero: ");
        n1 = scan.nextInt();
        System.out.println("Digite o primeiro numero: ");
        n2 = scan.nextInt();

        if(n1 == n2){
            System.out.println("São iguais!");
        } else{
            System.out.println("Não são iguais!");
        }
    }
}
