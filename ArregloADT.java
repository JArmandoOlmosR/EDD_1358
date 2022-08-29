package com.mycompany.arregloadt;

import java.util.ArrayList;

public class ArregloADT {

    private static void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private int tamanio;
    private ArrayList<Object> datos;
    private int elemento;
    private int longitud;
    private int limpiar;
    private ArregloADT[] arreglo;

    public ArregloADT(int tamanio) {

        this.tamanio = tamanio;
        datos = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            datos.add(i);
        }
    }

    public int getLongitud() {
        return longitud;
    }

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int indice, int elemento) {
        this.elemento = elemento;
    }

    public void limpiar() {
        ArregloADT.clear(null);
    }

    @Override
    public String toString() {
        return "ArregloADT{" + "tamanio=" + tamanio + ", elemento=" + elemento + ", longitud=" + longitud + ", limpiar=" + limpiar + '}';
    }

}
