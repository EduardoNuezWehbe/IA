package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Nodo {

    private Vector<Integer> nodoSiguiente;

    public Nodo (int size) {
        nodoSiguiente = new Vector<> ();
        nodoSiguiente.setSize(size);
    }
    public void setDatos (int indice, int coste) {
        nodoSiguiente.set(indice,coste);
    }
    public void write () {
        for(int i = 0; i < nodoSiguiente.size(); ++i) {
            if(nodoSiguiente.get(i) == null) {
                nodoSiguiente.set(i,-1);
                System.out.print((1+i) + " --> " + nodoSiguiente.get(i) + " | ");
            }else {
                System.out.print((1+i) + " --> " + nodoSiguiente.get(i) + " | ");
            }
        }
        System.out.println();
    }
    public Vector<Integer> nodosPosibles () {
        Vector<Integer> nodosAccesibles = new Vector<> ();
        for(int i = 0; i < nodoSiguiente.size(); ++i) {
            if(nodoSiguiente.get(i) != -1) {
                nodosAccesibles.add(i);
            }
        }
        return nodosAccesibles;
    }
    public Vector<Integer> getNodoSiguiente() {
        return nodoSiguiente;
    }

    public void setNodoSiguiente(Vector<Integer> nodoSiguiente) {
        this.nodoSiguiente = nodoSiguiente;
    }
}
