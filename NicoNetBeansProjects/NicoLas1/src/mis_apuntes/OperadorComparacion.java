/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
public class OperadorComparacion {
   public static void main (String [] agrs){
        int num1=10;
        int num2=7;
        boolean resultado = num1 >= num2;
        
        System.out.println(resultado);
        
        /**
         * Comnparación de dos String
         */
        String nombre1 = "Maria";
        String nombre2 = "Maria";
        boolean nombreIgual= nombre1 == nombre2;
       System.out.println("Es igual el nombre " + nombreIgual);      
       
       double salario1=1160000;
       double salario2=1200000;
       
       boolean compSalario = salario1 != salario2;
       boolean compSalario2 = salario1 == salario2;
       
       System.out.println("Los salarios son diferentes " + compSalario);
       System.out.println("Los salarios son iguales? " + compSalario2);
       
       //Vamos a incluir validacions
       int edad = 9;
       
       if (edad <= 10) {
           System.out.println("El niño puede ingresar ");
       }
       
       if (edad <= 12) {
           System.out.println("Ek niño puede ingresar ");
       }else{
           System.out.println("El niño es mayor de 12 años y no puede ingresar ");
       }
       
    }
    
}
