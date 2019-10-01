package com.company;

public class Arbol {
    int nodoInicial;
    int nodoFinal;

    public Arbol(int inicio, int fin) {
        nodoInicial = inicio;
        nodoFinal = fin;
    }
    public void write () {
        System.out.print("Nodo inicio: " + nodoInicial + "\nNodo final: " + nodoFinal);
    }
}
