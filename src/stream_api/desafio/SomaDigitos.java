package stream_api.desafio;

import java.util.Arrays;
import java.util.List;

//Desafio 8 - Somar os dígitos de todos os números da lista:
//Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
//Nota: no caso quando chegar o 10 ele soma o 1+0=1
public class SomaDigitos {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Soma dos dígitos de todos os números da lista
        int somaTotal = numeros.stream()
                .flatMapToInt(numero -> String.valueOf(numero) // Converte o número para String
                .chars() // Converte cada caractere da string em um IntStream
                .map(Character::getNumericValue)) // Converte cada caractere para seu valor numérico
                .sum(); // Soma todos os dígitos

        // Exibe o resultado
        System.out.println("A soma dos dígitos de todos os números da lista é: " + somaTotal);
    }
}
