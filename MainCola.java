/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.cola;

/**
 *
 * @author Arman
 */
public class MainCola {
    public static void main(String[] args) {
        Cola cola=new Cola();
        cola.enqueue(1);
        cola.enqueue(50);
        cola.enqueue(100);
        cola.enqueue(150);
        cola.enqueue(200);
        cola.dequeue();
        cola.estaVacia();
        cola.length();
        System.out.println(cola);
        
    }
}
