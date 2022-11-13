/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edd.cola;

/**
 *
 * @author Arman
 */
public class Cola {

    private NodoCola raiz;
    private NodoCola fin;

    public Cola() {
        
        this.raiz = null;
        this.fin = null;
    }
    //segui como referencia las estructuras pasadas para apoyarme en este
    public boolean estaVacia() {
        //he puesto varios cosas y la que me funciona son algunas pero logro entnder lo que hacen
        
        
        boolean Cola=false;
        if(raiz==null & fin==null) {
            Cola=true;
        }else {
            Cola=false;
        }
        return Cola;
    }
    
    public int length() {
        //podemos agregar esto o solo podemos dejar el return para no hacer mas largo el codigo
      
        int elementos=0;
        /*NodoCola Nc=this.raiz;
        while(Nc!=null) {
            elementos++;
            Nc=Nc.getSiguiente();
        }*/
        return elementos;
        
        
    }
    //añadimos al final de la cola 
    public void enqueue(int dato) {
        
        NodoCola eq=new NodoCola(dato);
        eq.setSiguiente(null);
        if(raiz==null & fin==null) {
            raiz=eq;
            fin=eq;
        }
        fin.setSiguiente(eq);
        fin=fin.getSiguiente();
    }
    //obtenemos el dato de la cola
    public int dequeue() {
        int dato=raiz.getDato();
        raiz=raiz.getSiguiente();
        return dato;
    }

    
    //No lograba que me imprimiera la cola, busque como y me salio esto
    public String toString() {
        NodoCola Nc=this.raiz;
        String st="";
        while(Nc!=null) {
            st=st+Nc.toString();
            Nc=Nc.getSiguiente();
        }
        return st;
    }
    
    /*de esta manera entendi mas la cola, aunque vi que hay mas maneras de hacerlo
    de modo que me confundi un poco pero con mas repaso quedaria bien
    */
}
