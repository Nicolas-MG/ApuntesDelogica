/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author desarrollo
 */
public class IrrayScanner {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero que quiere conocer");
       int ps = leer.nextInt();
        
        String names[]= new String[4];
        names[0]="Maria";
        names[1]="Juan";
        names[2]="Andres";
         for(int i = ps; i=names.length){
            System.out.println("posicion: " + i + " es " + names[]);
    }
   }   
}
