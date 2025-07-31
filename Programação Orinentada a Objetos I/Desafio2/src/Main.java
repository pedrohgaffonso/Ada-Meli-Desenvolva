import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a quantidade de dias trabalhados: ");
        int dias = scanner.nextInt();

        Reembolso reembolso = new Reembolso(nome, dias);

        System.out.print("Digite o valor da despesa com alimentação: ");
        double alimentacao = scanner.nextDouble();

        System.out.print("Digite o valor da despesa com transporte: ");
        double transporte = scanner.nextDouble();

        System.out.print("Houve despesa com hospedagem? (s/n): ");
        char temHospedagem = scanner.next().charAt(0);

        double valorTotal;

        if (temHospedagem == 's' || temHospedagem == 'S') {
            System.out.print("Digite o valor da despesa com hospedagem: ");
            double hospedagem = scanner.nextDouble();
            valorTotal = reembolso.calcularReembolso(alimentacao, transporte, hospedagem);
        } else {
            valorTotal = reembolso.calcularReembolso(alimentacao, transporte);
        }

        reembolso.imprimirResumoReembolso(valorTotal);

        scanner.close();
    }
}