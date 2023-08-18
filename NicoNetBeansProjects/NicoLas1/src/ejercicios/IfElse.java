/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class IfElse {
    public static void main (String [] agrs){
    // Si una persona es mayor de edad, puede ingresar sino no puede ingresar
        double findeLibre = 23;
       if ( findeLibre >=18){System.out.println("Si puede ingresar");
       } else{System.out.println("No puede ingresar");}
    // Si una persona gana menos de dos salarios minimos se le paga auxilio de transporte sino se le paga el salario conveniente
        int AuxilioTran,SalarioMinimo,Salario;
        AuxilioTran= 140606 ;
        SalarioMinimo= 1300606 * 2;
        Salario= 1400000;
        if (Salario <= SalarioMinimo) {
            System.out.println("Se paga auxilio de transporte");
        }else{
            System.out.println("No se paga auxilio de transporte");
            }
    // int num1=30; int num2=32; teniendo encuenta esas dos variables deben validar si el num1 es menor que el num2 y cual es la diferencia 
    // validar si num1 es igual que num2
    // validar si num1 es diferente a num2
    // validar si num2 es mayor que num1 y cual es la diferencia
    // castear num1 y num2 y realizar una division,una multiplicacion,suma y resta
    int num1=30; 
    int num2=32;
    if (num2>num1) {
    	  System.out.println(num1 + " es mayor que " + num2);
    }else{ double diferencia=num2-num1;
    	  System.out.println("La diferencia es de: " + diferencia);}
    
    if (num1 != num2) {
    	System.out.println("son distintas");
       }else{ num1=num2;
    	   System.out.println("son iguales");}
    int multiplicacion=num1*num2;
    int division= num1/num2;
    int suma= num1+num2;
    int resta= num1-num2;
    System.out.println("Total: " + multiplicacion);
    System.out.println("Total: " + division );
    System.out.println("Total: " + suma);
    System.out.println("Total: " + resta);
    
    // realizar la siguiente operacion num1%num2, explicar el resultado
    }
    
}
