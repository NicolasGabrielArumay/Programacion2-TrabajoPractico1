/*
Escribe el programa para un juego que consista en averiguar un número. El programa nos indicará
cada vez si el número introducido es mayor o menor que la constante almacenada que tendremos
que averiguar. Cuando se descubre el numero mostrara un mensaje de felicitación.
 */
package Ejercicio7;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int respuesta = 47;
        int num;
        System.out.println("Adivina el numero (entre 1-100)!!!");
        //Le pido un numero al usuario
        do {
            System.out.println("Ingrese un numero: ");
            num = sc.nextInt();
        //Compruebo si es mayor o menor al numero a adivinar
            if(num>respuesta){
                System.out.println("El numero es menor que " + num);
            } else if (num<respuesta){
                System.out.println("El numero es mayor que " + num);
            }
            
        } while(num!=respuesta);
        
        //Muestro por pantalla que adivino el numero
        System.out.println("Felicidades!!!");
        System.out.println("El numero era: " + respuesta);
    }
    
}
