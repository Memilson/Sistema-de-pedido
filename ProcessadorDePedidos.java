// Classe ProcessadorDePedidos
public class ProcessadorDePedidos {
    private DescontoStrategy descontoStrategy;
    private Notificador notificador;
    private PedidoRepository pedidoRepository;

    public ProcessadorDePedidos(DescontoStrategy descontoStrategy, Notificador notificador, PedidoRepository pedidoRepository) {
        this.descontoStrategy = descontoStrategy;
        this.notificador = notificador;
        this.pedidoRepository = pedidoRepository;
    }

    public void processarPedido(Pedido pedido) {
        double totalComDesconto = descontoStrategy.aplicarDesconto(pedido.getTotal());
        pedido.setTotal(totalComDesconto);

        pedidoRepository.salvar(pedido);
        notificador.enviarNotificacao("Pedido " + pedido.getId() + " processado com sucesso!");
    }
}