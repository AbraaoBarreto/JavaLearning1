package exerciciosClasses03;

public class Caminhonete extends Carro{
    private double capaciadeDeCarga;

    public void setCapaciadeDeCarga(double capaciadeDeCarga) {
        this.capaciadeDeCarga = capaciadeDeCarga;
    }

    @Override
    public void exibeInfos() {
        super.exibeInfos();
        System.out.println("Capacidade de carga em kilos: " + capaciadeDeCarga);
    }
}
