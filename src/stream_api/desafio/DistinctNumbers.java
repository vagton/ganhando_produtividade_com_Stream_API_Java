package stream_api.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Desafio 9 - Verificar se todos os números da lista são distintos (não se repetem):
//Com a Stream API, verifique se todos os números da lista são distintos (não se repetem) e exiba o resultado no console.
public class DistinctNumbers {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verifica se todos os números da lista são distintos
        boolean todosDistintos = numeros.stream()
                .distinct() // Filtra elementos duplicados
                .count() == numeros.size(); // Compara o número de elementos distintos com o total

        // Exibe o resultado
        if (todosDistintos) {
            System.out.println("Todos os números da lista são distintos.");
        } else {
            System.out.println("Existem números duplicados na lista.");
        }

        // Exibir apenas os números distintos da lista
        System.out.println("Números distintos:");
        numeros.stream()
                .distinct() // Filtra elementos duplicados
                .sorted() // Ordena em ordem crescente
                .forEach(System.out::println);  // Exibe cada número no console

        // Contando as ocorrências de cada número
        Map<Integer, Long> contagem = numeros.stream()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));

        // Filtrando e exibindo os números duplicados
        System.out.println("Números duplicados:");
        contagem.entrySet().stream()
                .filter(entry -> entry.getValue() > 1) // Mantém apenas os que têm mais de uma ocorrência
                .sorted(Map.Entry.comparingByKey()) // Ordena em ordem crescente
                .forEach(entry -> System.out.println("Número: " + entry.getKey() + ", Ocorrências: " + entry.getValue())); // Exibe cada número e sua contagem        
    }
}
