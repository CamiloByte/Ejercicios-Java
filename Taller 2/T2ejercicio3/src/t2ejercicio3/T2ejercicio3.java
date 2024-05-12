/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2ejercicio3;
import java.util.Scanner;
/**
 *
 * @author ADSI
 */
public class T2ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        
        String texto;
        
        System.out.print("ingrese su nombre: ");
        texto=nombre.nextLine();
        int numero=texto.length();
         System.out.println("su nombre tiene "+numero+" caracteres");
        
        
        
        // TODO code application logic here
    }
    
}
