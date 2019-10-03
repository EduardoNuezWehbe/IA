package com.company;

import org.jetbrains.annotations.NotNull;

import java.util.Vector;
import java.util.concurrent.atomic.AtomicInteger;

public class Arbol {

    private int nodoInicial;
    private int nodoFinal;
    private int nodoPadre;

    public Arbol(int inicio, int fin) {
        setNodoInicial(0);
        setNodoFinal(0);
    }

    public void crearArbol(Vector<Nodo> informacionArbol) {
        Vector<Integer> nodosAccesibles;
        int nodoPadre;
        nodosAccesibles = informacionArbol.get(getNodoInicial()).nodosPosibles();
        AtomicInteger costes = new AtomicInteger(0);
        Boolean encontrado = false;


        System.out.print("Nodos accesibles por el nodo inicial " + getNodoInicial() + ":");

        impresionAccesibles(nodosAccesibles);
        if (destinoFinal()) return;

        int nodoActual = getNodoInicial();
        encontrado = finalEncontrado(informacionArbol, nodosAccesibles, costes, nodoActual);
        if(encontrado == true) {
            System.out.println("Hemos encontrado el nodo objetivo el coste ha sido: " + costes + "y hemos llegado a traves del nodo: " );
        }
    }

    private void impresionAccesibles(Vector<Integer> nodosAccesibles) {
        for (Integer nodoAccesible : nodosAccesibles) {
            System.out.print(nodoAccesible + " ");
        }
        System.out.println("Comenzamos a trabajar con el arbol");
    }

    private boolean destinoFinal() {
        if (getNodoInicial() == getNodoFinal()) {
            System.out.println("Hemos llegado al destino y tenemos un coste 0");
            return true;
        }
        return false;
    }

    private Boolean finalEncontrado(Vector<Nodo> informacionArbol, Vector<Integer> nodosAccesibles, AtomicInteger costes, int nodoActual) {
        for (Integer nodoAccesible : nodosAccesibles) {
            if (nodoAccesible == getNodoFinal()) {
                costes.getAndAdd(informacionArbol.get(nodoActual).getCostesNodo(nodoAccesible));
                return true;
            }
        }
        return false;
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
