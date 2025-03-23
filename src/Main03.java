import exerciciosClasses03.Cachorro;
import exerciciosClasses03.Caminhonete;
import exerciciosClasses03.ContaCorrente;
import exerciciosClasses03.Gato;

public class Main03 {
    public static void main(String[] args) {
        //1-Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente
        // métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior
        // preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal
        // para definir preços e mostrar informações.
        Caminhonete caminhonete1 = new Caminhonete();
        caminhonete1.setModelo("Hilux");
        caminhonete1.definePreco(220000, 240000, 250000);
        caminhonete1.setCapaciadeDeCarga(1010);
        caminhonete1.exibeInfos();

        //2- Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que
        // herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para
        // indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como
        // abanarRabo() para o Cachorro e arranharMoveis() para o Gato.
        Cachorro dog1 = new Cachorro();
        dog1.emiteSom();
        dog1.abanaRabo();

        Gato cat1 = new Gato();
        cat1.arranhaMoveis();
        cat1.emiteSom();

        //3- Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e
        // consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione
        // um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta
        // corrente.
        ContaCorrente conta1 = new ContaCorrente();
        conta1.deposita(1000);
        conta1.consultaSaldo();
        conta1.descontaTarifa();
        conta1.consultaSaldo();
        conta1.retira(500);
        conta1.consultaSaldo();
    }
}
