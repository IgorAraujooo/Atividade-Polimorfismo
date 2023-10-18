package br.senai.sp.jandira.model;

public class Circulo extends FormaGeometrica {
    private double raioCirculo;

    public Circulo(double raio) {
        this.raioCirculo = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raioCirculo * raioCirculo;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raioCirculo;
    }
}

