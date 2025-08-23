import java.util.List;

public class StreamParallelChainingMethod {
    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors() + " processadores disponíveis!");
        List<String> nomes = List.of("Ana", "Bruno", "Carlos", "Daniel", "Ana", "Beatriz", "Luisa", "Ana Clara", "Beto",
                "Cecilia", "Bianca", "Brenda", "Luigi", "Bruna", "Pedro");
        // Nenhuma operação foi executada ainda!
        var streamPipeline = nomes.parallelStream();
        streamPipeline = streamPipeline.filter(nome -> {
            System.out.printf("Filtrando:  %-7s | Thread: %s%n",
                    nome, Thread.currentThread().getName());
            return nome.startsWith("B");
        });
        streamPipeline = streamPipeline.map(nome -> {
            System.out.printf("Convertendo: %-7s | Thread: %s%n",
                    nome, Thread.currentThread().getName());
            return nome.toUpperCase();
        });
        System.out.println("Pipeline criado, mas nada foi processado ainda!");
        System.out.println("===============================================");
        // Agora o Stream será processado
        streamPipeline.forEach(resultado -> {
            System.out.printf("Coletando:  %-7s | Thread: %s%n",
                    resultado, Thread.currentThread().getName());
        });
        System.out.println("===============================================");
        System.out.println("Após a Operacao Terminal for chamada, então o pipeline é processado!");

    }
}
