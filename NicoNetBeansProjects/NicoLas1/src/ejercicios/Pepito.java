/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author 505
 */
public class Pepito {
    public static void main (String [] agrs){
        int salario,auxilioT,prestamo;
        salario= 1600000;
        prestamo= 160000;
        auxilioT= 140000;
        int desSalud= ((salario*4)/100);
        int desPension= ((salario*4)/100);
        int desTotal = desSalud + desPension;
        int TSalPen= salario - desTotal;
        int Tprestamo = TSalPen-prestamo;
        int Definitiva = Tprestamo + auxilioT;    

        
        System.out.println("Salario menos prestamo " + Definitiva);
    }
                                                                    
}
