package exercicio01;

import java.util.Set;
import java.util.TreeSet;

public class NumeroPrimo {

    /**
     * Retorna um conjunto contendo os números primos contidos num conjunto de inteiros passado no parâmetro,
     *
     * OBSERVAÇÃO: Um número primo é aquele número inteiro ímpar que somente é divisível por 1 e por ele mesmo.
     *
     * OBSERVAÇÃO 2: O número 2 é o único número inteiro par que é primo.
     *
     * Ex.: O número 5 é primo porque não é divisível por 3 (o resultado da divisao de 5 por 3 dá um numero decimal),
     * somente por 1 e o próprio 5.
     *
     * @param numeros Conjunto de inteiros
     * @return Set<Integer>
     */
    public Set<Integer> getNumerosPrimosDe(Set<Integer> numeros) {
        // TODO: implemente o código deste método

        Set<Integer> numerosPrimos = new TreeSet<>();

        for (Integer numero : numeros) {

            if (ehPrimo(numero)){
                numerosPrimos.add(numero);

            }

        }

        return numerosPrimos;
    }


    private Boolean ehPrimo(Integer numero){
        int contador = 0;
        for (int i=1; i<=numero; i++){
            if (numero%i==0){
                contador++;
            }
            if(contador>2){
                return Boolean.FALSE;
            }
        }
        return Boolean.TRUE;
    }

}
