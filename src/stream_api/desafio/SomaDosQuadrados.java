package stream_api.desafio;

import java.util.Arrays;
import java.util.List;

//Desafio 11 - Encontre a soma dos quadrados de todos os números da lista:
//Utilizando a Stream API, encontre a soma dos quadrados de todos os números da lista e exiba o resultado no console.
public class SomaDosQuadrados {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Calcula a soma dos quadrados de todos os números da lista
        int somaDosQuadrados = numeros.stream()
                .map(numero -> numero * numero) // Calcula o quadrado de cada número
                .reduce(0, Integer::sum); // Soma todos os quadrados

        System.out.println("Soma dos quadrados: " + somaDosQuadrados);
    }
}
