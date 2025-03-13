// Classe Pedido: Representa um pedido no sistema.
public class Pedido {
    private String id;
    private double total;
    private String cliente;

    public Pedido(String id, double total, String cliente) {
        this.id = id;
        this.total = total;
        this.cliente = cliente;
    }

    public String getId() {
        return id;
    }

    public double getTotal() {
        return total;
    }

    public String getCliente() {
        return cliente;
    }
}