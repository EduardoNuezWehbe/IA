package com.company;

import java.util.Vector;

public class Arbol {

    private int nodoInicial;
    private int nodoFinal;

    public Arbol(int inicio, int fin) {
        nodoInicial = inicio;
        nodoFinal = fin;
    }
    public void crearArbol (Vector<Nodo> informacionArbol) {
        Vector<Integer> nodosAccesibles = new Vector<>();
        nodosAccesibles = informacionArbol.get(nodoInicial).nodosPosibles();
        System.out.print("Nodos accesibles por el nodo inicial " + nodoInicial + ":" );
        for(int i = 0; i < nodosAccesibles.size(); ++i) {
            System.out.print(nodosAccesibles.get(i) + " ");
        }
    }
    public int getNodoInicial() {
        return nodoInicial;
    }

    public int getNodoFinal() {
        return nodoFinal;
    }

    public void setNodoInicial(int nodoInicial) {
        this.nodoInicial = nodoInicial;
    }

    public void setNodoFinal(int nodoFinal) {
        this.nodoFinal = nodoFinal;
    }
}
