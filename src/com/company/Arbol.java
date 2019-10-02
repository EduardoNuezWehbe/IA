package com.company;

import java.util.Vector;

public class Arbol {
    int nodoInicial;
    int nodoFinal;

    public Arbol(int inicio, int fin) {
        nodoInicial = inicio;
        nodoFinal = fin;
    }
    public void write () {
        System.out.println("Nodo inicio: " + nodoInicial + "\nNodo final: " + nodoFinal);
    }
    public void crearArbol (Vector<Nodo> informacionArbol) {
        Vector<Integer> nodosAccesibles = new Vector<>();
        nodosAccesibles = informacionArbol.get(nodoInicial).nodosPosibles();
        System.out.print("Nodos accesibles por " + nodoInicial + ":" );
        for(int i = 0; i < nodosAccesibles.size(); ++i) {
            System.out.print(nodosAccesibles.get(i) + " ");
        }
    }
}
