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

public class FuncionVoid {
    
    
   static Scanner sc = new Scanner(System.in);
   static int opc;
   //------------------menu general---------------------// 
    public static void main(String []args){
              
          
          System.out.println("Que va a Comer?:");
          System.out.println("1.desayuno\n2. Almuerzo\n3.Comida Rapida\n4.mejor tomo algo ");
          opc = sc.nextInt();
         switch(opc){
         case 1:
         System.out.println("vea pues los desayunos");  
         desayunos();
         break;
        case 2:
         System.out.println("vea pues los almuerzos"); 
         almuerzo();
         break;
        case 3:
         System.out.println("vea pues lo que engorda");  
         Comida_Rapidas();
         break;
         case 4:
         System.out.println("tomese algo pues");  
         bebidas();
         break;
        default:
        System.out.println("no va a comer?");    
        
    
    }    
    }
 //----------------------------------------//      
       public static void bebidas(){
     
    System.out.println("Elija una opcion");
    
    System.out.println("1 Coca Cola\n"
            + "2 Manzana\n"
            + "3 Jugo de naranja\n");
    
      
    opc = sc.nextInt();
    
    
    switch(opc){
        case 1:
         System.out.println("Cocacola");  
         break;
        case 2:
         System.out.println("Jugo de Naranja");  
         break;
        case 3:
         System.out.println("Jugo Natural");  
         break;
        default:
         System.out.println("Va a tomar algo o no?");
    }    
    }    
    //--------------menu Desayunos-----------------//   
    public static void desayunos(){
       
          System.out.println("que va a desayunar");
          System.out.println("arepa con que?\n"
                  + "1.Con huevo\n"
                  + "2.con Quesito\n"
                  + "3.con calentado\n");
          opc = sc.nextInt();
   
          
   switch(opc){
        case 1:
         System.out.println("arepa con huvo esa es");  
         break;
        case 2:
         System.out.println("con quesito uy como!!");  
         break;
        case 3:
         System.out.println("con calentado, va es con toda");  
         break;
        default:
         System.out.println("no va a comer?");
    }  
    }
    public static void almuerzo(){
       
          
          System.out.println("que va almorzar?\n"
                  + "1.Sancocho\n"
                  + "2.Frijoles\n"
                  + "3.sudado\n");
          opc = sc.nextInt();
   
          
   switch(opc){
        case 1:
         System.out.println("sancocho bien melo");  
         break;
        case 2:
         System.out.println("frijolitos uy como!!");  
         break;
        case 3:
         System.out.println("sudadito apenas es ");  
         break;
        default:
         System.out.println("no va a comer?");   
   }   
   }
    public static void Comida_Rapidas(){
       
          
          System.out.println("que va a cenar?\n"
                  + "1.aburwessa\n"
                  + "2.perrote\n"
                  + "3.Super salchipapaaa!!\n");
          opc = sc.nextInt();
   
          
   switch(opc){
        case 1:
         System.out.println("aburwesa si es capas con todo eso?");  
         break;
        case 2:
         System.out.println("perroteee uy como!!");  
         break;
        case 3:
         System.out.println("super salchipapas, va es con toda");  
         break;
        default:
         System.out.println("no va a comer?");    

   
   }
   }
}


