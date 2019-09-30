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
        direccion = new Vector<> ();
        direccion.setSize(informacion.size());
    }
    public void construirDirecciones (Vector<Integer> informacion) {
        int indiceCostes = 0;
        Vector<Integer> datos = new Vector<>(informacion);
        for(int i = 1; i <= vertices; ++i) {
            for(int j = 1+i; j <= vertices; ++j) {
                Nodo nodo = new Nodo ();
                nodo.setDatos(j,informacion.get(indiceCostes),vertices);
                direccion.set(i,nodo);
            }
        }
    }

}
