/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.cola;

/**
 *
 * @author Arman
 */
public class NodoCola {
    private int dato;
    private NodoCola siguiente;

    public NodoCola(int dato) {
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "NodoCola{" + "dato=" + dato + '}';
    }

    

    
    
    
    
    
    
}
  

