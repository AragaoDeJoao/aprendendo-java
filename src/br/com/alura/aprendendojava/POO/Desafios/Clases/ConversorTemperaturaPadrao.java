package br.com.alura.aprendendojava.POO.Desafios.Clases;

import br.com.alura.aprendendojava.POO.Desafios.Interface.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    private double temperatura;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override // °F = °C x 1,8 + 32
    public double celsiusParaFahrenheit(double c) {
        this.temperatura = (c * 1.8) + 32;
        return this.temperatura;
    }

    @Override //°C = (°F - 32) / 1,8
    public double fahrenheitParaCelsius(double f) {
        this.temperatura = (f - 32) / 1.8;
        return this.temperatura;
    }
}
