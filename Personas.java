/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.colaprioridad;

/**
 *
 * @author Arman
 */
public class Personas {

    private String nombre;
    private int proridad;
    private Personas sigueinte;

    public Personas(int prioridad) {
        this.proridad = prioridad;

    }

    public Personas(String nombre, int proridad) {
        this.nombre = nombre;
        this.proridad = proridad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getProridad() {
        return proridad;
    }

    public void setProridad(int proridad) {
        this.proridad = proridad;
    }

    public Personas getSigueinte() {
        return sigueinte;
    }

    public void setSigueinte(Personas sigueinte) {
        this.sigueinte = sigueinte;
    }

    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", proridad=" + proridad + ", sigueinte=" + sigueinte + '}';
    }
    
    public int compareTo(Personas o) {
        if(proridad < o.getProridad()) {
            return 1;
        }else if(proridad > o.getProridad()) {
            return -1;
        }else {
            return 0;
        }
    }
}
