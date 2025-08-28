package DIP.NoViolation;

public class PostgreSQLPedidoRepository implements PedidoRepository {
    @Override
    public void salvarPedido() {
        System.out.println("Pedido salvo no PostgreSQL");
    }
}
