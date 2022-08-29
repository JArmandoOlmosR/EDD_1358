package com.mycompany.arregloadt;

public class Main extends ArregloADT {

    public static void main(String[] args) {
        ArregloADT[] lista = new ArregloADT[5];
        for (int i = 0; i < lista.length; i++) {
            lista[i] = new ArregloADT(int tamanio);
            //con length podemos saber el tamaño del arreglo
        }
        System.out.println(lista.getLongitud());
        lista.setElemento(0,4);
        lista.setElemento(1,34);
        lista.setElemento(4,10);
        System.out.println(lista.getElemento(0));
        System.out.println(lista.getElemento(1));
        System.out.println(lista.getElemento(4));
        lista.clear(null);
        
    }
}
