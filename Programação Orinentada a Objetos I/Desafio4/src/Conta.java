public class Conta {
    private String titular;
    private String numero;
    private double saldo;
    private static final double TAXA_OPERACAO = 0.50;

    public Conta(String titular, String numero, double saldoInicial) {
        this.titular = titular;
        this.numero = numero;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        this.saldo += valor - TAXA_OPERACAO;
        System.out.println("Depósito realizado com sucesso. Saldo atual: R$ " + String.format("%.2f", this.saldo));
    }

    private boolean temSaldoSuficiente(double valor) {
        return this.saldo >= (valor + TAXA_OPERACAO);
    }

    private void realizarDebito(double valor, String operacao) {
        if (temSaldoSuficiente(valor)) {
            this.saldo -= (valor + TAXA_OPERACAO);
            System.out.println(operacao + " realizado(a) com sucesso. Saldo atual: R$ " + String.format("%.2f", this.saldo));
        } else {
            System.out.println("Saldo insuficiente para realizar a operação.");
            System.out.println("Saldo atual: R$ " + String.format("%.2f", this.saldo));
        }
    }

    public void sacar(double valor) {
        realizarDebito(valor, "Saque");
    }

    public void transferir(double valor) {
        realizarDebito(valor, "Transferência");
    }

    public void pagar(double valor) {
        realizarDebito(valor, "Pagamento");
    }

    public String getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}