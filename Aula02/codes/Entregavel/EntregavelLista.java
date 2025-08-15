import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntregavelLista {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        System.out.print("Informe o tamanho da lista: ");
        int tamanho = sc.nextInt();

        // Estrutura de controle de fluxo (paradigma estruturado) para preencher a lista
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            int valor = sc.nextInt();
            numeros.add(valor);
        }

        System.out.println("\n--- Processamentos com STREAM ---");

        // a) Imprimir apenas os números pares (filter)
        
        // b) Imprimir os valores dobrados (map)
        
        // c) Imprimir os valores em ordem crescente (sorted)
        
        System.out.println("\n--- Lista Original com forEach da List ---");
        // 
        sc.close();
    }
}
