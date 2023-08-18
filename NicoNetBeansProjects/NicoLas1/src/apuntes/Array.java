/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

/**
 *
 * @author desarrollo
 */
public class Array {
    public static void main(String[] args) {
        String names[]= new String[4];
        names[0]="Maria";
        names[1]="Juan";
        names[2]="Andres";
        //System.out.println("posicion" + names[1]);
        
        for(int i=0; i<names.length; i++){
            System.out.println("posicion: " + i + " es " + names[i]);
            
            
        }
    }
}
