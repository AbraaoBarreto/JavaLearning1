package exerciciosClasses03;

public class ContaCorrente extends ContaBancaria{
    private double taxaMensal = 20;

    public double descontaTarifa() {
        saldo -= taxaMensal;
        return saldo;
    }
}
