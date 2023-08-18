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
public class FuncionRetornoConArgumento {
    public static void main(String[]args){
       
        
        Scanner sc = new Scanner(System.in);
        
       double a = 30;
       double b = 30;
       
       
       System.out.println("ingrese el lado A");
       double c = sc.nextDouble();
       System.out.println("ingrese el lado b");
       double d = sc.nextDouble(); 
       System.out.println("capturando datos desde teclado" + calcularArea(c,d));
       
        System.out.println( calcularArea(30,20) );
        
        System.out.println( edad() );
        
        
        
    }
    public static double calcularArea(double ladoA, double ladoB){
        
       double areaTotal = ladoA*ladoB;
       
       return areaTotal;
        
        
    }
    
    
     public static int edad(){
     Scanner sc = new Scanner(System.in);
         
     System.out.println("la edad");
       int edad = sc.nextInt();
       return edad;
     
     }
    
    
}
