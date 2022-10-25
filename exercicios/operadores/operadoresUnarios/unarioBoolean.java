package operadores.operadoresUnarios;

public class unarioBoolean {
    public static void main(String[] args) {

        //Utilizaçao de unarios em boolean

        boolean variavel = true;

        System.out.println(!variavel);

        variavel = !variavel;

        System.out.println(variavel);

        // verificação om uso do ==.

        int a, b;

        a = 5;
        b = 6;

        String resultado ="";
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println(resultado);

        //utilizando uma forma mais enxuta.

        resultado = a==b?"verdadeiro" : "falso";

        System.out.println(resultado);

        int resultadoInteiro = a ==b ? 1 : 0;

        System.out.println(resultadoInteiro);

        //Operadores relacionais

        String nomeUm = "Edmilson";
        String nomeDois = "Edmilson";

        System.out.println(nomeUm == nomeDois);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        if (numero1 < numero2){

            System.out.println("A nossa condição é verdadeira");
        }
        System.out.println("numeroUm é igual a numeroDois?" + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois?" + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior que  numeroDois?" + simNao);
    }
}
