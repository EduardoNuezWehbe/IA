package com.company;

import jdk.internal.util.xml.impl.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Vector;

public class Datos {


    int vertices;
    Vector<Nodo> direccion;

    public Datos (Vector<Integer> informacion) {
        vertices = informacion.get(0);
        informacion.removeElementAt(0);
        direccion = new Vector<Nodo>();
        for(int i = 0; i < vertices; ++i) {
            direccion.add(new Nodo(vertices));
        }
        construirDirecciones(informacion);
    }
    public void construirDirecciones (Vector<Integer> informacion) {
        int indiceCostes = 0;
        for(int i = 0; i < vertices; ++i) {
            for(int j = i+1; j < vertices; ++j) {
                direccion.get(i).nodoSiguiente.set(j,informacion.get(indiceCostes));
                direccion.get(j).nodoSiguiente.set(i,informacion.get(indiceCostes++));
            }
        }
    }
    public void write () {
        System.out.println("Numero de vertices: " + vertices);
        for(int i = 0; i < vertices; ++i) {
            System.out.print("Posicion " + i + " Destinos: ");
            direccion.get(i).write();
        }
    }
}


