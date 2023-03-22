
import java.io.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class LeerFichero1 {
    
    public static void main(String[] args) throws IOException {
         String nombreFichero="nuevo.txt";
    
    FileReader fr=null;
    try{
    fr= new FileReader (nombreFichero); //FileReader fr =new FileReader ("prueba.txt")  
    int caract =fr.read();
    while (caract!=-1){
        System.out.print((char) caract);
        caract=fr.read();
    }
        
    }catch (FileNotFoundException e){
        System.out.println("Error: Fichero no encotrado");
    }
   
    }
    
}

