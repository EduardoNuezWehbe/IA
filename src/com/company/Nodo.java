package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Nodo {


    Vector<Integer> nodoSiguiente;
    public Nodo (int size) {

        nodoSiguiente = new Vector<> ();
        nodoSiguiente.setSize(size);
    }
    public void setDatos (int indice, int coste,int size) {
        nodoSiguiente.set(indice,coste);
    }
    public void write () {
        for(int i = 0; i < nodoSiguiente.size(); ++i) {
            System.out.print(i + " coste " + nodoSiguiente.get(i) + " | ");
        }
        System.out.println();
        Scanner sc = new Scanner(System.in);

    }
}
