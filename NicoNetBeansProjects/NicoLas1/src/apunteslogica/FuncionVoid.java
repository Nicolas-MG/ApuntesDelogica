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
public class FuncionVoid {
    static Scanner sc = new Scanner (System.in);
    //-------------------variable-----------------
    
   static int opc;
    //--------------------main---------------------
    public static void main (String [] args){
        System.out.println("Seleccione \n"
                + "1. Bebidas \n"
                + "2. Comidas rapidas \n"
                + "3. desayuno \n"
                + "4. almuerzo \n"
                + "5. Cena \n"
                + "6. snack \n");
        opc = sc.nextInt();
        switch (opc){
            case 1: 
                System.out.println("Mostrar bebidas");
                menubebidas();
                break;
                  case 2: 
                System.out.println("Mostrar comidas rapidas");
                comidaR();
                break;
                  case 3: 
                System.out.println("Mostrar desayuno");
                desayuno();
                break;
                  case 4: 
                System.out.println("Mostrar almuerzo");
                almuerzo();
                break;
                  case 5: 
                System.out.println("Mostrar cena");
                cena();
                break;
                  case 6: 
                System.out.println("Mostrar snack");
                Snack();
                break;
        }
        menubebidas();
        comidaR();
        desayuno();
        almuerzo();
        cena();
        Snack();
        
    }
    //------------------funcion-----------------------
    public static void menubebidas(){
        System.out.println("Seleccione:\n "
                + "1. Coca-cola \n"
                + "2. manzana \n"
                + "3. jugo natural \n");
        opc= sc.nextInt();
        switch (opc){
            case 1:
                System.out.println("Coca-cola \n ");
                break;
            case 2:
                System.out.println("Manzana \n ");
                break;
            case 3:
                System.out.println("Jugo natural \n ");
                break;
            default:
                System.out.println("Seleccione una opcion valida \n ");
        }
    }
                
      //-----------------comida rapida----------------------------------------------
          public static void comidaR (){  
          
         System.out.println("Seleccione: \n  "
         + "1.perro \n"
         + "2.hamburguesa \n"
         + "3.salchipapas \n");
        opc = sc.nextInt();
        switch (opc){
            case 1:
                System.out.println("Perro \n ");
                break;
            case 2:
                System.out.println("Hmburguesa \n  ");
                break;
            case 3:
                System.out.println("Salchipapas \n ");
                break;
            default:
                System.out.println("seleccione una opcion valida \n ");
        }   
      }

       //----------------Desayuno------------------------------
        public static void desayuno (){
       System.out.println("Seleccione: \n  "
                 + "1.Huevo \n"
                 + "2.Tocineta \n "
                 + "3.Tostadas \n ");
        opc= sc.nextInt();
        switch (opc){
            case 1:
                System.out.println("Perro \n ");
                break;
            case 2:
                System.out.println("Hmburguesa \n ");
                break;
            case 3:
                System.out.println("Salchipapas \n ");
                break;
            default:
                System.out.println("seleccione una opcion valida \n ");
        }
       }
                
          //-------------------------Almuerzo--------------------------
          public static void almuerzo (){
          System.out.println("Seleccione: \n "
                 + "1.Bandeja paisa \n"
                 + "2.Sopa \n"
                 + "3.Seco \n");
        opc= sc.nextInt();
        switch (opc){
            case 1:
                System.out.println("Bandeja paisa \n");
                break;
            case 2:
                System.out.println("Sopa \n");
                break;
            case 3:
                System.out.println("Seco \n");
                break;
            default:
                System.out.println("seleccione una opcion valida \n");
        }
                
        }
     //-----------------cena------------------------------------------     
        public static void cena (){
          System.out.println("Seleccione: \n "
                 + "1.sopa \n"
                 + "2.pasta \n"
                 + "3.arroz con pollo \n");
        opc= sc.nextInt();
        switch (opc){
            case 1:
                System.out.println("Sopa \n");
                break;
            case 2:
                System.out.println("Pasta \n");
                break;
            case 3:
                System.out.println("arroz con pollo \n");
                break;
            default:
                System.out.println("seleccione una opcion valida \n");
        }
                
        }
     //----------------Snack--------------------
           public static void Snack (){
          System.out.println("Seleccione: \n "
                 + "1.Postre \n"
                 + "2.dulce \n"
                 + "3.salado \n");
        opc= sc.nextInt();
        switch (opc){
            case 1:
                System.out.println("postre \n");
                break;
            case 2:
                System.out.println("dulce \n");
                break;
            case 3:
                System.out.println("Salada \n");
                break;
            default:
                System.out.println("seleccione una opcion valida \n");
        }
                
        }
}


 
