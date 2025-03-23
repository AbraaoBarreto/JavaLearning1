package exerciciosClasses04;

public class Book implements Calculavel{
    private double valor;
    private double desconto;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return valor - (valor * (desconto / 100)) ;
    }
}
