/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apunteslogica;

import java.util.Scanner;

/**
 *
 * @author 505
 */
//import java.util.Scanner;fora larga
//forma corta alt+enter

public class Condicionales {
   
   static Scanner LD = new Scanner(System.in);
            
    public static void main (String [] agrs){
        
        //---------------------------------------
        int num1=5;
        int num2=5;
        boolean isEqual= num1 == num2;
        System.out.println("Es igual ?" + isEqual);
        
        String word ="Hola";
        String word2 ="hola";
        boolean result = word.equals (word2);
        System.out.println("Es igual " + result);
        //---------------------------------------
    String email="pepito@mail.com";
    String name = "pepito";
    int password=1234;
    
        System.out.println("Ingresar su gmail ");
        String emailUser= LD.nextLine();
        System.out.println("Ingrese su contraseña ");
        int passUser = LD.nextInt();
        
        //---------------------------
        if ( email.equals(emailUser) && password==passUser){
           System.out.println("Bienvenido " + name);
       }else{ 
           System.out.println("Los datos no coinciden");
       }
    
    }
    
}
