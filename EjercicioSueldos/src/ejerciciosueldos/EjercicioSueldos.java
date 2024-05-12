/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosueldos;
import java.util.Scanner;

/**
 *
 * @author ADSI
 */
public class EjercicioSueldos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sueldos = new Scanner(System.in);
                
        float sue1,sue2,diferencia;
        
        System.out.print("ingrese el primer sueldo: ");
        sue1=sueldos.nextInt();
        System.out.print("ingrese el segundo sueldo: ");
        sue2=sueldos.nextInt();
        
        if (sue1 > sue2){
        System.out.print("el sueldo mayor es: "+sue1 );
        diferencia = sue1-sue2;
        System.out.print(" la difencia es de: "+diferencia );
        }
        else{ 
        System.out.print("el suedo mayor es:"+sue2 );}
        diferencia = sue2-sue1;
         System.out.print(" la difencia es de: "+diferencia );
        
       
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
