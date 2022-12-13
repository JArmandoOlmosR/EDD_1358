/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package edd.ejlinkedlist;

/**
 *
 * @author Arman
 */
import java.util.LinkedList;

public class EjLinkedList {

    public static void main(String[] args) {

        LinkedList lista_Super = new LinkedList();

        //Añadimos
        lista_Super.add("Arroz");
        lista_Super.add("Jitomate");
        lista_Super.add("Carne");
        lista_Super.add("Limon");
        lista_Super.add("Zanahoria");
        //Tambien se puede poner el indice donde queramos que esten
        lista_Super.add(0, "Agua Natural");
        lista_Super.add(6, "Helado");

        //recorrer la LinkedList
        for (int i = 0; i < lista_Super.size(); i++) {//se utiliza size para tener el tamanño de la lista
            System.out.println("->" + lista_Super.get(i));

        }

        System.out.println("--------------");

        //Eliminar por el nombre
        lista_Super.remove("Zanahoria");
        lista_Super.remove("Jitomate");

        for (int i = 0; i < lista_Super.size(); i++) {
            System.out.println("->" + lista_Super.get(i));

        }

        System.out.println("-----------");

        //obtener el primero y el ultimo
        System.out.println("El primero es: " + lista_Super.getFirst().toString()); //getFirst trae el primero de la lista
        System.out.println("El ultimo es: " + lista_Super.getLast().toString()); //getLast trae el ultimo de la lista

        System.out.println("-----------");

        //Esta vacia?
        System.out.println("¿Esta vacia? -> " + lista_Super.isEmpty()); //comprueba si esta vacia con un "True" o "False"

    }
}
