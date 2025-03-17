package exerciciosClasses;

public class main {
    public static void main(String[] args) {
        //1- Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
        Pessoa pessoa = new Pessoa();
        pessoa.ExibeTexto();

        //2- Crie uma classe Calculadora com um método que recebe um número como
        // parâmetro e retorna o dobro desse número.
        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.dobraValor(5));

        //3- Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos
        // para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        Musica musica = new Musica();
        musica.titulo = "Isso é sério";
        musica.artista = "Matue";
        musica.anoDeLancamento = 2024;
        musica.setAvaliacao(8);
        musica.setAvaliacao(9);
        musica.setAvaliacao(10);
        musica.calculaMedia();
        musica.exibeFichaTec();

        //4- Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a
        // idade do carro.
        Carro carro = new Carro();
        carro.modelo = "SUV";
        carro.cor = "Preto";
        carro.ano = 2020;
        carro.calculaIdade(2025);
        carro.exibeFichaTecnica();

        //5- Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância
        // da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
        Aluno aluno = new Aluno();
        aluno.nome = "Pedro";
        aluno.idade = 16;
        aluno.exibeFichaAluno();
    }
}
