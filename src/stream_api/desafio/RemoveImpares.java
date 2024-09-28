package stream_api.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Desafio 4 - Remova todos os valores ímpares:
//Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
public class RemoveImpares {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, -7, 8, 9, 10, 5, 4, 3);

        // Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
        // É só listar os números pares
        List<Integer> apenasPares = numeros.stream()
                .filter(numero -> numero % 2 == 0) // Filtra apenas os números pares
                .collect(Collectors.toList()); // Coleta os números filtrados em uma nova lista

        // Exibe a lista resultante com apenas números pares
        System.out.println("Lista sem números ímpares: " + apenasPares);
    }
}
