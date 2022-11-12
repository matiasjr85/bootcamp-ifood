import java.util.*;
public class ValidacaoParenteses {

        public static void main(String[] args) {
            Scanner scanner= new Scanner(System.in);

            boolean caracter = ehValido(scanner.nextLine());

            System.out.println(caracter);
        }

        public static boolean ehValido(String s) {
            //TODO: implemente a lógica de caracteres válidos e retorne se a string é valida ou não.
            boolean existe = false;


            if (s.equalsIgnoreCase("()")){

                existe = true;
            } else if (s.equalsIgnoreCase("[]")){

                existe = true;

            } else if (s.equalsIgnoreCase("{}")){

                existe = true;

            }else {
                existe = false;
            }
            return existe;

        }
}
