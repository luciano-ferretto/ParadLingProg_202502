import java.util.function.Function;
import java.util.function.UnaryOperator;

public class CompositionFunctions {
    public static void main(String[] args) {
        // Função como Cidadão de Primeira Classe (variável)
        // Recebe número Inteiro; Múltiplica por 2; Retorna número Inteiro
        UnaryOperator<Integer> dobrar = x -> x * 2;

        // Função como Cidadão de Primeira Classe (variável)
        // Recebe número Inteiro; Divide por 2.5; Retorna número Double
        Function<Integer, Double> divideDoisMeio = x -> x / 2.5;

        // Função como Cidadão de Primeira Classe (variável)
        // Recebe número Inteiro; 
        //      "invoca" a variável dobrar; "invoda" a variável divideDoisMeio;
        //       Retorna número Double
        Function<Integer, Double> comp = dobrar.andThen(divideDoisMeio);

        // "invoca/executa" a variável ==> executa a função armazenada como variável
        System.out.println(comp.apply(5)); // (5*2)/2.5 = 4

    }
}
