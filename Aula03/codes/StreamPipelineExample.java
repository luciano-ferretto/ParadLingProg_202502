import java.util.List;

public class StreamPipelineExample {
    public static void main(String[] args) {
        List<String> nomes = List.of("Ana", "Bruno", "Carlos", "Daniel");
        // Nenhuma operação foi executada ainda!
        var streamPipeline = nomes.stream();
        streamPipeline.filter(nome -> {
                System.out.println("Filtrando: " + nome);
                return nome.startsWith("B");
            })
            .map(nome -> {
                System.out.println("Convertendo para maiúsculas: " + nome);
                return nome.toUpperCase();
            });
        System.out.println("Pipeline criado, mas nada foi processado ainda!");
        System.out.println("===============================================");
        // Agora o Stream será processado
        List<String> resultado = streamPipeline.toList();
        System.out.println("===============================================");
        System.out.println("Após a Operacao Terminal for chamada, então o pipeline é processado!");
        System.out.println("Resultado final: " + resultado);
    }
}
