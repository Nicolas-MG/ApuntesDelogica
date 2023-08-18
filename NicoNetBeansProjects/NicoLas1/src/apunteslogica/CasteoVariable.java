/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apunteslogica;

/**
 *
 * @author 505
 */
public class CasteoVariable {
    public static void main(String[]args){
    
    int  a, b, suma, resta, multi, div;
    
    a = 4;
    b = 10;
    suma = a+b;
    resta = a-b;
    multi = a*b;
    div = b/a;       
          
 System.out.println("el resultado de la suma es:" + suma);      
 System.out.println("el resultado de la resta es:" + resta);        
 System.out.println("el resultado de la multiplicacion es:" + multi);        
 System.out.println("el resultado de la divicion es:" + div);        
            
/*para evitar que se pierda informacion en la div de b/a de tipo int
 hago un casting de variables*/
 float =(float) b/a;
 
 
 



}  
            
            
            
}        
            
            

