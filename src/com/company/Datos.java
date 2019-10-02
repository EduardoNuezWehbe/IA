package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Datos {


    int vertices;
    Vector<Nodo> direccion;
    Arbol arbol;

    public Datos (Vector<Integer> informacion) {
        vertices = informacion.get(0);
        informacion.removeElementAt(0);
        direccion = new Vector<Nodo>();
        for(int i = 0; i < vertices; ++i) {
            direccion.add(new Nodo(vertices));
        }
        construirDirecciones(informacion);
        busquedaNodo();

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
        arbol.write();
    }
    public void busquedaNodo () {
        /*System.out.print("Introduzca el nodo inicial: ");
        Scanner sc = new Scanner(System.in);
        int inicio = sc.nextInt();
        System.out.print("Introduzca el nodo final: ");
        int fin = sc.nextInt();*/
        int inicio = 0;
        int fin = 4;
        arbol = new Arbol (inicio,fin);
    }
    public void crearArbol () {
        arbol.crearArbol(direccion);
    }

}


