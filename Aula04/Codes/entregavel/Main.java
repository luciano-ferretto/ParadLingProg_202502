package entregavel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    private static void processarLista(List<String> lista) {
        try {
            System.out.println("\nTipo Concreto do Objeto: " + lista.getClass());
            System.out.println("Lista antes operações: " + lista);
            lista.set(0, "AA"); // Tentativa de alteração do valor dentro da lista
            lista.add("ZZ"); // Tentativa de alteração do tamanho da lista
            System.out.println("Lista após  operações: " + lista);
        } catch (Exception e) {
            System.out.println("Erro na lista - Lista antes do erro: " + lista);
            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {
        
        // Lista ABC
        List<String> listaABC = new ArrayList<>();
        listaABC.add("A");
        listaABC.add("B");
        listaABC.add("C");
        processarLista(listaABC);

        // Lista EFG
        List<String> listaEFG = Arrays.asList("E", "F", "G");
        processarLista(listaEFG);
        
        // Lista WXY
        List<String> listaWXY = List.of("W", "X", "Y");
        processarLista(listaWXY);
        
    }
}