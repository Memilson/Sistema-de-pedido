public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("123", 100.0, "Cliente VIP");

        DescontoStrategy descontoStrategy = new DescontoClienteVip();
        Notificador notificador = new EmailNotificador();
        PedidoRepository pedidoRepository = new PedidoRepositoryImpl();

        ProcessadorDePedidos processador = new ProcessadorDePedidos(descontoStrategy, notificador, pedidoRepository);
        processador.processarPedido(pedido);
    }
}