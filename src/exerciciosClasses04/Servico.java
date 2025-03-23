package exerciciosClasses04;

public class Servico implements Vendavel{
    private int quantidadeServicos;
    private double valorServico;
    private double valorDesconto;


    public int getQuantidadeServicos() {
        return quantidadeServicos;
    }

    public void setQuantidadeServicos(int quantidadeServicos) {
        this.quantidadeServicos = quantidadeServicos;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    @Override
    public double calculoPrecoFinal() {
        return valorServico * quantidadeServicos;
    }

    @Override
    public double aplicaDesconto() {
        double precoFinal = valorServico * quantidadeServicos;
        return precoFinal - (precoFinal * ((quantidadeServicos / 2) * (valorDesconto / 100)));
    }
}
