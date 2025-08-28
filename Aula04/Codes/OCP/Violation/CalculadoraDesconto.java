package OCP.Violation;

public class CalculadoraDesconto {
    public double calcularDesconto(String tipoCliente, double valorCompra) {
        if (tipoCliente.equals("Comum")) {
            return valorCompra * 0.05;
        } else if (tipoCliente.equals("VIP")) {
            return valorCompra * 0.10;
        } else if (tipoCliente.equals("Funcionário")) {
            return valorCompra * 0.15;
        } else {
            return 0;
        }
    }
}
