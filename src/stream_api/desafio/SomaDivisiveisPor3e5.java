package stream_api.desafio;

import java.util.Arrays;
import java.util.List;

//Desafio 19 - Encontre a soma dos números divisíveis por 3 e 5:
//Com a Stream API, encontre a soma dos números da lista que são divisíveis tanto por 3 quanto por 5 e exiba o resultado no console.
public class SomaDivisiveisPor3e5 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Encontrando a soma dos números divisíveis por 3 e 5
        int somaDivisiveis = numeros.stream()
                .filter(num -> num % 3 == 0 && num % 5 == 0) // Filtra números divisíveis por 3 e 5
                .mapToInt(Integer::intValue) // Converte para int
                .sum(); // Soma os números filtrados

        // Exibindo o resultado
        System.out.println("A soma dos números divisíveis por 3 e 5 é: " + somaDivisiveis);
    }
}
