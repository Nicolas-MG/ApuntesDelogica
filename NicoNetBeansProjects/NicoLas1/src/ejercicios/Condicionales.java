/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class Condicionales {
     public static void main (String [] agrs){
         
          // si pepito tiene menos de 2.800 en la civica
       double pasaje = 2900;
       if (pasaje < 2800){
           System.out.println("Saldo insuficiente ");
       }else{ double saldo= pasaje - 2800;
           System.out.println("Su nuevo saldo: " + saldo);
       }
       
       // si Juan caso 2.9 en el examen de logica
       
       double examen =2.9;
       if (examen < 3.5){
           System.out.println("Juan pierde el examen ");
       }else{
       System.out.println("Juan gana el examen ");
       }
       //si Juan caso 2.9 en el examen de logica profesor
       float nota =2.9f;
       if (nota >= 3.0){ System.out.println("Aprobado");
       }else{ System.out.println("no aprobado");
       }
       
       // si Andres es 3 cm mas alto que Juan
         double estaturaJuan =180;
       if (estaturaJuan <180){
           System.out.println("Andres es mas bajo que juan ");
       }else{ double Altura= estaturaJuan-183;
       System.out.println("Andres es mas alto que Juan por:  " + Altura + "cm");
       }
        // si Andres es 3 cm mas alto que Juan profesor
        float altAndres = 1.73f;
        float altJuan = 1.70f;
        if (altAndres >= altJuan){ System.out.println("Andres es mas alto que Juan ");
        }else{ System.out.println("Juan es mas alto que Andres");
        }
       
       // si tengo el fin de semana libre
       double libre =1;
       if (libre ==2){
           System.out.println("Si tengo el fin de semana libre ");
       }else{ System.out.println("No tengo el fin de semana libre ");
       } 
       // si tengo el fin de semana libre profesor
       boolean findeLibre =true;
       if ( findeLibre){System.out.println("Voy donde mis abuelos");
       } else{System.out.println("No voy donde mis abuelos");}
       // si me invitan a una fiesta
       double Invitacion =2;
       if (Invitacion ==2){
           System.out.println("Si me invitan a una fiesta me pongo mi camisa rosa ");
       }else{ System.out.println("No me invitaron a ninguna fiesta ");
       }
       // si me invitan a una fiesta profesor
       boolean invitadoFiesta=false;
       if (invitadoFiesta){
           System.out.println("Compro regalo");
       }else{ System.out.println("Me invento una");
       }
       // si quiero helado o quiero pizza 
         double comida=11;
         if ( comida <=10){ 
             System.out.println("Quiero helado");
         }else{
             System.out.println("Quiero pizza");
         }
         // si quiero helado o quiero pizza profesor 
         boolean pizza=true;
         boolean helado=false;
         if (pizza ==true || helado == true){
             System.out.println("Compro ambas o la que mas se me antoje");
         }else{
             System.out.println("Compro la que mas se me antoje");
         }
     }
    
}
