package stream_api.desafio;

import java.util.Arrays;
import java.util.List;

//Desafio 12 - Encontre o produto de todos os números da lista:
//Com a ajuda da Stream API, encontre o produto de todos os números da lista e exiba o resultado no console.
public class ProdutoDosNumeros {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Calcula o produto de todos os números da lista
        int produto = numeros.stream()
                .reduce(1, (a, b) -> a * b); // Multiplica todos os números

        System.out.println("Produto de todos os números: " + produto);
    }
}
