/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package edd.ejstack;

/**
 *
 * @author Arman
 */
import java.util.Stack;

public class EjStack {

    public static void main(String[] args) {

        Stack pila = new Stack();

        //push sirve para ingresar datos a la pila
        pila.push("Enchiladas");
        pila.push("Las");
        pila.push("y");
        pila.push("Helado");
        pila.push("El");
        pila.push("Me gusta");

        //recorrer la pila
        while(!pila.empty()) {
            System.out.println(pila.pop());
            //pop sirve para mostrar lo elementos de la pipla 
        }
        System.out.println("------------");

        //Esta vacia?
        System.out.println("¿Esta vacia? -> " + pila.isEmpty());

        System.out.println("------------");

        if (pila.empty()) {
            System.out.println("Esta vacia");
        } else {
            System.out.println("Esta llena");
        }

        System.out.println("-------------");
        //obtener el ultimo elemento ingresado

        //Peek devuelve el elemento que esta en la cabeza de la pila
        //System.out.println("El ultimo elemento es: " + pila.peek());

        //solo me funciono si comentaba el while porque el "pop" elimina los metodos de la pila
    }
}
