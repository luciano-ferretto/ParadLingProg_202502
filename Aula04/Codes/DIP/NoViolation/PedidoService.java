package DIP.NoViolation;

public class PedidoService {
    private PedidoRepository pedidoRepository;

    // Injeção de dependência via construtor
    public PedidoService(PedidoRepository pedidoRepository) {
        this.pedidoRepository = pedidoRepository;
    }

    public void processarPedido() {
        System.out.println("Processando pedido...");
        pedidoRepository.salvarPedido();
    }
}
