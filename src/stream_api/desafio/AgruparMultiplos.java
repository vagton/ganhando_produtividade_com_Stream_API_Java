package stream_api.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//Desafio 10 - Agrupe os valores ímpares múltiplos de 3 ou de 5:
//Utilize a Stream API para agrupar os valores ímpares múltiplos de 3 ou de 5 e exiba o resultado no console.
public class AgruparMultiplos {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Agrupar valores ímpares múltiplos de 3 ou 5
        Map<String, List<Integer>> agrupados = numeros.stream()
                .filter(n -> n % 2 != 0) // Filtra apenas números ímpares
                .filter(n -> n % 3 == 0 || n % 5 == 0) // Mantém apenas múltiplos de 3 ou 5
                .collect(Collectors.groupingBy(n -> {
                    if (n % 3 == 0 && n % 5 == 0) {
                        return "Múltiplos de 3 e 5"; 
                    }else if (n % 3 == 0) {
                        return "Múltiplos de 3"; 
                    }else {
                        return "Múltiplos de 5";
                    }
                }));

        // Exibindo os grupos e seus respectivos valores
        agrupados.forEach((grupo, lista) -> {
            System.out.println(grupo + ": " + lista);
        });
    }
}
