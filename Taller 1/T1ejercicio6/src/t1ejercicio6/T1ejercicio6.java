/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1ejercicio6;
import java.util.*;
/**
 *
 * @author ADSI
 */
public class T1ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner parimpar=new Scanner(System.in);
                
        int a;
        
        System.out.print( "ingrese el numero para saber si es impar o par: ");
        a=parimpar.nextInt();
        
        if(a%2==0){
            System.out.println(+a+" el numero es par");
            
        }
        else {
            System.out.println(+a+" el numero es impar");
        }
        // TODO code application logic here
    }
    
}
