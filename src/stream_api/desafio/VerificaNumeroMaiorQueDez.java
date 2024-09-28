package stream_api.desafio;

import java.util.Arrays;
import java.util.List;

//Desafio 6 - Verificar se a lista contém algum número maior que 10:
//Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
public class VerificaNumeroMaiorQueDez {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        // Verifica se há algum número maior que 10 na lista
        boolean temNumeroMaiorQueDez = numeros.stream()
                .anyMatch(numero -> numero > 10); // Verifica se existe algum número maior que 10

        // Exibe o resultado
        if (temNumeroMaiorQueDez) {
            System.out.println("A lista contém pelo menos um número maior que 10.");
        } else {
            System.out.println("A lista não contém nenhum número maior que 10.");
        }
    }
}
