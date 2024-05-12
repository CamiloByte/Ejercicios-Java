/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2ejercio1;
import java.util.Scanner;
/**
 *
 * @author ADSI
 */
public class T2ejercio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Dol= new Scanner(System.in);
        
        float taza,dolar,pesos;
        
        System.out.print("ingrese la taza de cambio de dolares a pesos :");
        taza=Dol.nextFloat();
        
        System.out.print("\n ingrese la ingrese la cantidad de dolares que desea convertir a pesos  :");
        dolar=Dol.nextFloat();
        if(dolar<0){
            System.out.print("\n Error");
        }
        pesos=dolar*taza;
        
        System.out.println("\n Valor convertido a pesos :"+pesos);
        
        
        // TODO code application logic here
    }
    
}
