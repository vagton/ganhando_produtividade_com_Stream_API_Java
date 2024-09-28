package stream_api.desafio;

import java.util.Arrays;
import java.util.List;

//Desafio 15 - Verifique se a lista contém pelo menos um número negativo:
//Utilizando a Stream API, verifique se a lista contém pelo menos um número negativo e exiba o resultado no console.
public class VerificaNumeroNegativo {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verifica se a lista contém pelo menos um número negativo
        boolean hasNegative = numeros.stream()
                .anyMatch(n -> n < 0); // Verifica se existe algum número menor que 0

        // Exibe o resultado
        if (hasNegative) {
            System.out.println("A lista contém pelo menos um número negativo.");
        } else {
            System.out.println("A lista não contém números negativos.");
        }
    }
}
