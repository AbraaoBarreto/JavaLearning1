import exerciciosClasses04.*;

public class Main04 {
    public static void main(String[] args) {
        //1- Crie uma classe ConversorMoeda que implementa uma interface ConversaoFinanceira com o método
        // converterDolarParaReal() para converter um valor em dólar para reais. A classe deve receber o valor em
        // dólar como parâmetro.
        ConversorMoeda conversor = new ConversorMoeda();
        conversor.setValorEmDolar(400);
        conversor.setDolarHoje(5.73);
        System.out.println("A conversão do valor em dolar pra real é: " + conversor.dolarToReal());

        //2- Crie uma classe CalculadoraSalaRetangular que implementa uma interface CalculoGeometrico com os métodos
        // calcularArea() e calcularPerimetro() para calcular a área e o perímetro de uma sala retangular. A classe deve
        // receber altura e largura como parâmetros.
        CalculadoraSalaRetangular sala = new CalculadoraSalaRetangular();
        sala.setAltura(3);
        sala.setLargura(7);
        System.out.println("Area: " + sala.calcularArea());
        System.out.println("Perimetro: "+ sala.calcularPerimetro());

        //3- Crie uma classe TabuadaMultiplicacao que implementa uma interface Tabuada com o método mostrarTabuada()
        // para exibir a tabuada de um número. A classe deve receber o número como parâmetro.
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.setNum(5);
        tabuada.mostrarTabuada();

        //4- Crie uma interface ConversorTemperatura com os métodos celsiusParaFahrenheit() e fahrenheitParaCelsius().
        // Implemente uma classe ConversorTemperaturaPadrao que implementa essa interface com as fórmulas de conversão
        // e exibe os resultados.
        ConversorTemperaturaPadrao converterTemp = new ConversorTemperaturaPadrao();
        converterTemp.setTempEmCelsius(23);
        System.out.println(converterTemp.celsiusToFahrenheint());
        converterTemp.setTempEmFahrenheint(104);
        System.out.println(converterTemp.fahrenheintToCelsius());

        //5- Crie uma interface Calculavel com um método double calcularPrecoFinal(). Implemente essa interface nas
        // classes Livro e ProdutoFisico, cada uma retornando o preço final considerando descontos ou taxas adicionais.
        Book book1 = new Book();
        book1.setValor(100);
        book1.setDesconto(10);
        System.out.println(book1.calcularPrecoFinal());

        ProdutoFisico item = new ProdutoFisico();
        item.setValor(100);
        item.setAcrescimo(10);
        System.out.println(item.calcularPrecoFinal());

        //6- Crie uma interface Vendavel com métodos para calcular o preço total de um produto com base na quantidade
        // comprada e aplicar descontos. Implemente essa interface nas classes Produto e Servico, cada uma fornecendo a
        // sua própria lógica de cálculo de preço.
        Produto produto1 = new Produto();
        produto1.setQuantidadeProdutos(10);
        produto1.setValorProduto(20);
        produto1.setDesconto(25);
        System.out.println(produto1.aplicaDesconto());
        System.out.println(produto1.calculoPrecoFinal());

        Servico servico1 = new Servico();
        servico1.setValorServico(100);
        servico1.setQuantidadeServicos(3);
        servico1.setValorDesconto(10);
        System.out.println(servico1.aplicaDesconto());
    }
}
