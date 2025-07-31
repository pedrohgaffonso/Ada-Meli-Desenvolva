import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa um pedido, contendo uma lista de itens.
 */
public class Pedido {
    private List<ItemPedido> itens = new ArrayList<>();

    /**
     * Adiciona um item à lista do pedido.
     * @param item O ItemPedido a ser adicionado.
     */
    public void adicionarItem(ItemPedido item) {
        this.itens.add(item);
    }

    /**
     * Calcula o valor total do pedido somando os subtotais de todos os itens.
     * @return O valor total.
     */
    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }
}
