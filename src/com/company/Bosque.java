package com.company;

import java.util.ArrayList;

public class Bosque {
    private static final ArrayList<Arbol> arboles = new ArrayList<>();

    public void plantarArboles(){
        int contadorRojo = 0;
        int contadorVerde = 0;

        Arbol arbolUno = ArbolFactory.obtenerArbol("Ornamental");
        arbolUno.setAlto(200);
        arbolUno.setAncho(400);
        arbolUno.setColor("Verde");
        arboles.add(arbolUno);

        Arbol arbolTres = ArbolFactory.obtenerArbol("Frutal");
        arbolTres.setAlto(100);
        arbolTres.setAncho(200);
        arbolTres.setColor("Celeste");
        arboles.add(arbolTres);

        Arbol arbolDos = ArbolFactory.obtenerArbol("Frutal");
        arbolDos.setAlto(500);
        arbolDos.setAncho(300);
        arbolDos.setColor("Rojo");
        arboles.add(arbolDos);

        for (int i = 0; i < 10; i++){
            for (int j = 0; j < arboles.size(); j++){
                Arbol arbol = arboles.get(j);
                if (arbol.getColor().equals("Verde") && contadorVerde < 5) {
                    arbol.mostrarArbol();
                    contadorVerde++;
                }
                if (arbol.getColor().equals("Rojo") && contadorRojo < 5) {
                    arbol.mostrarArbol();
                    contadorRojo++;
                }
            }
        }
    }
}
