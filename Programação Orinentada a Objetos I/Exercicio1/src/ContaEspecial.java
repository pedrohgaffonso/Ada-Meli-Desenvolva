public class ContaEspecial extends ContaBancaria {

    private double limite;

    public ContaEspecial(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= (this.saldo + this.limite)) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso na conta especial.");
        } else {
            System.out.println("Limite insuficiente para saque.");
        }
    }

    public double getLimite() {
        return limite;
    }
}