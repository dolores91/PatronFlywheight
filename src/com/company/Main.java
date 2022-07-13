package com.company;

public class Main {
    public static void main(String[] args) {
        Bosque bosque = new Bosque();
        bosque.plantarArboles();

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));
    }
}
