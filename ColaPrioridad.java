/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package edd.colaprioridad;

/**
 *
 * @author Arman
 */



//Me di cuenta que escribi mal "Prioridad" asi que por eso no me daban algunas cosas


public class ColaPrioridad extends Personas {

    
    private Personas raiz;
    private Personas fin;

    public ColaPrioridad() {
        this.raiz = null;

    }

    public boolean estaVacia() {
        boolean Cola = false;
        if (raiz == null & fin == null) {
            Cola = true;
        } else {
            Cola = false;
        }
        return Cola;
    }

    public int length() {
        //podemos agregar esto o solo podemos dejar el return para no hacer mas largo el codigo

        int elementos = 0;
        /*NodoCola Nc=this.raiz;
        while(Nc!=null) {
            elementos++;
            Nc=Nc.getSiguiente();
        }*/
        return elementos;

    }

    //Trate de copiar el codigo del anterior pero me daba errores, incluso ahorita
    //me marca erroes pero no me dice donde y ya me atore
    
    public void enqueue(int prioridad) {
        Personas ps = new Personas(prioridad);
        ps.setSigueinte(raiz);
        raiz = ps;

        /*NodoCola eq=new NodoCola(dato);
        eq.setSiguiente(null);
        if(raiz==null & fin==null) {
            raiz=eq;
            fin=eq;
        }
        fin.setSiguiente(eq);
        fin=fin.getSiguiente();*/
    }

    public int dequeue() {

        /*int dato=raiz.getDato();
        raiz=raiz.getSiguiente();
        return dato;*/
        Personas inicio = raiz;
        raiz = raiz.getSigueinte();
        inicio.setSigueinte(null);
        return inicio.getProridad();

    }

    public void imprimir() {
        Personas inicio = raiz;
        while (inicio != null) {
            System.out.println(inicio.getProridad());
            inicio = inicio.getSigueinte();
        }
    }
    
    /*Me marca que tengo error en alguna parte pero yo lo veo bien 
    asi que o se que pasa
    */
}
