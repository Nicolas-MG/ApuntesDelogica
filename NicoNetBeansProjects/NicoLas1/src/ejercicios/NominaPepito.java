/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class NominaPepito {
    
    
     public static void main(String[] args){
      
        int pres,salud, pen, sueldo, auxtrans,
    
        pres = 160000;
        salud = 4%;       
        pen = 4%;       
        auxtrans= 14606;     
  
         sueldo=1250000; 
       int pressueldo = sueldo - pres;
        int saludsueldo = sueldo-salud;
        int pensueldo =sueldo - pen;   
        int auxtranssueldo= sueldo+auxtrans;
        
        
        
        
      System.out.println("EL resultado del auxilio de transporte es:"+ auxtranssueldo );              
     System.out.println("El resultado del pago menos el prestamo  "+ pressueldo );
     System.out.println("El resultado"+ saludsueldo);
     System.out.println("El resultado"+ pensueldo);
     System.out.println("El resultado"+ auxtranssueldo);
     }               
}
