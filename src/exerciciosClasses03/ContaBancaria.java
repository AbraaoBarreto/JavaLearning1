package exerciciosClasses03;

public class ContaBancaria {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public double deposita(double valor) {
        saldo += valor;
        return saldo;
    }

    public double retira(double valor) {
        if (valor <= saldo){
            saldo -= valor;
            return saldo;
        } else {
            System.out.println("O valor que você deseja retirar maior do que o seu saldo atual.");
            return saldo;
        }
    }

    public void consultaSaldo() {
        System.out.println("O saldo atual do cliente é de: R$" + saldo);
    }

}
