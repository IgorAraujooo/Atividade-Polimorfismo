package br.senai.sp.jandira.model;

public class Retangulo extends FormaGeometrica {
    private double comprimentoRetangulo;
    private double larguraRetangulo;

    public Retangulo(double comprimento, double largura) {
        this.comprimentoRetangulo = comprimento;
        this.larguraRetangulo = largura;
    }

    @Override
    public double calcularArea() {
        return comprimentoRetangulo * larguraRetangulo;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (comprimentoRetangulo + larguraRetangulo);
    }
}