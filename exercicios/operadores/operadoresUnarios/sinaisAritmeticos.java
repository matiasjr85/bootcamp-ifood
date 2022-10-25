package operadores.operadoresUnarios;

public class sinaisAritmeticos {
    public static void main(String[] args) {

        int numero = 5;

        //Ao trocar o sinal para - o valor do numero se torna negativo
        numero = - numero;

        System.out.println(- numero);

        System.out.println(numero);

        //Ao trocar o sinal para + o numero ainda continua negativo pois e uma operação aritmética.

        numero = + numero;

        System.out.println(- numero);

        System.out.println(numero);

        //Ao multiplicar por -1 acontece de fato a troca do valor para positivo.

        numero = numero * -1;

        System.out.println(- numero);

        System.out.println(numero);

        //x repetição

        numero =numero + 2;

        System.out.println(numero);

        System.out.println(numero++);

        System.out.println(numero);

        numero++;

        System.out.println(numero);

        System.out.println(++numero);

        System.out.println(numero--);

        System.out.println(numero);
    }
}
