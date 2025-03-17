package exerciciosClasses02;

public class Aluno {
    private String nome;
    private double notas;
    private int numNotas = 0;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double notas) {
        this.notas += notas;
        numNotas++;
    }

    public String getNome() {
        return nome;
    }

    public double calculaMedia() {
        return notas / numNotas;
    }
}
