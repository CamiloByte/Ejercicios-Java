/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo;

import java.util.Scanner;
/**
 *
 * @author Sena
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int edad;
        String nombre;
        float estatura;
        
        System.out.print("ingrese su nombre: ");
        nombre = teclado.next();
        System.out.print("ingrese su edad: ");
        edad = teclado.nextInt();
        System.out.print("ingrese su estatura: ");
        estatura = teclado.nextFloat();
        
        System.out.print("hola "+nombre+" tienes "+edad+" años y mides "+estatura+" metros");
        // TODO code application logic here
    }
    
}
