/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Do_While {
   static Scanner sc = new Scanner(System.in);
   
    public static void main(String[] args) {
        
        int opc = 0;
        do{
            System.out.println("El area es: " + calcularArea());
            
            opc++;
            System.out.println("veces calculadas " + opc++);
        }while(opc != 5);
        
        
        
    }
    public static int calcularArea(){
    
       
           
           
           
           System.out.println("Ingrese el aldo 1: ");
           int lado1 = sc.nextInt();
           System.out.println("Ingrse el lado 2: ");
           int lado2 = sc.nextInt();
           int area = lado1*lado2;
           return area;
       
       
    
    
    
    }
    
}
