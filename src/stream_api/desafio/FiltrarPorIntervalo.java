package stream_api.desafio;

import java.util.Arrays;
import java.util.List;

//Desafio 13 - Filtrar os números que estão dentro de um intervalo:
//Utilize a Stream API para filtrar os números que estão dentro de um intervalo específico (por exemplo, entre 5 e 10) e exiba o resultado no console.
public class FiltrarPorIntervalo {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Filtrar números dentro do intervalo [5, 10]
        List<Integer> numerosFiltrados = numeros.stream()
                .filter(n -> n >= 5 && n <= 10) // Verifica se o número está entre 5 e 10
                .toList(); // Converte o stream filtrado para uma lista

        System.out.println("Números dentro do intervalo [5, 10]: " + numerosFiltrados);
    }
}
