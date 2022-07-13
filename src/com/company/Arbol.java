package com.company;

public class Arbol {
    private int alto;
    private int ancho;
    private String color;
    private String tipoDeArbol;

    public Arbol(String tipoDeArbol) {
        this.tipoDeArbol = tipoDeArbol;
    }

    public void mostrarArbol(){
        System.out.println("Mostrando arbol de tipo: " + this.tipoDeArbol + " con un alto y ancho de " + this.alto + " - " + this.ancho + " y de color " + this.color);
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
