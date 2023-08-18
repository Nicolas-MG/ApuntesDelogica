/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class OperadorArimetico {
    //a. Sacar el promedio de puntos
    //b. Por sancion perdio 50 puntos los dias martes y miercoles 
    //c. Le van a pagar por cada 50 puntos una bonificacion de 10000 los dias lunes, martes y miercoles y los 15.000 jueves y viernes 
    //d. Cuanto dinero recibe por cada bonificacion en total y cuanto dejo de ganar por las sanciones.
    //e. Debera imprimir un informe
    public static void main (String [] agrs){
        
    int a,b,c,d,e;
    
    a=500;        
    b=400;
    c=390;
    d=510;
    e=300;        
          //a  
    int promedioPuntos = (a+b+c+d+e)/5 ;
        // int promedioPuntos= totalpuntos/5;
    
    System.out.println("Promedio de puntos es:" + promedioPuntos);
    
    // b del profesor
    int sancion=50;
    int bSinSancion=b;
    int cSinSancion=c;
    int bConSancion = b - sancion;
    int cConSancion = c - sancion;
    System.out.println ("Valor de b antes de la resta " + b );
    b = b - sancion;
    c = c - sancion;
    
   // b-= sancion;
   System.out.println ("B Despues de la resta: " + bConSancion + " C Despues de la resta: " + cConSancion);
    
    //System.out.println ("ver : " + bConSancion + "ver es : " + cConSancion);
            
    //b de alexis
    //int sancionMartes = b - 50 ;
    //int sancionMiercoles = c - 50 ;
    //int sancionTotal = promedioPuntos - sancionMartes - sancionMiercoles ;
    //int sumaTotal = a+b+c+d+e;
    //int restaDesanciones = sumaTotal - sancionMartes - sancionMiercoles;
    //System.out.println("Se le a sanciona los dias martes y miercoles " + restaDesanciones  );
    
    //c
    //c-= sancion; esto es la manera corta de hacer una resta con la misma variable
    System.out.println(b);
    System.out.println(c);
    int pagoBono10= ((a+b+c)/50)*10000;
    int pagoBono15=((d+e)/50)*15000;
    
    int bonoTotal = pagoBono10 + pagoBono15;
    
    //Cuanto dejo de percibir
    int perdida= (((bSinSancion - b)+(cSinSancion - c)) /50)*10000;
    System.out.println("La perdida es de: " + perdida);
    
    //d
    


    }
}
