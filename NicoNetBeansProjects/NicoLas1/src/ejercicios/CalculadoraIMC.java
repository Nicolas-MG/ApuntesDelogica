/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author 505
 */
public class CalculadoraIMC {
    static Scanner sc = new Scanner(System.in);
    public static void main (String [] agrs){
        
        System.out.println("Ingrese su peso");
        float peso = sc.nextFloat();
         System.out.println("Ingrese su altura");
        float altura = sc.nextFloat();
        float pesoAltura= peso/(altura*altura);
        
       if( pesoAltura < 18.5){
            System.out.println("Bajo peso ");
        }else if (pesoAltura >= 18.5 && pesoAltura <= 24.9){
            System.out.println("Normal ");
        }else if (pesoAltura >= 24.9 && pesoAltura <= 29.9){
            System.out.println("Sobre peso ");
        }else if (pesoAltura == 30.0){
            System.out.println("Obesidad ");
        } else {
            System.out.println("Ingrese un valor valido: ");
        }
 
    }
            
            
    
}
