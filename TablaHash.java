/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package edd.tablahash;

/**
 *
 * @author Arman
 */
public class TablaHash {

    private TablaHash[] lista = new TablaHash[10];

    public TablaHash() {
        for (int i = 0; i < lista.length; i++) {
            lista[i] = new TablaHash();
        }
    }

    private int funcionHash(int valor) { //aqui busque como darle el un valor a un caracter especifico
        return valor % 10;
    }

    public void meter(int key, int valor) {
        int key = funcionHash(valor);
        lista[key].meter(key, valor);

    }

    public void borrar(int key) {
        int key = funcionHash(valor);
        lista[key].borrar(key);
    }
    
    public void valorDe(int valor) {//recorremos la tabla
        for(int i=lista.length-1;i>=0;1--) {
            lista[i].valorDe(valor);
        }
        
        
    }
    
    public static void main(String[] args) {
        TablaHash tabla=new TablaHash();
        tabla.meter(10, 1);
        tabla.meter(200, 4);
        tabla.meter(15, 2);
        tabla.meter(30, 3);
    }
    
}


