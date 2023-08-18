/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author 503
 */
public class Calculadora {
     public static void  main (String [] args){
         Scanner sc = new Scanner (System.in);
         
         System.out.println("Que operacion deseas hacer hoy: \n"
                 + "1. suma \n" 
                 + "2. resta \n" 
                 + "3. multiplicacion \n"
                 + "4. division");
         int opc = sc.nextInt();
         System.out.println("ingrese valor 1: " );
         double a= sc.nextDouble();
         System.out.println("ingrese valor 2: " );
         double b= sc.nextDouble();
         
        switch (opc){
        case 1:
        System.out.println("Total suma : " + calcularSuma(a,b));
        break;
        case 2:
        System.out.println("Total resta : " + calcularResta(a,b));
        break;
        case 3:
        System.out.println("Total Multiplicacion : " + calcularMul(a,b));
        break;
        case 4:
        System.out.println("Total Division : " + calcularDiv(a,b));
        break;
    
     }
    }
      public static double calcularSuma (double a, double b){
         double suma = a+b;
         return suma;
      }
         public static double calcularResta(double a, double b){
         double resta = a-b;
         return resta;
      }     
         public static double calcularMul(double a, double b){
         double mul = a*b;
         return mul;
      }     
         public static double calcularDiv(double a, double b){
         double div = a/b;
         return div;
      }  
    }


