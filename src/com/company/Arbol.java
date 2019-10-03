package com.company;

import java.util.Vector;

public class Arbol {

    private int nodoInicial;
    private int nodoFinal;
    private int nodoPadre;

    public Arbol(int inicio, int fin) {
        setNodoInicial(0);
        setNodoFinal(1);
    }
    public void crearArbol (Vector<Nodo> informacionArbol) {
        Vector<Integer> nodosAccesibles;
        nodosAccesibles = informacionArbol.get(getNodoInicial()).nodosPosibles();
        System.out.print("Nodos accesibles por el nodo inicial " + getNodoInicial() + ":" );
        for (Integer nodoAccesible : nodosAccesibles) {
            System.out.print(nodoAccesible + " ");
        }
        System.out.println("Comenzamos a trabajar con el arbol");
        if(getNodoInicial() == getNodoFinal()) {
            System.out.println("Hemos llegado al destino y tenemos un coste 0");
            return;
        } else {
            int costes = 0;
            int nodoActual = getNodoInicial();
            for (Integer nodoAccesible : nodosAccesibles) {
                if(nodoAccesible == getNodoFinal()) {
                    costes += informacionArbol.get(nodoActual).getCostesNodo(nodoAccesible);
                }
            }
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
    public int getNodoPadre() {
        return nodoPadre;
    }

    public void setNodoPadre(int nodoPadre) {
        this.nodoPadre = nodoPadre;
    }
}
