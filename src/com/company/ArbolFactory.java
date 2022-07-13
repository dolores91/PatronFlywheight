package com.company;

import java.util.HashMap;

public class ArbolFactory {
    private static final HashMap<String, Arbol> arbolMap = new HashMap<>();

    public static Arbol obtenerArbol(String tipoDeArbol){
        Arbol arbol = (Arbol) arbolMap.get(tipoDeArbol);
        if (arbol == null){
            arbol = new Arbol(tipoDeArbol);
            arbolMap.put(tipoDeArbol, arbol);
            System.out.println("Creamos arbol de tipo: " + tipoDeArbol);
        }
        return arbol;
    }
}
