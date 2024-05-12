/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t2ejercicio2;
import java.util.Scanner;
/**
 *
 * @author ADSI
 */
public class T2ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner parq = new Scanner(System.in);
        
        int min,a=10,b=5,c;
        String moto;
        
        
        System.out.print("ingrese el tipo de vehiculo si es carro o moto: ");
        moto=parq.next();
        String str="carro";;
        
        if(str.equals(moto)){
            System.out.println("es carro");
              System.out.println("ingrese las horas que duro el vehiculo");
              min=parq.nextInt();
              if(min<1){
                  System.out.println("Error");  
              }
             c = a*min;
              System.out.println("total a pagar "+c);
        }
        else{
            System.out.println("es moto");
            System.out.println("ingrese los minutos que duro el vehiculo");
             min=parq.nextInt();
              if(min<1){
                  System.out.println("Error");  
              }
             c = b*min;
              System.out.println("total a pagar "+c);
        }
        // TODO code application logic here
    }
    
}
