/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apunteslogica;

/**
 *
 * @author 505
 */
import java.util.Scanner;
public class Switch {
            
    public static void main (String [] agrs){
        static Scanner sc = new Scanner(System.in);
        
        int opc;
        
         System.out.println("Si nota es menor que 2.0 seleccione 1");
         System.out.println("Si nota es entre que 2.0 y 2.99 seleccione 2");
         System.out.println("Si nota es entre que 2.99 y 3.99 seleccione 3");
         System.out.println("Si nota es entre que 2.99 y 4.99 seleccione 4");
         System.out.println("Si su nota es 5 seleccione 5");
       
         System.out.println("Seleccione una opcion");
         opc=sc.nextInt();
        
        switch (opc){
                case 1: 
                System.out.println("Nota es reprobada");
                break;
                case 2:
                System.out.println("Nota es regular");
                break;
                case 3: 
                System.out.println("Nota corresponde a basico");
                break;
                case 4: 
                System.out.println("Nota corresponde a superior");
                break;
                case 5: 
                System.out.println("Excelente! ");
                default:
                    System.out.println("Ingrese un valor ");
                
        }
    }
    
}
