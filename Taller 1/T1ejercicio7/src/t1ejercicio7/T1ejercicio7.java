/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1ejercicio7;
import java.util.Scanner;

/**
 *
 * @author ADSI
 */
public class T1ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cine= new Scanner(System.in);
        
        int a,b,c=0,d=0;
        
        
        
        for(b=1; b<=15; b++){
            System.out.println("ingrese la edad: ");
        a=cine.nextInt();
        if(a<18){
            c=c+1;
            
        }
        else{
         d=d+1;   
        }
        }
        
        
        System.out.println("\n" +c+": Personas son menores de edad");
         System.out.println("\n" +d+": Personas son mayores de edad");
        // TODO code application logic here
    
    }
}
