package DIP.NoViolation;

public class MySQLPedidoRepository implements PedidoRepository {
    @Override
    public void salvarPedido() {
        System.out.println("Pedido salvo no MySQL.");
    }
}
