/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package edd.laberinto;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

/**
 *
 * @author Arman
 */
public class Laberinto {

    public static void main(String[] args) {
        File archivo = new File("C:/Users/Arman/OneDrive/Escritorio/Nivel.dat");
        
        Laberinto laberinto = new Laberinto(tablero);

    }
    

    /*
    Intente con estos constructores pero no me salia
    
    Ya que esta se puede hacer en un arreglo pero sin leer el archivo directamente y lo tengo que poner manualmente
    
    public LaberintoPrueba(int x, int y, boolean fin, boolean camino) {
        TableroLaberinto(x, y, fin, camino);
    }

    
    Le di las coordenadas que debe tomar el laberinto
    public void TableroLaberinto(int x, int y, boolean fin, boolean camino) {
        laberinto[x][y] = 'E';
        resuelve(x, y);

    }
    
    
    como debe  resolverlo con las coordenadas
    public void resuelve(int x, int y) {
        if (camino(x, y)) {
            laberinto[x][y] = 'S';
        }
    }
    
    
    Por donde debe entrar
    public boolean camino(int x, int y) {
        if (laberinto[x][y] == 'E') {
            return true;
        }
    
    si no hay camino y ademnas hay pared se cancela
        if (laberinto[x][y] == '1' || laberinto[x][y] == '0') {
            return false;
        }

    }*/
    
    //aqui hay un array dentro de un array del tablero 
    private Tablero[][] tablero;
    private ArrayList<ArrayList<Tablero>> caminos;

    public Laberinto(Tablero[][] tablero) {
        this.tablero = tablero;
        caminos = new ArrayList<>();
    }

    public boolean izquierda(Tablero actual, Tablero destino) {
        if (destino != null && destino.isEstado()) {
            return actual.izquierda();
        }
        return false;
    }

    public boolean arriba(Tablero actual, Tablero destino) {
        if (destino != null && destino.isEstado()) {
            return actual.arriba();

        }
        return false;
    }

    public boolean derecha(Tablero actual, Tablero destino) {
        if (destino != null && destino.isEstado()) {
            return actual.derecha();
        }
        return false;
    }

    public boolean abajo(Tablero actual, Tablero destino) {
        if (destino != null && destino.isEstado()) {
            return actual.abajo();
        }
        return false;
    }
    
    public boolean limite(int x, int y) {
        return(x>=0 && x<tablero.length) && (y>=0 && tablero[0].length);
    }
    
    public Tablero getTablero(int x, int y) {
        if(limite(x,y)) {
            return tablero[x][y];
        }
        return null;
    }
    
    
    
    
}
