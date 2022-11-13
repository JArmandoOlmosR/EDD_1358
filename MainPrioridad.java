/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.colaprioridad;

import java.util.PriorityQueue;

/**
 *
 * @author Arman
 */
public class MainPrioridad {

    public static void main(String[] args) {
        PriorityQueue<Personas> cola = new PriorityQueue<>();

        cola.add(new Personas("Maestre", 4));
        cola.add(new Personas("Niños", 2));
        cola.add(new Personas("Mecanico", 4));
        cola.add(new Personas("Hombres", 3));
        cola.add(new Personas("Vigia", 4));
        cola.add(new Personas("Capitan", 5));
        cola.add(new Personas("Timonel", 4));
        cola.add(new Personas("Mujeres", 3));
        cola.add(new Personas("3ra edad", 2));
        cola.add(new Personas("Niñas", 1));
    }

}
