package edd.empresa;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Arman
 */
public class Empresa {

    public static void main(String[] args) {
        //Trabajador trabajor = new Trabajador(3, "JOSE", "OLMOS", "RESENDIZ", 5, 15000, 2003);
        //Empresa em = new Empresa();
        ArrayList<Trabajador> ar = new ArrayList<Trabajador>();
        Trabajador t;
        String[] datos;

        //Use hasNextLine para comprobar o que compruebe si hay o no otra linea de texto 
        try ( Scanner archivo = new Scanner(new File("./junio.dat"))) {
            while (archivo.hasNextLine()) {
                datos = archivo.nextLine().split(",");

                //Aqui me dice que no se puede convertir de String a int, ya intente por varios metodos y no se corrige
                t = new Trabajador(datos[0], datos[1], datos[2], datos[3], datos[4], datos[5], datos[6]);
                ar.add(t);
            }

        } catch (Exception e) {
            System.out.println("Error");
        }

        for (Trabajador trabajador : ar) {
            System.out.println(trabajador);
        }

    }
    
}
