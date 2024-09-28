package stream_api.desafio;

import java.util.Arrays;
import java.util.List;

//Desafio 2 - Imprima a soma dos números pares da lista:
//Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
public class SomaNumerosPares {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Usando Stream API para somar os números pares e exibir o resultado
        int somaDosPares = numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtra apenas números pares
                .mapToInt(Integer::intValue) // Converte para IntStream
                .sum(); // Soma os valores

        System.out.println("Soma dos números pares: " + somaDosPares);
    }
}
