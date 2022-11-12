import java.util.Scanner;

class verificarPalindromo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();
        String variavel = "";

        for (int i = palavra.length() - 1; i >=0; i--){

            variavel += palavra.charAt(i);
        }
        if (variavel.equalsIgnoreCase(palavra)){

            System.out.println("TRUE");
        }else {
            System.out.println("FALSE");
        }


        //TODO: Retorne TRUE ou FALSE, caso a "palavra" seja ou não um Palíndromo.
    }
}
