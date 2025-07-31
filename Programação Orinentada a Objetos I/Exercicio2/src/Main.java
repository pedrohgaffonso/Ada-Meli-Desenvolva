import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Classe principal para gerenciar uma loja virtual de forma interativa.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Cria uma lista de produtos disponíveis (nosso catálogo)
        List<Produto> catalogo = new ArrayList<>();
        catalogo.add(new Produto("Notebook Gamer i7-10700K", 8500.00));
        catalogo.add(new Produto("Mouse sem fio Logitech", 250.00));
        catalogo.add(new Produto("Teclado Mecânico RGB", 450.00));
        catalogo.add(new Produto("Monitor Ultrawide 34\"", 2200.00));
        catalogo.add(new Produto("Headset Gamer 7.1", 350.00));

        Pedido pedidoAtual = new Pedido();
        boolean finalizado = false;

        while (!finalizado) {
            System.out.println("\n--- MENU DA LOJA VIRTUAL ---");
            System.out.println("1. Adicionar produto ao pedido");
            System.out.println("2. Ver meu pedido");
            System.out.println("3. Finalizar pedido");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int opcao = scanner.nextInt();
                scanner.nextLine(); // consome a nova linha

                switch (opcao) {
                    case 1:
                        // Exibe o catálogo de produtos
                        System.out.println("\n--- CATÁLOGO DE PRODUTOS ---");
                        for (int i = 0; i < catalogo.size(); i++) {
                            Produto p = catalogo.get(i);
                            System.out.printf("%d. %s - R$ %.2f\n", (i + 1), p.getNome(), p.getPreco());
                        }
                        System.out.print("Digite o número do produto que deseja adicionar: ");
                        int numeroProduto = scanner.nextInt();

                        if (numeroProduto > 0 && numeroProduto <= catalogo.size()) {
                            Produto produtoEscolhido = catalogo.get(numeroProduto - 1);
                            System.out.print("Digite a quantidade: ");
                            int quantidade = scanner.nextInt();
                            scanner.nextLine(); // consome a nova linha após a quantidade

                            if(quantidade > 0) {
                                ItemPedido novoItem = new ItemPedido(produtoEscolhido, quantidade);
                                pedidoAtual.adicionarItem(novoItem);
                                System.out.println("Produto adicionado ao pedido com sucesso!");
                            } else {
                                System.out.println("Quantidade inválida.");
                            }
                        } else {
                            System.out.println("Número de produto inválido. Tente novamente.");
                        }
                        break;
                    case 2:
                        exibirDetalhesPedido(pedidoAtual);
                        break;
                    case 3:
                        if (pedidoAtual.getItens().isEmpty()) {
                            System.out.println("Seu pedido está vazio. Adicione itens antes de finalizar.");
                        } else {
                            System.out.println("\n--- PEDIDO FINALIZADO ---");
                            exibirDetalhesPedido(pedidoAtual);
                            finalizado = true; // Finaliza o loop
                        }
                        break;
                    case 4:
                        System.out.println("Saindo do sistema...");
                        finalizado = true;
                        break;
                    default:
                        System.out.println("Opção inválida. Por favor, tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("\nErro: Entrada inválida. Por favor, digite um número correspondente à opção.");
                scanner.nextLine(); // Limpa o buffer do scanner para a próxima iteração.
            }
        }
        scanner.close();
    }

    /**
     * Exibe os detalhes de um pedido, incluindo todos os itens e o valor total.
     * @param pedido O pedido a ser exibido.
     */
    public static void exibirDetalhesPedido(Pedido pedido) {
        if(pedido.getItens().isEmpty()) {
            System.out.println("\nO pedido ainda está vazio.");
            return;
        }
        System.out.println("\n--- Resumo do Pedido ---");
        for (ItemPedido item : pedido.getItens()) {
            System.out.printf("Produto: %s | Quantidade: %d | Subtotal: R$ %.2f\n",
                    item.getProduto().getNome(),
                    item.getQuantidade(),
                    item.getSubtotal());
        }
        System.out.println("-------------------------");
        System.out.printf("Valor total do pedido: R$ %.2f\n", pedido.calcularTotal());
    }
}