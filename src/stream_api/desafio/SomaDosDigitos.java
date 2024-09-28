package stream_api.desafio;

import java.util.Arrays;
import java.util.List;

public class SomaDosDigitos {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(12, 34, 56, 78, 9);

        // Somando os dígitos de todos os números da lista
        int somaDosDigitos = numeros.stream()
                .mapToInt(SomaDosDigitos::somaDigitos) // Mapeia cada número para a soma de seus dígitos
                .sum(); // Soma todos os resultados

        // Exibe o resultado
        System.out.println("A soma dos dígitos de todos os números da lista é: " + somaDosDigitos);
    }

    // Método para calcular a soma dos dígitos de um número
    private static int somaDigitos(int numero) {
        int soma = 0;
        while (numero > 0) {
            soma += numero % 10; // Adiciona o último dígito
            numero /= 10; // Remove o último dígito
        }
        return soma;
    }
}
