package stream_api.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

//Desafio 7 - Encontrar o segundo número maior da lista:
//Com a ajuda da Stream API, encontre o segundo número maior da lista e exiba o resultado no console.
public class SegundoNumeroMaior {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrando o segundo número maior da lista
        Optional<Integer> segundoMaior = numeros.stream()
                .distinct() // Remove duplicatas
                .sorted((a, b) -> b - a) // Ordena em ordem decrescente
                .skip(1) // Pula o primeiro (maior)
                .findFirst(); // Pega o próximo elemento (segundo maior)

        // Exibe o resultado
        if (segundoMaior.isPresent()) {
            System.out.println("O segundo número maior da lista é: " + segundoMaior.get());
        } else {
            System.out.println("A lista não possui um segundo número maior.");
        }
    }
}

