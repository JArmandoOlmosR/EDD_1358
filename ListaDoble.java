/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package edd.listadoble;


/**
 *
 * @author Arman
 */
public class ListaDoble<T> {

    public static void main(String[] args) {
        
        ListaDoblementeLigada<Integer> lista=new ListaDoblementeLigada();
        lista.agregarAlInicio(10);
        lista.Transversal();
        lista.EliminarLista();
        lista.Transversal();
        lista.AgregarAlFinal(25);
        lista.AgregarAlFinal(125);
        lista.AgregarAlFinal(30);
        lista.agregarDespuesDe(25, 2);
        lista.Transversal();
        lista.BuscarElemento(3);
        lista.Transversal();
        lista.agregarAlInicio(21);
        lista.Transversal();
        lista.EliminarLista();
        lista.Transversal();
        lista.agregarAlInicio(1);
        lista.agregarAlInicio(2);
        lista.AgregarAlFinal(3);
        lista.AgregarAlFinal(4);
        lista.Transversal();
        lista.EliminarPorPosicion(3);
        lista.Transversal();
        lista.BuscarElemento(2);
        lista.Transversal();
        
        
    }
}
