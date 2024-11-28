public class ContaCorrente extends Conta {
    private double limite;

    public ContaCorrente(int numero, double saldo, String tipoConta, double limite) {
        super(numero, saldo, tipoConta);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public boolean verificarLimite(double valor) {
        return getSaldo() + limite >= valor;
    }

    @Override
    public boolean sacar(double valor) {
        if (verificarLimite(valor)) {
            setSaldo(getSaldo() - valor);
            return true;
        }
        return false;
    }
}
