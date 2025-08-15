import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

public class FunctionalInterfacesExample {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        // Runnable - Sem parâmetros e Sem Retorno
        Runnable greet = () -> System.out.println("Runnable - Olá Mundo!");
        greet.run(); // Saída: Olá, Mundo!

/*------------------------------------------------------------------------------------------------------- */

        // Supplier<T> - Não recebe nada, mas fornece um Retorno de saída do tipo T
        Supplier<Double> randomNumber = () -> Math.random();
        System.out.println("Supplier - Número aleatório: " + randomNumber.get());
        

/*------------------------------------------------------------------------------------------------------- */

        // Consumer<T> - Executa uma ação com um Parâmetro do tipo T sem retornar nada
        Consumer<String> print = msg -> System.out.println("Consumer - Mensagem: " + msg);
        print.accept("Olá, Mundo!"); // Imprime "Olá, Mundo!"

        // Usando Consumer com Stream para imprimir elementos da lista
        System.out.println("Consumer com forEach() - Imprimindo números:");
        numbers.forEach(n -> System.out.println("Número: " + n));

/*------------------------------------------------------------------------------------------------------- */
        
        // Predicate<T> - Testa uma condição com um parâmetro do tipo T e retorna true ou false
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println("Predicate - Testando se 4 é par: " + isEven.test(4)); // true
        System.out.println("Predicate - Testando se 5 é par: " + isEven.test(5)); // false

        // Usando Predicate com Stream para filtrar números pares
        List<Integer> evenNumbers = numbers.stream()
                .filter(isEven)
                .toList();
        System.out.println("Predicate com filter() - Apenas pares: " + evenNumbers); // [2, 4, 6]

/*------------------------------------------------------------------------------------------------------- */

        // Function<T, R> - Recebe um parâmetro do tipo T e retorna um resultado do tipo R
        Function<Integer, String> intToString = n -> "Número: " + n;
        System.out.println("Function - Convertendo 10: " + intToString.apply(10)); // "Número: 10"

        // Usando Function com Stream para converter números em Strings
        List<String> stringNumbers = numbers.stream()
                .map(intToString)
                .toList();
        System.out.println("Function com map() - Convertendo lista de números: " + stringNumbers);

/*------------------------------------------------------------------------------------------------------- */

        // BiFunction<T, U, R> - Recebe dois parâmetros e retorna um resultado
        BiFunction<Integer, Integer, Integer> soma = (a, b) -> a + b;
        System.out.println("BiFunction - Soma de 5 e 3: " + soma.apply(5, 3)); // 8


/*------------------------------------------------------------------------------------------------------- */

        // UnaryOperator<T> - Mesma entrada e saída, útil para operações matemáticas
        UnaryOperator<Integer> multiplyByTwo = n -> n * 2;
        System.out.println("UnaryOperator - 5 * 2 = " + multiplyByTwo.apply(5)); // 10

        // Usando UnaryOperator com map() para dobrar os números da lista
        List<Integer> doubledNumbers = numbers.stream()
                .map(multiplyByTwo)
                .collect(Collectors.toList());
        System.out.println("UnaryOperator com map() - Lista dobrada: " + doubledNumbers);

/*------------------------------------------------------------------------------------------------------- */

        // BinaryOperator<T> - Recebe dois valores do mesmo tipo e retorna um valor do mesmo tipo
        BinaryOperator<Integer> sum = (a, b) -> a + b;
        System.out.println("BinaryOperator - Soma de 7 e 3: " + sum.apply(7, 3)); // 10

        // Usando BinaryOperator para reduzir uma lista somando seus elementos
        int totalSum = numbers.stream().reduce(0, sum); // Soma todos os números da lista
        System.out.println("BinaryOperator com reduce() - Soma total: " + totalSum); // 15
    }

}