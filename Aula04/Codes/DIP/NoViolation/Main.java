package DIP.NoViolation;

public class Main {
    public static void main(String[] args) {
        PedidoRepository repository = new MySQLPedidoRepository();
        PedidoService service = new PedidoService(repository);
        service.processarPedido();
    
        PedidoRepository outroRepository = new PostgreSQLPedidoRepository();
        PedidoService outroService = new PedidoService(outroRepository);
        outroService.processarPedido();
    }
    
}
