/*
Escribe un programa que ingrese un número entero positivo N y luego N números enteros e
imprima la suma de los números que se encuentran entre el mayor de los N números leídos y el
menor de los N números leídos.
 */
package Ejercicio8;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Le pido al usuario el tamaño del Array
        System.out.println("Ingrese N numeros que quiere ingresar: ");
        int n = sc.nextInt();
        
        //Cargo el Array hasta n
        int numeros[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }
        
        //Busco el mayor y el menor
        int menor = numeros[0];
        int mayor = numeros[0];

        for (int i = 1; i < n; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }
        
        //Y sumo los numeros que estan entre el menor y el mayor
        int suma = 0;

        for (int i = 0; i < n; i++) {
            if (numeros[i] > menor && numeros[i] < mayor) {
                suma += numeros[i];
            }
        }
        
        System.out.println("Menor: " + menor);
        System.out.println("Mayor: " + mayor);
        System.out.println("Suma de los numeros entre el mayor y el menor: " + suma);
    }
}
