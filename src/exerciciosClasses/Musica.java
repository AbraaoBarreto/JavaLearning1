package exerciciosClasses;

public class Musica {
    String titulo, artista;
    int anoDeLancamento, numAvaliacoes;
    double mediaAvaliacoes, avaliacaoTotal, avaliacao;

    public void setAvaliacao(double avaliacao) {
        this.avaliacao = avaliacao;
        avaliacaoTotal += avaliacao;
        numAvaliacoes++;
    }

    public double calculaMedia() {
        mediaAvaliacoes = avaliacaoTotal / numAvaliacoes;
        return mediaAvaliacoes;
    }
    public void exibeFichaTec() {
        System.out.println("Musica: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Nota media: " + mediaAvaliacoes);
        System.out.println("Total de avaliacoes: " + numAvaliacoes);
    }
}
