package br.edu.fatecpg.springsemweb.model;

public class Carro {
    private String codigoFipe;
    private String marca;
    private String modelo;
    private int anoModelo;

    // Getters e Setters
    public String getCodigoFipe() {
        return codigoFipe;
    }

    public void setCodigoFipe(String codigoFipe) {
        this.codigoFipe = codigoFipe;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "codigoFipe='" + codigoFipe + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anoModelo=" + anoModelo +
                '}';
    }
}
