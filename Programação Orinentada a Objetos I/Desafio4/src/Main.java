import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de Movimentação Bancária!");
        System.out.print("Digite o nome do titular da conta: ");
        String titular = scanner.nextLine();
        System.out.print("Digite o número da conta: ");
        String numero = scanner.nextLine();

        Conta conta = new Conta(titular, numero, 0.0);
        System.out.println("Conta criada para " + conta.getTitular() + " (Nº " + conta.getNumero() + "). Saldo inicial: R$ 0,00");

        int escolha = 0;
        while (escolha != 5) {
            System.out.println("\n--- Menu de Operações ---");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Transferir");
            System.out.println("4. Pagar");
            System.out.println("5. Sair");
            System.out.println("-------------------------");
            System.out.print("Escolha uma opção: ");

            escolha = scanner.nextInt();
            double valor;

            switch (escolha) {
                case 1:
                    System.out.print("Digite o valor do depósito: ");
                    valor = scanner.nextDouble();
                    conta.depositar(valor);
                    break;
                case 2:
                    System.out.print("Digite o valor do saque: ");
                    valor = scanner.nextDouble();
                    conta.sacar(valor);
                    break;
                case 3:
                    System.out.print("Digite o valor da transferência: ");
                    valor = scanner.nextDouble();
                    conta.transferir(valor);
                    break;
                case 4:
                    System.out.print("Digite o valor do pagamento: ");
                    valor = scanner.nextDouble();
                    conta.pagar(valor);
                    break;
                case 5:
                    System.out.println("Obrigado por utilizar nosso sistema. Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}