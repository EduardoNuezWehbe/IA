package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Datos {

    private int vertices;
    private Vector<Nodo> direccion;
    private Arbol arbol;

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
                direccion.get(i).setDatos(j,informacion.get(indiceCostes));
                direccion.get(j).setDatos(i,informacion.get(indiceCostes++));
            }
        }
    }
    public void write () {
        System.out.println("Numero de vertices: " + vertices);
        for(int i = 0; i < vertices; ++i) {
            System.out.print("Posicion " + (i+1) + " Destinos: | ");
            direccion.get(i).write();
        }
    }
    public void crearArbol () {
        int inicio = 0;
        int fin = 4;
        arbol = new Arbol (inicio,fin);
        arbol.crearArbol(direccion);
    }
    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        this.vertices = vertices;
    }

    public Vector<Nodo> getDireccion() {
        return direccion;
    }

    public void setDireccion(Vector<Nodo> direccion) {
        this.direccion = direccion;
    }

    public Arbol getArbol() {
        return arbol;
    }

    public void setArbol(Arbol arbol) {
        this.arbol = arbol;
    }

}


