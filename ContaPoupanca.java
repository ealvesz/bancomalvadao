public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(int numero, double saldo, String tipoConta, double taxaJuros) {
        super(numero, saldo, tipoConta);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJuros() {
        setSaldo(getSaldo() + (getSaldo() * taxaJuros));
    }
}
