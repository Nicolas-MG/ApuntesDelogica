/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mis_apuntes;

/**
 *
 * @author 505
 */
public class CasteoVariable {
    public static void main (String [] agrs){
        
        int a,b,suma,resta,multi,div;
        a=4;
        b=10;
        suma=a+b;
        resta=a-b;
        multi= a*b;
        div= a/b;
        System.out.print("El resultado de la suma es: " + suma);
        System.out.print("El resultado de la resta es: " + resta);
        System.out.print("El resultado de la multiplicación es: " + multi);
        System.out.print("El resultado de la division es: " + div);
        
        //Para evitar que se pierda información en la div b/a de tipo int 
        //Realizo un canting de variables
        
        float divFloat=(float) b/a;
        System.out.print("El valor exacto de div es: " + divFloat);
        
        //Practica
        int alto, largo, area;
        alto=5;
        largo=5;
        area= alto*largo;
        System.out.print("El area es: " + area);
        
        //pepito trabaja en la empresa xyz y hoy recibio su pago. Le descontaron un prestamo por 150.000
        //ademas de salud y pension
              
          
        
    }
    
}
