
package Programas;

import java.util.Scanner;

public class Programa04 {
  
    public static void main(String[] args) {
        // Declarar datos
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingrese una frase: ");
        String frase = scanner.nextLine();

        // Proceso de datos"
        if (frase.equals("Taller de Programacion")) { 
            System.out.println(" Has ingresado la frase Correcta.");
        }    
    }
}