/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2ejercicio5;
import java.util.Scanner;
/**
 *
 * @author arand
 */
public class T2ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner votos = new Scanner(System.in);
         
         int a,b,c;
         
         System.out.print(" ingrese los votos del partido A: ");
         a=votos.nextInt();
         System.out.print("\n ingrese los votos del partido B: ");
         b=votos.nextInt();
         System.out.print("\n ingrese los votos del partido C: ");
         c=votos.nextInt();
         
         if(a>b && a>c && b>c){ 
             System.out.print("\n partido de la A " +a);
             System.out.print("\n partido de la B " +b);
             System.out.println("\n partido de la C " +c);
             
         }
         if(a>b && a>c && c>b){ 
            System.out.print("\n partido de la A " +a);
             System.out.print("\n partido de la C " +c);
             System.out.println("\n partido de la B " +b);  
             
         }
         if(b>a && b>c && a>c){
             System.out.print("\n partido de la B " +b);
             System.out.print("\n partido de la A " +a);
             System.out.println("\n partido de la C " +c);
             
         } 
         if(b>a && b>c && c>a){
             
             System.out.print("\n partido de la B " +b);
             System.out.print("\n partido de la C " +a);
             System.out.println("\n partido de la A " +c);
         }
         
         if(c>a && c>b && b>a){
             System.out.print("\n partido de la C " +c);
             System.out.print("\n partido de la B " +b);
             System.out.println("\n partido de la A " +a);
         }
           if(c>a && c>b && a>b){
               System.out.print("\n partido de la C " +c);
             System.out.print("\n partido de la A " +a);
             System.out.println("\n partido de la B " +b); 
           }
         
         
         
         
        
        // TODO code application logic here
    }

   
    
}
