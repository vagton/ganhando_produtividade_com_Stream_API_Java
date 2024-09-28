package stream_api.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;

//Desafio 14 - Encontre o maior número primo da lista:
//Com a Stream API, encontre o maior número primo da lista e exiba o resultado no console.
public class MaiorNumeroPrimo {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontra o maior número primo da lista
        OptionalInt maiorPrimo = numeros.stream()
                .filter(MaiorNumeroPrimo::isPrime) // Filtra apenas números primos
                .mapToInt(Integer::intValue) // Converte para IntStream
                .max(); // Encontra o maior valor

        // Exibe o maior número primo encontrado ou uma mensagem caso não haja primos
        if (maiorPrimo.isPresent()) {
            System.out.println("O maior número primo da lista é: " + maiorPrimo.getAsInt());
        } else {
            System.out.println("Não há números primos na lista.");
        }
    }

    // Método auxiliar para verificar se um número é primo
    private static boolean isPrime(int numero) {
        if (numero < 2) {
            return false; // Números menores que 2 não são primos

                }return IntStream.rangeClosed(2, (int) Math.sqrt(numero)) // Cria um stream de 2 até a raiz quadrada do número
                .noneMatch(i -> numero % i == 0); // Verifica se não há divisores (exceto 1 e ele mesmo)
    }
}
