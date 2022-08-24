/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package redes;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Arman
 */
public class RedesSociales {

    public static void main(String[] args) {
        //utilizamos un filereader y un bufferedreader para leer el archivo y los caracteres
        /*BufferedReader archivo=new BufferedReader(new FileReader("C:/Users/Arman/OneDrive/Escritorio"));
        String linea=null;
        ArrayList lista=new ArrayList();*/
        
        /*igualmente podemos poner
        FileReader a=new FileReader("C:/Users/Arman/OneDrive/Escritorio");
        String cadena;
        BufferedReader bf=new BufferedReader(a);*/
        
        //utilice el path para buscar el documento pero no funciono
        /*String path = "C:/Users/Arman/OneDrive/Escritorio";
        ArrayList<String[]> lista=new ArrayList<>();
        String datos=lista.get(1)[3];*/
        Scanner ingreso=new Scanner (System.in);
        
        int resta;
        int numero1;
        int numero2;
        System.out.println("Se mostrara la diferencia de seguidores entre dos meses; \n");
        System.out.println("Procura poner el mes con el numero mas alto primero\n ");
        System.out.println("Ingrese los seguidores del primer mes: \n");
        numero1=ingreso.nextInt();
        System.out.println("Ingrese los seguidores del segundo mes: \n");
        numero2=ingreso.nextInt();
        resta=numero1-numero2;
        System.out.println("La diferencia de seguidores entre los 2 meses fue de: "+resta);
        
        //Lo hice asi porque nisiquiera me leia el archivo de cualquier forma que le intentara
        
    }
}
