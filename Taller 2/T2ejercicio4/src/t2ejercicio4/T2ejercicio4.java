/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2ejercicio4;


import java.util.Scanner;
/**
 *
 * @author ADSI
 */
public class T2ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner nombre = new Scanner(System.in);
        
        String tex;
        
        System.out.print("ingrese su nombre :");
        
        tex=nombre.nextLine();
        int num=tex.length();
        
        if(num%2==0){
         System.out.print( tex+ " Tu nombre tiene " +num+ " caracteres y la cantidad es par");
         
        }
        else {
          System.out.print(tex+" Tu nombre tiene " +num+ " caracteres y la cantidad es impar");  
        }
        
        
        // TODO code application logic here
    }

    
    
}
