import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                opcao = -1; // Define uma opção inválida para o loop continuar
            }

            switch (opcao) {
                case 1:
                    adicionarProduto();
                    break;
                case 2:
                    alterarProduto();
                    break;
                case 3:
                    removerProduto();
                    break;
                case 4:
                    venderProduto();
                    break;
                case 5:
                    listarProdutos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\n--- Menu de Gerenciamento de Produtos ---");
        System.out.println("1. Adicionar Produto");
        System.out.println("2. Alterar Produto");
        System.out.println("3. Remover Produto");
        System.out.println("4. Vender Produto");
        System.out.println("5. Listar Todos os Produtos");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void adicionarProduto() {
        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o preço do produto: ");
        double preco = Double.parseDouble(scanner.nextLine());
        System.out.print("Digite a quantidade em estoque (ou pressione Enter para iniciar com 0): ");
        String estoqueStr = scanner.nextLine();

        Produto novoProduto;
        if (estoqueStr.trim().isEmpty()) {
            novoProduto = new Produto(nome, preco);
        } else {
            try {
                int estoque = Integer.parseInt(estoqueStr);
                novoProduto = new Produto(nome, preco, estoque);
            } catch (NumberFormatException e) {
                System.out.println("Quantidade de estoque inválida. O produto será cadastrado com estoque 0.");
                novoProduto = new Produto(nome, preco);
            }
        }

        produtos.add(novoProduto);
        System.out.println("Produto adicionado com sucesso!");
    }

    private static void alterarProduto() {
        listarProdutos();
        if (produtos.isEmpty()) {
            return;
        }

        System.out.print("Digite o número do produto que deseja alterar: ");
        int indice;
        try {
            indice = Integer.parseInt(scanner.nextLine()) - 1;
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Operação cancelada.");
            return;
        }


        if (indice >= 0 && indice < produtos.size()) {
            Produto produto = produtos.get(indice);

            System.out.print("Digite o novo nome (atual: " + produto.getNome() + ") ou pressione Enter para manter: ");
            String novoNome = scanner.nextLine();
            if (!novoNome.trim().isEmpty()) {
                produto.setNome(novoNome);
            }

            System.out.print("Digite o novo preço (atual: " + produto.getPreco() + ") ou pressione Enter para manter: ");
            String novoPrecoStr = scanner.nextLine();
            if (!novoPrecoStr.trim().isEmpty()) {
                try {
                    double novoPreco = Double.parseDouble(novoPrecoStr);
                    produto.setPreco(novoPreco);
                } catch (NumberFormatException e) {
                    System.out.println("Formato de preço inválido. O preço não foi alterado.");
                }
            }

            System.out.print("Digite a nova quantidade em estoque (atual: " + produto.getEstoque() + ") ou pressione Enter para manter: ");
            String novoEstoqueStr = scanner.nextLine();
            if (!novoEstoqueStr.trim().isEmpty()) {
                try {
                    int novoEstoque = Integer.parseInt(novoEstoqueStr);
                    produto.setEstoque(novoEstoque);
                } catch (NumberFormatException e) {
                    System.out.println("Formato de estoque inválido. O estoque não foi alterado.");
                }
            }

            System.out.println("Produto alterado com sucesso!");
        } else {
            System.out.println("Número do produto inválido.");
        }
    }

    private static void removerProduto() {
        listarProdutos();
        if (produtos.isEmpty()) {
            return;
        }

        System.out.print("Digite o número do produto que deseja remover: ");
        int indice;
        try {
            indice = Integer.parseInt(scanner.nextLine()) - 1;
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Operação cancelada.");
            return;
        }

        if (indice >= 0 && indice < produtos.size()) {
            produtos.remove(indice);
            System.out.println("Produto removido com sucesso!");
        } else {
            System.out.println("Número do produto inválido.");
        }
    }

    private static void venderProduto() {
        listarProdutos();
        if (produtos.isEmpty()) {
            return;
        }

        System.out.print("Digite o número do produto que deseja vender: ");
        int indice;
        try {
            indice = Integer.parseInt(scanner.nextLine()) - 1;
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Operação cancelada.");
            return;
        }

        if (indice >= 0 && indice < produtos.size()) {
            Produto produto = produtos.get(indice);

            System.out.print("Digite a quantidade que deseja vender: ");
            int quantidade;
            try {
                quantidade = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Quantidade inválida. Operação cancelada.");
                return;
            }

            produto.vender(quantidade);
        } else {
            System.out.println("Número do produto inválido.");
        }
    }

    private static void listarProdutos() {
        System.out.println("\n--- Lista de Produtos ---");
        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (int i = 0; i < produtos.size(); i++) {
                System.out.println("Produto #" + (i + 1));
                produtos.get(i).exibirResumo();
            }
        }
    }
}