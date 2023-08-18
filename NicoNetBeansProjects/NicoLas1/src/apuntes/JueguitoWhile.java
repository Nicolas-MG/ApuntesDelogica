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
public class JueguitoWhile {
   /* public static void main(String[]args){
        
        int lifes = 5;
        int points = 0;
        int num = -1;
       
        
       /* while (lifes !=0){
            num = (int)(Math.random() * 100); 
            if(num == 0){
                lifes--;
                System.out.println("te queda " + lifes + "Vidas" );
            }else{
               
                points++;
                System.out.println("has ganado " + points );*/
                
                
          /*  }*/
            
       /* }
        
    /*}*/ 
    
   

  /*public class Calculadora {*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        System.out.println("Ingrese el primer número:");
        num1 = input.nextDouble();
        System.out.println("Ingrese el segundo número:");
        num2 = input.nextDouble();
        System.out.println("Ingrese la operación (+, -, *, /):");
        char operator = input.next().charAt(0);
        double result;
        while (true) {
            if (operator == '+') {
                result = num1 + num2;
                break;
            } else if (operator == '-') {
                result = num1 - num2;
                break;
            } else if (operator == '*') {
                result = num1 * num2;
                break;
            } else if (operator == '/') {
                result = num1 / num2;
                break;
            } else {
                System.out.println("Operación inválida. Ingrese la operación (+, -, *, /):");
                operator = input.next().charAt(0);
            }
        }
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
} 
    
    
    
    

