// Interface DescontoStrategy
public interface DescontoStrategy {
    double aplicarDesconto(double total);
}

// Implementação para cliente comum
public class DescontoClienteComum implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double total) {
        return total * 0.95; // 5% de desconto
    }
}

// Implementação para cliente VIP
public class DescontoClienteVip implements DescontoStrategy {
    @Override
    public double aplicarDesconto(double total) {
        return total * 0.90; // 10% de desconto
    }
}