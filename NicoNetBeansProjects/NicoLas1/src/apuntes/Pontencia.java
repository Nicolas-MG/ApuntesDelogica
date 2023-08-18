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
 public class Pontencia {

    private static String resultado;
     public static void main(String [] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrse la base: ");
        int num1 = leer.nextInt();
        System.out.println("ingrese el exponente: ");
        int num2 = leer.nextInt();
        
        int result = potencia(num1,num2);
        System.out.println("el resultado de " + num1 + "elevado a: " + num2 + "es : " + resultado);
     }
      //funcion para la potencia
    public static int potencia(int num1, int num2){
        int resultado = 1;
        int contador = 2;
        //ejecicion del while
        while (contador <= num2){
            resultado *= num1;
            contador++;
        }
        return resultado;
    }
}    
   
        
        
  

