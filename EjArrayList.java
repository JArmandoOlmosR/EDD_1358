/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package edd.ejarraylist;

/**
 *
 * @author Arman
 */
import java.util.ArrayList;

public class EjArrayList {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<String>();

        //Añadimos 
        lista.add("Juan");
        lista.add("Tania");
        lista.add("Ximena");
        lista.add("Angel");

        //Recorrer la lista
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("->" + lista.get(i));

        }

        System.out.println("-----------------");

        //eliminar
        lista.remove(3);
        lista.remove(1);

        for (int i = 0; i < lista.size(); i++) {
            System.out.println("->" + lista.get(i));

        }

        System.out.println("----------");
        //Esta vacia?

        System.out.println("¿Esta vacia? -> " + lista.isEmpty());
    }
}
