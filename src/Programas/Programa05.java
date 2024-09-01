
package Programas;

import java.util.Scanner;
public class Programa05 {
     public static void main(String[] args) {
        // Declarar datos
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Proceso de datos
        if (edad >= 18) {
            System.out.println("Usted puede votar.");
        } else {
            System.out.println("Usted no puede votar.");
        }

    }
}

     