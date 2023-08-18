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
public class CalculadoraNico {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double num1 = input.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = input.nextDouble();

        System.out.print("Usted quiere?: (+, -, *, /): ");
        char operator = input.next().charAt(0);

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("Operación inválida");
                return;
        

        }
        
         System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    
        
        
        }
}
  

