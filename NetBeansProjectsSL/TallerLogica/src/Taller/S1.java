/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * @author 503
 */
public class S1 {
    public static void main(String[] args) {
        int R1 = 3+8*5-6/3;
        System.out.println("la respuesta es : " + R1);
        double R2 = 2.5*2*3-4/2+8;
        System.out.println("la respuesta es : " + R2);
        double R3 = 2*(6-2.5)/3;
        System.out.println("la respuesta es : " + R3);
        
        int n1 = 25;
        int n2 = 18;
        if(n1>n2){
            System.out.println("El numero " + n1 + " es mayor que el " + n2);
        }else{
            System.out.println("El numero " + n1 + " no es mayor que el" + n2);
        }
        double r1 = 3 + 2.5 * 4 / 3;
        double r2 = 4 * 5.2 - 3.8;

        if (r1 != r2) {
            System.out.println("Las operaciones son diferentes");
        } else {
            System.out.println("Las operaciones son iguales");
        }
        double N1 = 8.5/3.2 + 6.5 - 2.3*5/6;
        double N2 = 81/4 + 2;
        boolean RF = N1 >= 15.8 && 21.4 < N2;
        
        System.out.println("El resultado  " + RF);
        
    }
}
