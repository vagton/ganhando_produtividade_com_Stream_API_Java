package stream_api.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

//Desafio 5 - Calcule a média dos números maiores que 5:
//Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
public class MediaNumerosMaioresQueCinco {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Com a Stream API, calcule a média dos números maiores que 5 e exiba o resultado no console.
        OptionalDouble media = numeros.stream()
                .filter(numero -> numero > 5) // Filtra apenas os números maiores que 5
                .mapToInt(Integer::intValue) // Mapeia para um IntStream
                .average(); // Calcula a média dos números filtrados

        // Exibe a média calculada, se presente
        if (media.isPresent()) {
            System.out.println("A média dos números maiores que 5 é: " + media.getAsDouble());
        } else {
            System.out.println("Não há números maiores que 5 na lista.");
        }
    }
}
