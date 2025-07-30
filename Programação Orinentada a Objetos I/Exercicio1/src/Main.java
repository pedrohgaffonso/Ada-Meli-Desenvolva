import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<ContaBancaria> contas = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            exibirMenuPrincipal();
            int opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    criarNovaConta();
                    break;
                case 2:
                    acessarConta();
                    break;
                case 3:
                    encerrarConta(); // Nova funcionalidade
                    break;
                case 4:
                    System.out.println("Encerrando o sistema. Até logo!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }

    private static void exibirMenuPrincipal() {
        System.out.println("\n--- BEM-VINDO AO SISTEMA BANCÁRIO ---");
        System.out.println("1. Criar Nova Conta");
        System.out.println("2. Acessar Conta");
        System.out.println("3. Encerrar Conta"); // Nova opção
        System.out.println("4. Sair"); // Sair agora é a opção 4
        System.out.print("Escolha uma opção: ");
    }

    private static void criarNovaConta() {
        System.out.println("\n--- CRIAÇÃO DE CONTA ---");
        System.out.print("Digite o número da conta: ");
        int numero = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o saldo inicial: R$ ");
        double saldo = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite sua renda mensal: R$ ");
        double rendaMensal = Double.parseDouble(scanner.nextLine());

        ContaBancaria novaConta;
        if (rendaMensal < 5000.0) {
            novaConta = new ContaBancaria(numero, saldo);
            System.out.println("Conta Comum criada com sucesso!");
        } else {
            double limite = rendaMensal * 1.8;
            novaConta = new ContaEspecial(numero, saldo, limite);
            System.out.printf("Conta Especial criada com sucesso! Seu limite de crédito é de R$ %.2f\n", limite);
        }
        contas.add(novaConta);
    }

    private static void encerrarConta() {
        System.out.print("\nDigite o número da conta que deseja encerrar: ");
        int numero = Integer.parseInt(scanner.nextLine());
        ContaBancaria conta = buscarContaPorNumero(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return;
        }

        // Verifica se há débitos (saldo negativo, possível em Conta Especial)
        if (conta.getSaldo() < 0) {
            System.out.println("Não é possível encerrar a conta. Existem débitos pendentes.");
            System.out.printf("Saldo devedor: R$ %.2f\n", conta.getSaldo());
        } else if (conta.getSaldo() > 0) {
            System.out.printf("Não é possível encerrar a conta. O saldo precisa ser zerado. Saldo atual: R$ %.2f\n", conta.getSaldo());
            System.out.println("Por favor, realize um saque do valor restante antes de encerrar.");
        } else {
            // Se o saldo for R$ 0.0, permite o encerramento
            contas.remove(conta);
            System.out.printf("Conta %d encerrada com sucesso.\n", numero);
        }
    }

    private static void acessarConta() {
        System.out.print("\nDigite o número da conta para acessar: ");
        int numero = Integer.parseInt(scanner.nextLine());
        ContaBancaria conta = buscarContaPorNumero(numero);

        if (conta == null) {
            System.out.println("Conta não encontrada.");
            return;
        }

        System.out.printf("Acesso autorizado à conta %d.\n", conta.getNumero());

        while (true) {
            exibirMenuConta(conta);
            int opcao = Integer.parseInt(scanner.nextLine());

            if (opcao == 4) {
                System.out.println("Retornando ao menu principal...");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depositar: R$ ");
                    double valorDeposito = Double.parseDouble(scanner.nextLine());
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor para sacar: R$ ");
                    double valorSaque = Double.parseDouble(scanner.nextLine());
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.consultarSaldo();
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }

    private static void exibirMenuConta(ContaBancaria conta) {
        System.out.println("\n--- MENU DA CONTA " + conta.getNumero() + " ---");
        if (conta instanceof ContaEspecial) {
            System.out.println("Tipo: Conta Especial");
        } else {
            System.out.println("Tipo: Conta Comum");
        }
        System.out.println("1. Depositar");
        System.out.println("2. Sacar");
        System.out.println("3. Consultar Saldo");
        System.out.println("4. Voltar ao Menu Principal");
        System.out.print("Escolha uma opção: ");
    }

    private static ContaBancaria buscarContaPorNumero(int numero) {
        for (ContaBancaria conta : contas) {
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        return null;
    }
}