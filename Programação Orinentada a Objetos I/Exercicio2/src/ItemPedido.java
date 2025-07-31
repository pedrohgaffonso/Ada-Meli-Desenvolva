/**
 * Classe que representa um item de um pedido, associando um Produto a uma quantidade.
 */
public class ItemPedido {
    private Produto produto;
    private int quantidade;

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Calcula o subtotal para este item (preço do produto * quantidade).
     * @return O valor do subtotal.
     */
    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }
}
