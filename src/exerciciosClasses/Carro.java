package exerciciosClasses;

public class Carro {
    String modelo, cor;
    int ano, idade;

    int calculaIdade(int anoAtual) {
        idade = anoAtual - ano;
        return idade;
    }

    void exibeFichaTecnica() {
        System.out.println("Modelo: " + modelo);
        System.out.println("cor: " + cor);
        System.out.println("Ano: " + ano);
        System.out.println("Idade do carro(em anos): " + idade);
    }
}
