import java.util.function.*;

public class LambdaFunction {
    public static void main(String[] args) {
        // Sem parâmetros
        Runnable greet = () -> System.out.println("Olá, Mundo!");
        greet.run(); // Saída: Olá, Mundo!

        // Com um parâmetro
        Function<Integer, Integer> raiz = x -> x * x;
        System.out.println("O quadrado de 5 é: " + raiz.apply(5));

        // Com múltiplos parâmetros
        BiFunction<Integer, Integer, Integer> soma = (a, b) -> a + b;
        System.out.println("A soma de 10 e 20 é: " + soma.apply(10, 10)); // Saída: A soma de 10 e 20 é: 30

        // Com Bloco de código
        BiFunction<Integer, Integer, String> divisibilityCheck = (a, b) -> {
            if (b == 0) {
                return "Divisão por zero não é permitida!";
            }
            return a % b == 0 ? a + " é divisível por " + b : a + " não é divisível por " + b;
        };
        System.out.println(divisibilityCheck.apply(10, 2)); // Saída: 10 é divisível por 2
        System.out.println(divisibilityCheck.apply(10, 3)); // Saída: 10 não é divisível por 3

    }
}
