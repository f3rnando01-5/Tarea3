
package Programas;
import java.util.Scanner;
public class Programa03  {
    public static void main(String[] args) {
                    //declarar variable
                    int num;
                    String mensaje;
                    Scanner lectura=new Scanner (System.in);
                    //entrada de datos
                    System.out.print("ingresar un numero:");
                    num=lectura.nextInt();
                    //proceso de datos
                    if (num>0) {
                        mensaje="Numero Positivo";
                    } else if (num<0) {
                        mensaje="Numero Negativo";
                    }else {
                        mensaje="Numero Neutro";
                    }
                    //salida de datos
                    System.out.println(mensaje);
                    
    }
}
                                
