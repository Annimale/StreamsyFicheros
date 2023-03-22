
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ivamar
 */
public class EscribirFicheroCadenasDeCaracteres {
    public static void main(String[] args) {
        
        String nombreFichero = "nuevo.txt";
    String texto = "David hace mec mec y sniff sniff";
    BufferedWriter bw = null;
   
    try{
        bw = new BufferedWriter(new FileWriter(nombreFichero, true));
        bw.write(texto);
        bw.newLine();
    } catch (IOException e){
        System.out.println("Error de lectora del fichero");
        System.out.println(e.getMessage());
    } finally {
        try{
            if (bw != null) {
                bw.close();
            }
        } catch (IOException e) {
            System.out.println("Error al cerrar el fichero");
            System.out.println(e.getMessage());
        }
    }
    }
}