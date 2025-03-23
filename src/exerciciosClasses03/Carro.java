package exerciciosClasses03;

import exerciciosClasses.Calculadora;

public class Carro {
    private String modelo;
    private double valorAno1, valorAno2, valorAno3;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definePreco (double valorAno1, double valorAno2, double valorAno3){
        this.valorAno1 = valorAno1;
        this.valorAno2 = valorAno2;
        this.valorAno3 = valorAno3;
    }

    private double calculaMenorValor() {
        double valorMenor = valorAno1;
        if (valorAno2 < valorMenor) {
            valorMenor = valorAno2;
        }

        if (valorAno3 < valorMenor) {
            valorMenor = valorMenor;
        }
        return valorMenor;
    }

    private double calculaMaiorValor() {
        double valorMaior = valorAno1;
        if (valorAno2 > valorMaior) {
            valorMaior = valorAno2;
        }

        if (valorAno3 > valorMaior) {
            valorMaior = valorAno3;
        }
        return valorMaior;
    }

    private double calculaValorMedio() {
        return (valorAno1 + valorAno2 + valorAno3) / 3;
    }

    public void exibeInfos() {
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Valor no primeiro ano: " + valorAno1);
        System.out.println("Valor no segundo ano: " + valorAno2);
        System.out.println("Valor no terceiro ano: " + valorAno3);
        System.out.println("Valor medio nesses 3 anos: " + calculaValorMedio());
        System.out.println("Menor valor nesses 3 anos: " + calculaMenorValor());
        System.out.println("Maior valor nesses 3 anos: " + calculaMaiorValor());
    }
}

