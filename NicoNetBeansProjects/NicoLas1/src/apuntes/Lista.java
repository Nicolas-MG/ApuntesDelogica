/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apuntes;

/**
 *
 * @author desarrollo
 */
public class Lista {
    public static void main(String[] args) {
        String[] names = {"Maria","juan","Andres","luisa"};
        int[]ages = {15,19,17,21,25};
       /* System.out.println("el elemento 0 es: " + names[0] ); 
        System.out.println("el elemento 1 es: " + names[1] );
        System.out.println("el elemento 2 es: " + names[2] );
        System.out.println("el elemento 3 es: " + names[3] );*/
        
        int size = names.length;
        System.out.println("El tamaño de names es: " + size);
        for(int i = 0; i<names.length;i++){
            System.out.println("El elemento en la pocision " + i + " es " + names[i]);
        }
        /*vamos a crear una lista de 
        frutas - String
        redes sociales - String
        Notas - float
        sal.minimo - 6 años double
        Q equipos salas 4piso - int
         */
       
    }
    
}
