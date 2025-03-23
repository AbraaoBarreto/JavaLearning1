package exerciciosClasses04;

public class Produto implements Vendavel{
    private int quantidadeProdutos;
    private double valorProduto;
    private double desconto;
    private boolean permissaoDesconto = true;

    public int getQuantidadeProdutos() {
        return quantidadeProdutos;
    }

    public void setQuantidadeProdutos(int quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    @Override
    public double calculoPrecoFinal() {
        return quantidadeProdutos * aplicaDesconto();
    }

    @Override
    public double aplicaDesconto() {
        if (permissaoDesconto == true) {
            return valorProduto - (valorProduto * (desconto / 100));
        } else {
            return valorProduto;
        }
    }
}
