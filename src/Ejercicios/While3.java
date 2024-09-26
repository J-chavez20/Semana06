
package Ejercicios;
import java.util.Scanner;
public class While3 {
     public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = lectura.nextInt();

        int contador = 1;
        while (contador <= numero) {
            if (contador % 2 == 0) {
                System.out.println(contador + " es par");
            } else {
                System.out.println(contador + " es impar");
            }
            contador++;
        }
    } 
}
