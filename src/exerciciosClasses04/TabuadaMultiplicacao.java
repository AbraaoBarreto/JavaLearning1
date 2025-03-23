package exerciciosClasses04;

public class TabuadaMultiplicacao implements Tabuada{
    private int num;
    private int multiplicador;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public void mostrarTabuada() {
      while (multiplicador <=10) {
          int result = num * multiplicador;
          System.out.println(num + " x " + multiplicador + " = " + result);
          multiplicador++;

      }
    }
}
