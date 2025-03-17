package exerciciosClasses02;

public class Produto {
    private String nome;
    private double valor;

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public double aplicaDesconto(double porcentagem) {
        double valorDescontado = (porcentagem / 100) * valor;
        double valorFinal = valor - valorDescontado;
        return valorFinal;
    }


}
