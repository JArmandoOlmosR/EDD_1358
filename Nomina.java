package edd.empresa;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Arman
 */
public class Nomina {

    public Nomina() {
        
        
        
        //Como no leyó el archivo por los problemas que tuve no pude comprobar lo demas pero lo mas seguro es que hubiera funcionado
        
        
        try {
            BufferedReader br = new BufferedReader(new FileReader("junio.dat"));
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                ArrayList<String> trabajador = new ArrayList<>();

            }
        }catch (FileNotFoundException ex) {
            System.err.println(ex.getMessage());
        }catch (IOException ex) {
            System.err.println(ex.getMessage());
        }
//Aqui intente leer el archivo pero no funciono

public void LeerArchivo(String nombreArchivo) {

        File archivo;
        FileReader fr;
        BufferedReader br;

        try {
            archivo = new File(nombreArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {

                System.out.println(linea);

            }

            br.close();
            fr.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Hay algo mal " + e);
        }

    }
            
         
        
    }
}
