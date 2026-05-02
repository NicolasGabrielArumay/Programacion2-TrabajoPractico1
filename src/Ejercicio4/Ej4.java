/*
Escribe un programa que escriba todos los divisores de un número n entero positivo introducido por
el usuario.
 */
package Ejercicio4;

import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        
      //Le pido el numero al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Los divisores de un numero");
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        
      //Valido el numero 'n' para que sea entero positivo
        while(n<=0){
            System.out.println("Ingrese un numero: ");
            n = sc.nextInt();
        }
        
      //Muestro todos los divisores de n
        System.out.println("");
        System.out.println("Los divisores de " + n + " son:");
      for (int i=1; i<=n; i++){
          
          if(n%i == 0){
              System.out.println("- " + i);
          }
      }
    }
}
