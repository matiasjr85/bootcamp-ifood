import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class QuadradosPerfeitos {

    public static boolean verificaQuadradoPerfeito(int valor) {
        double raizQuadrada = Math.sqrt(valor);
        return ((int) raizQuadrada == raizQuadrada);
    }

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            List<Integer> quadradosPerfeitos = new ArrayList<>();


            //TODO: Com base no valor total, retorne o menor número de quadrados perfeitos.
            int entradaUsuario = scanner.nextInt();

            for (int i = 1; i < entradaUsuario; i++) {
                if (verificaQuadradoPerfeito(i)) quadradosPerfeitos.add(0, i);
            }

            int sizeLista = quadradosPerfeitos.size();
            int resultado = entradaUsuario;

            for (int i = 0; i < sizeLista; i++) {

                int varAuxiliar = entradaUsuario;
                int contAuxiliar = 0;

                for (int x = i; x < sizeLista; x++) {
                    while((varAuxiliar - quadradosPerfeitos.get(x)) >= 0){
                        varAuxiliar -= quadradosPerfeitos.get(x);
                        contAuxiliar ++;
                    }
                }

                if (contAuxiliar < resultado) resultado = contAuxiliar;
            }

            // Resultado:
            System.out.println(resultado);


        }
}
