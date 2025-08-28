package entregavel;

import java.util.ArrayList;
import java.util.List;

public class MainArrayList {

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
        List<String> listaABC = new ArrayList<>();
        listaABC.add("A");
        listaABC.add("B");
        listaABC.add("C");
        processarLista(listaABC);
        
        List<String> listaEFG = new ArrayList<>();
        listaEFG.add("E");
        listaEFG.add("F");
        listaEFG.add("G");
        processarLista(listaEFG);

        List<String> listaWXY = new ArrayList<>();
        listaWXY.add("W");
        listaWXY.add("X");
        listaWXY.add("Y");
        processarLista(listaWXY);
    }
}
