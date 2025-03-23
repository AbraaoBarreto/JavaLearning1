package exerciciosClasses04;

public class ConversorMoeda implements ConversaoFinanceira{
    private double valorEmDolar;
    private double dolarHoje;

    public double getValorEmDolar() {
        return valorEmDolar;
    }

    public void setValorEmDolar(double valorEmDolar) {
        this.valorEmDolar = valorEmDolar;
    }

    public double getDolarHoje() {
        return dolarHoje;
    }

    public void setDolarHoje(double dolarHoje) {
        this.dolarHoje = dolarHoje;
    }

    @Override
    public double dolarToReal() {
        return valorEmDolar * dolarHoje;
    }
}
