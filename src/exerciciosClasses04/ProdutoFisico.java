package exerciciosClasses04;

public class ProdutoFisico implements Calculavel{
    private double valor;
    private double acrescimo;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(double acrescimo) {
        this.acrescimo = acrescimo;
    }

    @Override
    public double calcularPrecoFinal() {
        return valor + (valor * (acrescimo / 100));
    }
}
