package stream_api.desafio;

import java.util.Arrays;
import java.util.List;

// Desafio 3 - Verifique se todos os números da lista são positivos:
// Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
public class VerificaNumerosPositivos {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, -7, 8, 9, 10, 5, 4, 3);

        // Usando Stream API para verificar se todos os números são positivos
        boolean todosPositivos = numeros.stream()
                .allMatch(numero -> numero > 0); // Verifica se todos os números são maiores que 0

        System.out.println("Todos os números são positivos? " + todosPositivos);

        // Exibir apenas os números positivos da lista
        System.out.println("Números positivos na lista:");
        numeros.stream()
                .filter(numero -> numero > 0)   // Filtra apenas os números positivos
                .sorted()                       // Ordena em ordem crescente
                .forEach(System.out::println);  // Exibe cada número positivo no console

        // Exibir apenas os números negativos da lista
        System.out.println("Números positivos na lista:");
        numeros.stream()
                .filter(numero -> numero < 0)   // Filtra apenas os números negativos
                .sorted()                       // Ordena em ordem crescente
                .forEach(System.out::println);  // Exibe cada número negativos no console        
    }
}
