package DIP.Violation;

public class PedidoService {
    private MySQLPedidoRepository pedidoRepository;
    public PedidoService() {
        this.pedidoRepository = new MySQLPedidoRepository();
             // DEPENDÊNCIA DIRETA!
    }
    public void processarPedido() {
        System.out.println("Processando pedido...");
        pedidoRepository.salvarPedido();
    }
}
