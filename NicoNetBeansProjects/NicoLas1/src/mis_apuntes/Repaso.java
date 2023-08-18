/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
public class Repaso {
    public static void  main(String [] args){
    
    //variables
     byte nun1 = 127;
     short num2 = 32767;
     int num3 = 2147483646;
     long num4 = 9223372036854775807l;
     long num5 = 2334567;
     float num6 = 4.55684290595868587574374f;
    double num7 = 5.456884736323947857348;
    char caracter = 64;
    boolean isON; // cuando declaramos una variable boolean esta por defecto es 
    //falsa.
    
     isON= true;
             
    //System.out.println("Float: " + num6);
    //System.out.println("double: " + num7);
    System.out.println (caracter);
    System.out.println (isON);
    
    /*** Operadores Aricmeticos***/
    //son +,-,/,*,%
    int a;
    int b;
    int c;
    // o se pueden declarar todas en la misma linea 
    int d, e;
    
    // a =500, b = 400, c = 390, d = 510 , e = 300
     a =500;
     b = 400; 
     c = 390;
     d = 510;
     e = 300;
     //suma
     
     int puntosTotales = a+b+c+d+e;
    
     System.out.println("en total de puntos obtenidos porpepito es de :" + puntosTotales);
           
     

// Variable tipo string
          

String name = "Pepito"; 
String name2 = "Pepito";


boolean compare = name.equals(name2);

  System.out.println("Name y Name2 son iguales? " + compare); 
          
    
          
    
     
          
          
          
    }
    
    
            
            
 }


