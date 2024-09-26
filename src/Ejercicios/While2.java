
package Ejercicios;
import java.util.Scanner;
public class While2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        
        // Pedir la cantidad de términos de Fibonacci que se quieren generar
        System.out.print("Ingrese la cantidad de números Fibonacci que desea generar: ");
        int n = lectura.nextInt();
        
        // Variables iniciales para la secuencia de Fibonacci
        int num1 = 0, num2 = 1;
        int contador = 0;        
        System.out.println("Secuencia de Fibonacci:");
        // Generar la secuencia de Fibonacci
        while (contador < n) {
            System.out.print(num1 + " ");
            
            // Actualizar los valores para el siguiente término
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;         
            contador++;
        }

        lectura.close();
    }
}
