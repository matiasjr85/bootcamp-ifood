import java.util.*;
import java.util.Scanner;



public class ClassificandoMatrizes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int tamanhoArray = input.nextInt();
        int[] nums = new int[tamanhoArray];
        int primeiroDoIndex = 0;

        for (int i = 0; i < tamanhoArray; i++) nums[i] = input.nextInt();

        LinkedHashSet<Integer> listaFinal = new LinkedHashSet<>();

        for(int i = 0; i < tamanhoArray; i++) {
            if(nums[i] % 2 == 0) {
                int varAuxiliar = nums[primeiroDoIndex];
                nums[primeiroDoIndex] = nums[i];
                nums[i] = varAuxiliar;
                primeiroDoIndex++;
            }
        }

        for(int numero : nums) listaFinal.add(numero);
        for(int numero : listaFinal) System.out.println(numero);


    }
}
