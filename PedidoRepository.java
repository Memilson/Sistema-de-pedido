// Interface para o repositório de pedidos
public interface PedidoRepository {
    void salvar(Pedido pedido);
}

// Implementação do repositório de pedidos
public class PedidoRepositoryImpl implements PedidoRepository {
    @Override
    public void salvar(Pedido pedido) {
        System.out.println("Pedido salvo no banco de dados: " + pedido.getId());
    }
}