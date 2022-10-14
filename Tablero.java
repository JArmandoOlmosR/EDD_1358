/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edd.laberinto;

/**
 *
 * @author Arman
 */
public class Tablero {
    private int x;
    private int y;
    private boolean estado;
    private boolean fin;
    private boolean camino;

    public Tablero(int x, int y, boolean estado, boolean fin, boolean camino) {
        this.x = x;
        this.y = y;
        this.estado = false;
        this.fin = fin;
        this.camino = camino;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isFin() {
        return fin;
    }

    public void setFin(boolean fin) {
        this.fin = fin;
    }

    public boolean isCamino() {
        return camino;
    }

    public void setCamino(boolean camino) {
        this.camino = camino;
    }

    @Override
    public String toString() {
        return "Tablero{" + "x=" + x + ", y=" + y + '}';
    }

    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tablero other = (Tablero) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        if (this.estado != other.estado) {
            return false;
        }
        return this.camino == other.camino;
    }
    
    
    

    
    
    

   
    
   
}
