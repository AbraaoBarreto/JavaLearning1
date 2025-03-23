package exerciciosClasses04;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    private int tempEmCelsius;
    private double tempEmFahrenheint;

    public int getTempEmCelsius() {
        return tempEmCelsius;
    }

    public void setTempEmCelsius(int tempEmCelsius) {
        this.tempEmCelsius = tempEmCelsius;
    }

    public double getTempEmFahrenheint() {
        return tempEmFahrenheint;
    }

    public void setTempEmFahrenheint(double tempEmFahrenheint) {
        this.tempEmFahrenheint = tempEmFahrenheint;
    }

    @Override
    public double celsiusToFahrenheint() {
        return (tempEmCelsius * 1.8) + 32;
    }

    @Override
    public double fahrenheintToCelsius() {
        return (tempEmFahrenheint - 32) / 1.8;
    }
}
