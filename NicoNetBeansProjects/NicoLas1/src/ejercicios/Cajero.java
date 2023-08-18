/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;
import java.util.Scanner;
/**
 *
 * @author 503
 */


public class Cajero {
    public static void main(String[] args) {
        int saldoInicial = 300000;
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("Ingrese el monto a retirar:");
            int montoRetiro = scanner.nextInt();

            if (montoRetiro > saldoInicial || montoRetiro > 50000) {
                System.out.println("No tiene saldo suficiente o ha excedido el límite de retiro.");
                break;
            }

            saldoInicial -= montoRetiro;

            System.out.println("¿Desea hacer otro retiro? (S/N)");
            respuesta = scanner.next();
        } while (saldoInicial > 0 && respuesta.equalsIgnoreCase("S"));

        System.out.println("Su saldo actual es: " + saldoInicial);
    }
}
