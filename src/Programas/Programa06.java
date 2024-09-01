
package Programas;

import java.util.Scanner;
public class Programa06 {
      public static void main(String[] args) {
        // Declarar variables
        Scanner scanner= new Scanner(System.in);
        // Solicitar la edad
        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();
        // proceso de datos 
        if (edad >= 0 && edad <= 12) {
            System.out.println("Eres un niño.");
        } else if (edad >= 13 && edad <= 17) {
            System.out.println("Eres un adolescente.");
        } else if (edad >= 18 && edad <= 64) {
            System.out.println("Eres un adulto.");
        } else if (edad >= 65) {
            System.out.println("Eres un adulto mayor.");
        } else {
            System.out.println("Edad no válida.");
        }
        // Salida de datos
        System.out.println(edad);
    }
}
      


