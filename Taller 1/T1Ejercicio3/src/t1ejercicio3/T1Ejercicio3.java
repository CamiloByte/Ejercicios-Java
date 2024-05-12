/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t1ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Sena
 */
public class T1Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner cap = new Scanner (System.in);
        
        int a,b,c;
        
        System.out.print("ingrese los numeros para la suma: " );
        a=cap.nextInt();
        b=cap.nextInt();
        c=a+b;
        
        System.out.println("la suma es :"+c);
        
        System.out.println("ingrese los numeros para la resta: " );
        a=cap.nextInt();
        b=cap.nextInt();
        c=a-b;
        
        System.out.println("la resta es :"+c);
        
        System.out.println("ingrese los numeros para la multiplicación: " );
        a=cap.nextInt();
        b=cap.nextInt();
        c=a*b;
        
        System.out.println("la multiplicación es :"+c);
        
        System.out.println("ingrese los numeros para la divición: " );
        a=cap.nextInt();
        b=cap.nextInt();
        c=a/b;
        
        System.out.println("la divición es :"+c);
        
        
        
        
        
        
        
         
         
        
        // TODO code application logic here
    }
    
}
