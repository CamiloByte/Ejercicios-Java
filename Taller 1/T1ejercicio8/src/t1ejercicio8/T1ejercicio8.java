/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t1ejercicio8;
import java.util.Scanner;
/**
 *
 * @author ADSI
 */
public class T1ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Scanner fub= new Scanner(System.in);
       
       int a,b,c,d;
       String texto;
       System.out.print("ingrese el nombre de su equipo: ");
       texto=fub.nextLine();
       
       System.out.print("\n ingrese el numero de partidos ganados: ");
       a=fub.nextInt();
       c=a*3;
        System.out.print("\n ingrese el numero de partidos empados: ");
       b=fub.nextInt();
       
       d=c+b;
       
       System.out.println("\n Tu equipo "+texto+" lleva "+d+ " puntos acumulados en el campeonato" );
       
        // TODO code application logic here
    }
    
}
