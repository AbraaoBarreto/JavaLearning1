package listaExercicios;

import java.util.Scanner;

public class ListaExerciocios {
    public static void main(String[] args) {
        //1- Crie um projeto Java no IntelliJ que deve conter uma classe chamada Perfil, com o método main, que ao
        //executar deverá imprimir um cumprimento personalizado no console. Por exemplo, "Olá, [Seu Nome]!".
        System.out.println("Olá, Abraão.");

        //2- Modifique o programa para imprimir uma segunda mensagem de cumprimento personalizada.
        //Por exemplo, "Tudo bem?".
        System.out.println("Abraão, tudo bem?");

    }
}

//3- Crie uma classe chamada Estudos para imprimir anotações de estudos no console.
class Estudos {
    public static void main(String[] args) {
        System.out.println("<anotações...>");
    }
}

//4- Crie uma classe Soma em Java para imprimir no console o resultado da operação 10 + 5.
//Certifique-se de que o resultado seja exibido sem o uso de aspas, apresentando o valor "15" ao invés da expressão "10+5".
class Soma {
    public static void main(String[] args) {
        System.out.println(10 + 5);
    }
}

//5- Crie uma classe Subtracao para imprimir o resultado de 10 - 5 no console.
class Subtracao {
    public static void main(String[] args) {
        System.out.println(10 - 5);
    }
}

//6- Crie um programa que realize a média de duas notas decimais e exiba o resultado.
class Media {
    public static void main(String[] args) {
        double nota1, nota2, media;
        nota1 = 6;
        nota2 = 10;
        media = (nota1 + nota2) / 2;
        System.out.println("A media do aluno é: " + media);
    }
}

//7- Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para
// int e imprima o resultado.
class Sete {
    public static void main(String[] args) {
        double num1 = 7.6;
        int num2 = (int) num1;
        System.out.println(num2);
    }
}

//8- Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas
// variáveis e concatene-as em uma mensagem.
class Oito {
    public static void main(String[] args) {
        char artigo = 'A';
        String substantivo = " moça ";
        System.out.println(artigo + substantivo + "é bonita.");
    }
}

//9- Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade).
//Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado
//em uma mensagem.
class Nove {
    public static void main(String[] args) {
        double precoProduto = 299.99;
        int quantidade = 12;
        double valorTotal = precoProduto * quantidade;
        System.out.println("O valor total é de: " + valorTotal);
    }
}

//10- Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que
// o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor em dólares para reais e imprima o
// resultado formatado.
class Dez {
    public static void main(String[] args) {
        double valorEmDolares = 400;
        double dolarToReal = 4.94;
        double valorEmReais = valorEmDolares * dolarToReal;
        System.out.println("O valor em reais de 400 dolares é: " + valorEmReais);
    }
}

//11- Declare uma variável do tipo double precoriginal. Atribua um valor em reais a essa variável, representando o preço
// original de um produto. Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor
// percentual de desconto ao produto (por exemplo, 10 para 10%). Calcule o valor do desconto em reais, aplique-o ao
// preço original e imprima o novo preço com desconto.
class Onze {
    public static void main(String[] args) {
        double precoOriginal = 69;
        double percentualDesconto = 15;
        double valorDescontado = (percentualDesconto / 100) * precoOriginal;
        double valorFinal = precoOriginal - valorDescontado;

        System.out.println("O valor a ser pago após o desconto, é de: " + valorFinal);
    }
}

//12- Crie um programa que solicite ao usuário digitar um número. Se o número for positivo, exiba
//"Número positivo", caso contrário, exiba "Número negativo".
class Doze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero: ");
        int num = scanner.nextInt();
        if (num > 0) {
            System.out.println("Esse numero é positivo.");
        } else if (num < 0) {
            System.out.println("Esse numero é negativo.");
        }else {
            System.out.println("O numero zero é neutro.");
        }
    }
}

//13- Peça ao usuário para inserir dois números inteiros. Compare os números e imprima uma mensagem indicando se são
// iguais, diferentes, o primeiro é maior ou o segundo é maior.
class Treze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira insira dois numeros inteiros: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        if (num1 > num2) {
            System.out.println("Os numeros sao diferentes, onde o primeiro é maior que o segundo");
        } else if (num1 < num2) {
            System.out.println("Os numeros sao diferentes, onde o segundo é maior que o primeiro");
        } else {
            System.out.println("Os numeros sao iguais.");
        }
    }
}

//14- Crie um programa que solicite ao usuário um número e exiba a tabuada desse número de 1 a 10.
class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero inteiro: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

//15- Crie um programa que solicite ao usuário a entrada de um número inteiro. Verifique se o número é par ou ímpar e
// exiba uma mensagem correspondente.
class Quinze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um numero inteiro: ");
        int n = scanner.nextInt();
        if (n % 2 == 0){
            System.out.println("O numero é par");
        } else {
            System.out.println("O numero é impar");
        }
    }
}

//16 - Crie um programa que solicite ao usuário um número e calcule o fatorial desse número.
class Dezesseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fatorial = 1;

        System.out.println("Insira um numero: ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            fatorial *= i;
        }
        System.out.println("o fatorial desse numero é: " + fatorial);
    }
}
