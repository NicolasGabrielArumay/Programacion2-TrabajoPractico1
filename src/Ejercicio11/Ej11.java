/*
Escribe una aplicación que reciba como entrada un entero que contenga sólo dígitos 0 y 1 (es decir,
un entero binario), y que imprima su equivalente decimal. [Sugerencia: use los operadores residuo y
división para elegir los dígitos del número binario uno a la vez, de derecha a izquierda. En el
sistema numérico binario, el dígito más a la derecha tiene un valor posicional de 1, el siguiente
dígito a la izquierda tiene un valor posicional de 2, luego 4, luego 8, etcétera. El equivalente
decimal del número binario 1101 es 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 = 13].
 */
package Ejercicio11;

import java.util.Scanner;

public class Ej11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero binario: ");
        int binario = sc.nextInt();

        int decimal = 0;
        int potencia = 1; 

        while (binario > 0) {
            int digito = binario % 10;
            if (digito != 0 && digito != 1) {
                System.out.println("Error: numero no binario");
                return;
            }
            decimal += digito * potencia;

            potencia *= 2;
            binario /= 10;
        }

        System.out.println("Equivalente decimal: " + decimal);
    }
}
