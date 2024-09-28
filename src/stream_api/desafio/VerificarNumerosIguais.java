package stream_api.desafio;

import java.util.Arrays;
import java.util.List;

//Desafio 18 - Verifique se todos os números da lista são iguais:
//Utilizando a Stream API, verifique se todos os números da lista são iguais e exiba o resultado no console.
public class VerificarNumerosIguais {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verificando se todos os números são iguais
        boolean todosIguais = numeros.stream()
                .distinct() // Filtra os elementos distintos
                .count() == 1; // Verifica se a contagem de elementos distintos é 1

        // Exibindo o resultado
        if (todosIguais) {
            System.out.println("Todos os números são iguais.");
        } else {
            System.out.println("Os números não são iguais.");
        }
    }
}
