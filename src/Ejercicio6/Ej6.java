/*
Escribe un programa que calcule la suma de todos los números múltiplos de 5 comprendidos entre
dos enteros positivos leídos por teclado
 */
package Ejercicio6;

import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        
        //Le pido al usuario el primer numero del rango y valido si es positivo
        do {
        System.out.print("Ingrese un numero positivo para num1: ");
        num1 = sc.nextInt();
        } while (num1 <= 0);
        
        //Hago lo mismo para el segundo numero
        do {
            System.out.print("Ingrese un numero positivo para num2: ");
            num2 = sc.nextInt();
        } while (num2 <= 0);
        
        //Ordeno los numeros para que num1 sea siempre el menor
        if (num1 > num2) {
            int aux = num1;
            num1 = num2;
            num2 = aux;
        }
        
        //Calculo la suma de los numeros multiplo de 5 entre el rango de numeros
        int suma=0;
        for (int i = num1; i <= num2; i++) {
            if (i%5 == 0){
                suma+=i;
            }
        }
        System.out.println("La suma de los mutiplos de 5 entre " 
                           + num1 + " y " + num2 + " es: " + suma);
    }
}
