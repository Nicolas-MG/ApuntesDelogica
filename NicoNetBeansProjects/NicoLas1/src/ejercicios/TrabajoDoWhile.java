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
/*realizar una aplicacion que permita realizar 3 converciones
de grados fahtrheit a celsios mostrandola primera y consultando las otras dos */

/* realiza un programa que permita realizar retiros de un cajero
a. que el usuario tenga saldo
b. si el usuario tiene saldo le permita realizar un retiro <= al saldo y max50.000
c si queda saldo que pregunte si desea hacer otros retiros hasta el maximo de saldo
saldo inicial 300.000*/

public class TrabajoDoWhile {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
         
   
    
        
        int opc = 1;
        do{
            System.out.println("esto en grados Celsius es: " + convertor());
            
            
            System.out.println("veces calculadas " + opc++);
        }while(opc != 4);
        
        
        
    }
    public static double convertor(){
    
       
           
           
           
           System.out.println("Ingrse los grados Fahrenheit ");
           int num = sc.nextInt();
           
           double FH = (num - 32) * 5/9 ;
           return FH ;
       
        
    }
    
}
