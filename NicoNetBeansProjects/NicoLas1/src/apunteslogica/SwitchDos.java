/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apunteslogica;


/**
 *
 * @author 505
 */
import java.util.Scanner;
public class SwitchDos {
        public static void main (String [] args){
        static Scanner sc = new Scanner(System.in);
        
        int opc;
        
         System.out.println("comidas: "
                 + "1. desayuno"
                 + "2. almuerzo"
                 + "3. Cena"
                 + "4. Bebidas"
                 + "5. Snack"
                 + "6. Comidas rapidas");
         opc= sc.nextInt ();
          switch (opc){
                   case 1:
                   System.out.println("Su pedido desayuno a sido registrado");
                   break;
                   case 2:
                   System.out.println("Su pedido almuerzo a sido registrado");
                   break;
                   case 3:
                   System.out.println("Su pedido cena a sido registrado");
                   break;
                   case 4:
                   System.out.println("Su pedido de bebidas se genero");
                   break;
                   case 5:
                   System.out.println("Su pedido snack a sido registrado");
                   break;
                   case 6:
                   System.out.println("Seleccione una opción: " + comidaR);
                   break;
                   default: 
                   System.out.println("seleccione una opcion valida");
                   
          }
        
        /**
        int opc
        int desayumo;
        int almuerzo;
        
         System.out.println("Que quieres el dia de hoy");
         opc=sc.nextInt();  
         
          switch (opc){
                case 1: 
                System.out.println("Desayuno");
                break;
                case 2:
                System.out.println("Almuerzo");
                break;
                case 3: 
                System.out.println("cena");
                case 4: 
                System.out.println("Snacks");
                case 5: 
                System.out.println("Comidas rapidas");
                
                
         System.out.println("Seleccione una opcion para el desayuno");
         desayuno=sc.nextInt();  
         
          switch (desayuno){
                case 1: 
                System.out.println("Huevo+arroz+arepa+chocolate");
                break;
                case 2:
                System.out.println("Panqueques+jugo");
                break;
                case 3: 
                System.out.println("Migote");
                
          System.out.println("Seleccione una opcion para el almuerzo");
          almuerzo=sc.nextInt();  
         
          switch (almuerzo){
                case 1: 
                System.out.println("Sopa+seco+jugo");
                break;
                case 2:
                System.out.println("seco+jugo");
                break;
                case 3: 
                System.out.println("sopa+jugo");
                
                
        //Queremos crear un menu para seleccionar platos en un restaurante 
        //Cree una opcion para desayuno,almuerzo,cena,bebidas,snacks y comidas rapidas */
    }
    
    
}
