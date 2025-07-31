public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    // Construtor que inicializa todos os atributos
    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    // Construtor que inicializa nome e preco, com estoque 0
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = 0;
    }

    // --- Getters e Setters ---
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    // --- Métodos de Negócio ---
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.estoque += quantidade;
            System.out.println(quantidade + " unidades de " + this.nome + " adicionadas ao estoque.");
        } else {
            System.out.println("A quantidade para adicionar deve ser positiva.");
        }
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && this.estoque >= quantidade) {
            this.estoque -= quantidade;
            System.out.println(quantidade + " unidades de " + this.nome + " vendidas.");
        } else if (quantidade <= 0) {
            System.out.println("A quantidade para vender deve ser positiva.");
        } else {
            System.out.println("Estoque insuficiente de " + this.nome + " para realizar a venda.");
        }
    }

    public void exibirResumo() {
        System.out.println("--- Resumo do Produto ---");
        System.out.println("Nome: " + this.nome);
        System.out.printf("Preço: R$ %.2f\n", this.preco);
        System.out.println("Quantidade em Estoque: " + this.estoque);
        System.out.println("-------------------------");
    }
}