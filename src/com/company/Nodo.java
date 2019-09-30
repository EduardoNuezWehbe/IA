package com.company;

import java.util.Vector;

public class Nodo {


    Vector<Integer> nodoSiguiente;
    int coste;
    public Nodo () {

        nodoSiguiente = new Vector<> ();
        coste = 0;
    }
    public void setDatos (int indice, int coste,int size) {
        nodoSiguiente.setSize(size);
        nodoSiguiente.set(indice,coste);
    }
}
