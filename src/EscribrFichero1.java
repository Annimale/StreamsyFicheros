
import java.io.FileWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class EscribrFichero1 {
    public static void main(String[] args) {
        String nombreFichero="prueba.txt";
        FileWriter fw=null;
        try{
            fw=new FileWriter (nombreFichero,true);
            for (char c= 'A'; c<='Z'; c++) {
                fw.write(c+" ");
                
            }
            
        }catch (Exception e){
            System.out.println("Error de escritura del fichero");
            System.out.println(e.getMessage());
        }finally{
            
        }try{
            if (fw!=null) {
                fw.close();
                
            
        }
        }catch (Exception e){
            System.out.println("Error al cerrar el fichero");
            System.out.println(e.toString());
        }
    }
    
}
