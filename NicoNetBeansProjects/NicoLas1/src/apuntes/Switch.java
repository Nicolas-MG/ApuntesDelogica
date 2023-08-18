/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasos;

/**
 *
 * @author 505
 */
import java.util.Scanner;
public class Switch {
    public static void main(String [] args){
        
        Scanner sc = new Scanner(System.in); 
        
        int opc;
        
        
        
        
        System.out.println("si su nota es menor que 2.0 dijite 1");
        System.out.println("si su nota es menor que 3.0 dijite 2");
        System.out.println("si su nota es menor que 4.0 dijite 3");
        System.out.println("si su nota es menor que 5.0 dijite 4");
        System.out.println("si su nota es igual que 5.0 dijite 5");
        
        System.out.println("selecione una opcion: ");
        opc = sc.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("nota es reprobada");
                break;
            case 2:
                System.out.println("nota es regular");
                break;
            case 3:
                System.out.println("nota es basica");
                System.out.println("conoce la opciones para mejorar la nota");
                break;
            case 4:
                System.out.println("nota es superior");
                break;
            case 5:
                System.out.println("nota es Exelente");
                
                
                
        }
        
        
    }
    
}
