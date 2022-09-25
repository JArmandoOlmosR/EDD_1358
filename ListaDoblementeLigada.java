/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.listadoble;

/**
 *
 * @author Arman
 */
public class ListaDoblementeLigada<T> {

    NodoDoble<T> head;
    int tamaño;

    public ListaDoblementeLigada() {
        this.head = null;
        this.tamaño = 0;
    }

    public boolean vacia() {
        return this.head == null;

    }

    public int getTamaño() {
        return tamaño;

    }

    public void agregarAlInicio(T valor) {
        NodoDoble nuevo = new NodoDoble(valor);
        if (this.vacia()) {
            this.head = nuevo;
        } else {
            nuevo.setSiguiente(this.head);
            head.setAnterior(nuevo);
            this.head = nuevo;

        }

    }

    public void AgregarAlFinal(T valor) {
        NodoDoble nuevo = new NodoDoble(valor);
        if (this.vacia()) {
            this.head = nuevo;
        } else {
            NodoDoble aux = head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
            nuevo.setAnterior(aux);
            
            aux=null;
            nuevo=null;
            
        }
    }
    public void ELiminarInicio() {
        
        NodoDoble aux = head;
        this.head.getDato();
        aux=head.getSiguiente();
        if(head!=null) {
            head.setAnterior(null);
        }else {
            aux=null;
        }
        
        
    }
     /*public void ELiminarfinal() {
        
        NodoDoble aux = head;
        this.aux.getDato();
        aux=head.getAnterior();
        if(aux==null) {
            aux.setAnterior(null);
        }else {
            aux=null;
        }
     }*/

    public void EliminarPorPosicion(T valor) {
        
       /* NodoDoble aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++) {
            aux = aux.getSiguiente();
        }
        
        aux.setSiguiente(aux.getSiguiente().getSiguiente());*/
       // aux.setAnterior(aux.getAnterior().getAnterior());
        
        if (head != null) {
            NodoDoble aux = this.head;
            NodoDoble anterior = null;
            while (aux != null) {
                if(aux.getDato()== valor) {
                    
                }else {
                    anterior=aux;
                    aux=aux.getSiguiente();
                }
                if(anterior==null) {
                    head=this.head.getSiguiente();
                    aux.setSiguiente(null);
                    aux=head;
                }else {
                    anterior.setSiguiente(aux.getSiguiente());
                    aux.setSiguiente(null);
                    aux=anterior.getSiguiente();
                }
            }
        }

    }
    
    public void agregarDespuesDe(T valor, int posicion){
        NodoDoble nuevo = new NodoDoble(valor);
        NodoDoble aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++) {
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());
        aux.setSiguiente(nuevo);
        
    }

    public void EliminarLista() {
        this.head = null;
        tamaño = 0;
    }

    public void BuscarElemento(T valor) {
        if(head!=null) {
            NodoDoble aux=head;
            int c=0;
            while(aux !=null) {
                if(aux.getDato()== valor) {
                    c++;
                    aux=aux.getSiguiente();
                }
                
            }
        }
    }

    public void Transversal() {
        NodoDoble aux = head;
        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
        
        System.out.println("");
    }
}
