package stream_api.desafio;

import java.util.Arrays;
import java.util.List;

//Desafio 17 - Filtrar os números primos da lista:
//Com a ajuda da Stream API, filtre os números primos da lista e exiba o resultado no console.
public class FiltrarNumerosPrimos {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrando os números primos
        List<Integer> numerosPrimos = numeros.stream()
                .filter(FiltrarNumerosPrimos::isPrimo) // Usando método de referência para verificar se o número é primo
                .toList(); // Coleta os números primos em uma lista

        // Exibindo o resultado
        System.out.println("Números primos: " + numerosPrimos);
    }

    // Método para verificar se um número é primo
    private static boolean isPrimo(int numero) {
        if (numero < 2) {
            return false; // Números menores que 2 não são primos

        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false; // Se divisível por qualquer número, não é primo

            }
        }
        return true; // Se não foi divisível, é primo
    }
}
