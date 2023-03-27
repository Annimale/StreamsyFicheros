
import java.io.File;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class obtenerListaDirectoriosArchivos {
    public static void main(String[] args) {
                
        
        File dirActual=new File(".");
        String []lista= dirActual.list();
        
        for (int i = 0; i < lista.length; i++) {
            File f= new File (lista[i]);
            System.out.println("Nombre:  "+f.getName());
            System.out.println("Tamaño:  "+f.length());
            
            if (f.isDirectory()) {
                System.out.println("Es un directorio");
            }else{
                System.out.println("Es un archivo");
                
            }
            System.out.println("\n");
        }
                System.out.println("--------------");
                
    
    File prueba= new File ("prueba.txt");
    if (prueba.exists()) {
            System.out.println("El archivo prueba.txt existe");
    }else{
            System.out.println("El archivo prueba.txt NO existe");
}
   
}
    
}
