/*
Escribe un programa que escriba la tabla de multiplicar de cualquier número entero dado por el
usuario, entre 1 y 10.
 */
package Ejercicio5;

import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        //Le pido al usuario un numero
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = sc.nextInt();
        
        //Ahora escribo la tabla de multiplicar
        System.out.println("Tabla de multiplicar del " + num);
        for (int i=1; i<=10; i++){
            
            System.out.println(num + " x " + i + " = " + (num*i));
            
        }
    }
}
