
package Ejercicios;
//import java.util.Scanner;
public class While1{
    public static void main(String[] args) {
        int i = 1, suma = 0;
        while (i <= 100) {
            suma += i;
            i++;
        }
        System.out.println("La suma es: " + suma);
    }
}

