package edd.listadoble;

/**
 *
 * @author Arman
 */
public class ListaDoblementeLigada<T> {

    NodoDoble<T> head;
    NodoDoble<T> fin;
    int tamaño;

    public ListaDoblementeLigada() {
        this.head = null;
        this.fin = null;
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

            aux = null;
            nuevo = null;

        }
    }

    public void ELiminarInicio() {

        NodoDoble aux = head;

        if (this.vacia()) {
            head=aux;
        } else {
            head = aux.getSiguiente();
            //aux=null;
        }

    }

    public void ELiminarfinal() {

        NodoDoble aux = head;

        if (this.vacia()) {
            head=aux;
        } else {
            while(aux.getSiguiente()!=null) {
                aux=aux.getSiguiente();
            }
            aux = null;
        }
        
    }

    public void EliminarPorPosicion(int lugar) {

        NodoDoble aux = this.head;
        NodoDoble anterior = null;
        lugar = 1;
        /*for (int contador = 1; contador <= posicion - 1; contador++) {
            aux = aux.getSiguiente();
        }
        
        aux.setSiguiente(aux.getSiguiente().getSiguiente());*/
        // aux.setAnterior(aux.getAnterior().getAnterior());

        if (this.vacia()) {
            aux = null;
            System.out.println("llena la lista primero ");
        } else {
            if (lugar > 1) {
                System.out.println("No existe esa posicion solicitada");
            } else {
                for (int contador = 1; contador <= lugar - 1; contador++) {
                    aux = aux.getSiguiente();
                }
            }

        }
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        aux.setAnterior(aux.getAnterior());
        /*while (aux != null) {
                if(aux.getDato()== posicion) {
                    
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
        }*/

    }

    public void agregarDespuesDe(T valor, int posicion) {
        NodoDoble nuevo = new NodoDoble(valor);
        NodoDoble aux = this.head;
        for (int contador = 1; contador <= posicion - 1; contador++) {
            aux = aux.getSiguiente();
        }
        nuevo.setSiguiente(aux.getSiguiente());
        aux.setSiguiente(nuevo);
        aux.setAnterior(aux.getAnterior());

    }

    public void EliminarLista() {
        this.head = null;
        tamaño = 0;
    }

    public int BuscarElemento(T valor) {

        NodoDoble aux = head;
        int c = 1;
        if (this.vacia()) {
            head = null;
        } else {
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
                c++;
            }
        }

        /*if (head != null) {
            NodoDoble aux = head;
            int c = 0;
            while (aux != null) {
                if (aux.getDato() != valor) {
                    c++;
                    aux = aux.getSiguiente();
                }

            }
        }*/
        return c;
    }

    public void actualizar(T valor, T actualizar) {
        NodoDoble aux = head;
        while (aux.getDato() != null) {
            aux = aux.getSiguiente();
        }
        aux.setDato(actualizar);
    }

    public void Transversal() {
        NodoDoble nodoActualizado = head;
        while (nodoActualizado != null) {
            System.out.println(nodoActualizado.getDato());
            nodoActualizado = nodoActualizado.getSiguiente();
        }

        System.out.println("");
    }
}
