/*
Escribe un programa que calcule el factorial de n donde n es un número entero mayor o igual que
cero dado por el usuario.
 */
package Ejercicio3;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        
        //Le pido el numero al usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("El factorial de un numero");
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        
        //Valido el numero 'n' para que sea >=0
        while(n<0){
            System.out.println("Ingrese un numero: ");
            n = sc.nextInt();
        }
        //Calculo el factorial del numero
        int factorial=1;
        for (int i=1; i<=n; i++){
           
            factorial *= i;
            
        }
        //Muestro por pantalla el factorial
        System.out.println("El factorial de " + n + " es igual a " + factorial);
        System.out.println(n + "! = " + factorial);
    }
}
