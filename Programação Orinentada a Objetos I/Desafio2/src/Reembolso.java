public class Reembolso {

    private String nomeFuncionario;
    private int diasTrabalhados;

    public Reembolso(String nomeFuncionario, int diasTrabalhados) {
        this.nomeFuncionario = nomeFuncionario;
        this.diasTrabalhados = diasTrabalhados;
    }

    public double calcularReembolso(double alimentacao, double transporte, double hospedagem) {
        return alimentacao + transporte + hospedagem;
    }

    public double calcularReembolso(double alimentacao, double transporte) {
        return alimentacao + transporte;
    }

    public void imprimirResumoReembolso(double valorTotal) {
        double valorFinal = valorTotal;
        if (diasTrabalhados > 7) {
            valorFinal *= 1.10; // Aplica bônus de 10%
        }

        System.out.println("\n--- Resumo do Reembolso ---");
        System.out.println("Nome do Funcionário: " + nomeFuncionario);
        System.out.println("Dias Trabalhados: " + diasTrabalhados);
        if (diasTrabalhados > 7) {
            System.out.println("Bônus de 10% aplicado!");
        }
        System.out.printf("Valor Total do Reembolso: R$ %.2f\n", valorFinal);
        System.out.println("--------------------------");
    }
}