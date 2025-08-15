public class ImpureFunctionExample {

    private static int counter = 0;

    private static int addAndIncrementCounter(int a, int b) {
        counter ++; //Modifica o estado externo (variável global)
        return a + b + counter; //Mesmo recebendo os mesmos parâmetros
                                // o Retorno pode ser diferente para cada chamada
    }

    public static void main(String[] args) {
        int result1 = addAndIncrementCounter(2, 3); // Resultado = 6
        System.out.println("Result 1: " + result1 + " - Counter: " + counter);

        int result2 = addAndIncrementCounter(2, 3);// Resultado = 7
        System.out.println("Result 2: " + result2 + " - Counter: " + counter);

    }
}

