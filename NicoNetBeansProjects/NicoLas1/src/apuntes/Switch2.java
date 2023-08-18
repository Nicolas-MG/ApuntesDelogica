/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repasos;

import java.util.Scanner;

/**
 *
 * @author 505
 */
    
    public class Switch2 {
    public static void main(String[] args ){
        //Quermos crear un menu para seleccionar platos en un restaurante
        //cree opcion para desayunos, almuersos,
        //cena, bebidas, snacks y comidas rapidas
        Scanner sc = new Scanner(System.in);
        
        int cocina;
     
       
                
                
        System.out.println("1 para desyuno" + "2 para almuerzo" + "3 para cena"
                            + "4 para bebidas"
                            + "5 para snack"
                            + "6 para Comidas rapidas");
        

        System.out.println("selecione una opcion: ");
        cocina = sc.nextInt();
        
        
        switch(cocina){
            case 1:
                System.out.println("Su desayuno a sido pedido ");
                break;
            case 2:
                System.out.println("su almuerzo a sido pedido");
                break;
            case 3:
                System.out.println("su cena ya viene");
                break;
            case 4:
                System.out.println("su bebida ya viene");
                break;
            case 5:
                System.out.println("selecione cual va a jartar"
                        + "1 para amburgueza"
                        + "2 para perro extra grande"
                        + "3 para perrraaa rica");
                        
                            
            case 6:
                System.out.println("nota es Exelente");    
            default:
                System.out.println("dijite algo que se entienda");
                
        
        
        
        }   
    } 
    }

