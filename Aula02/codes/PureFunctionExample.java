public class PureFunctionExample {

    private static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int result1 = add(2, 3); // Sempre Resultado = 5 (com esses parâmetros)
        System.out.println("Result 1: " + result1);

        int result2 = add(2, 3); // Sempre Resultado = 5 (com esses parâmetros)
        System.out.println("Result 2: " + result2);
    }
}
