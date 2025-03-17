package exerciciosClasses02;

public class Main {
    public static void main(String[] args) {
        //1- Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular
        // (publico). Implemente métodos getters e setters para os atributos privados.
        ContaBancaria conta1 = new ContaBancaria();
        conta1.titular = "Yuri Alberto";
        conta1.setNumeroDaConta(123456);
        conta1.setSaldo(10000.00);
        System.out.println("Titular: " + conta1.titular);
        System.out.println("Numero da conta: " + conta1.getNumeroDaConta());
        System.out.println("Saldo: " + conta1.getSaldo());

        //2- Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para
        // acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de
        // idade ou não.
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setIdade(19);
        pessoa1.setNome("Garro");
        pessoa1.VerificaIdade();

        //3- Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters
        // para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual
        // e reduz o preço do produto.
        Produto produto1 = new Produto();
        produto1.setNome("PC");
        produto1.setValor(1000);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println("Valor final apos os desconto: " + produto1.aplicaDesconto(10));

        //4- Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para
        // acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Bruna");
        aluno1.setNotas(4);
        aluno1.setNotas(10);
        aluno1.setNotas(10);
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Media final: " + aluno1.calculaMedia());

        //5- Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters
        // para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do
        // livro.
        Livro livro1 = new Livro();
        livro1.setTitulo("Dom Casmurro");
        livro1.setAutor("Machado de Assis");
        livro1.ExibeInfos();
    }
}
