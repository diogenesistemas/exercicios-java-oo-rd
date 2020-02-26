package exercicio01;

import java.util.*;

public class Exercicio01 {

    public static void main(String[] args) {

        int tamanho = 10;

        int[] fibonacci = new Fibonacci().getSequenciaFibonacciDe(tamanho);

        Set<Integer> primos = new NumeroPrimo().getNumerosPrimosDe(getSetDe(fibonacci));

        System.out.println("Os numeros primos da sequencia Fibonacci de "+tamanho+" sao:");
        for (Integer primo: primos) {
            System.out.println(primo);
        }

    }

    /**
     * Este método deve retornar um conjunto contendo os números que vieram no array de inteiros passado no parâmetro.
     *
     * @param numeros Array de inteiros
     * @return Set<Integer>
     */
    private static Set<Integer> getSetDe(int[] numeros) {
        // TODO: implemente o código deste método
        Set<Integer> setRetorno = new HashSet<Integer>(Arrays.asList(convertIntToInteger(numeros)));
        return setRetorno;
    }


    private static Integer[] convertIntToInteger(int[] numeros){
        Integer[] outroArray = new Integer[numeros.length];
        for (int i=0; i<numeros.length;i++) {
            outroArray[i]=Integer.valueOf(numeros[i]);
        }
        return outroArray;
    }
}
