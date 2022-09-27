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
        lista.agregarAlInicio(20);
        lista.AgregarAlFinal(2);
        lista.AgregarAlFinal(100);
        lista.AgregarAlFinal(500);
        lista.Transversal();
        System.out.println("---------");
        lista.agregarDespuesDe(250, 2);
        lista.Transversal();
        System.out.println("---------");
        lista.ELiminarInicio();
        lista.Transversal();
        System.out.println("---------");
        lista.BuscarElemento(3);
        lista.Transversal();
        System.out.println("---------");
        lista.agregarAlInicio(450);
        lista.ELiminarfinal();
        lista.Transversal();
        System.out.println("---------");
        lista.EliminarPorPosicion(3);
        lista.Transversal();
        System.out.println("---------");
    }
}
