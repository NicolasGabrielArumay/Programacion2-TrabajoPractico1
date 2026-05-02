/*
Escribe un programa que tome 3 números enteros introducidos por el usuario mediante el teclado y
determine cuántos de dichos números son diferentes, el promedio, la suma de todos, el producto del
mayor por el menor y si el número restante es divisible por 3.
 */
package Ejercicio1;
import java.util.Scanner;

public class Ej1 {

    
    public static void main(String[] args) {
        
        //Guardo 3 numeros enteros introducidos por el usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese otro numero entero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese otro numero entero: ");
        int num3 = sc.nextInt();
        
        //1) Identifico si los numeros son diferentes
        int diferente;
        
        if (num1 == num2){ 
            if (num2 == num3){
                diferente = 1; //1 1 1
                
            }else diferente = 2; // 1 1 2
            
        } else if (num2 == num3 || num1 == num3){
                diferente = 2; // 1 2 2, 1 2 1
            
        }else diferente = 3; // 1 2 3
        
        System.out.println("Cantidad de números diferentes: " + diferente);
        
        //2) Saco el promedio de los tres numeros
        double prom;
        prom = (double)(num1 + num2 + num3)/3;
        System.out.println("Promedio de los números: " + prom);
        
        //3) Muestro la suma de los numeros
        System.out.println("La suma de los números: " + (num1+num2+num3));
        
        //4) Identifico cual es el mayor y menor
        int mayor = num1;
        int menor = num1;
        
        if (num2>mayor) //Mayor
            mayor = num2;
        
        if (num3>mayor)
            mayor = num3;
        
        if (num2<menor) //Menor
            menor = num2;
        
        if (num3<menor)
            menor = num3;

        System.out.println("Producto del mayor por el menor: " + mayor*menor);
        
        //5) Muestro si el numero restante es divisible por 3
        if (diferente == 3) {
            int restante;

            if (num1 != mayor && num1 != menor) {
                restante = num1;
            } else if (num2 != mayor && num2 != menor) {
                restante = num2;
            } else {
                restante = num3;
            }

            if (restante % 3 == 0) {
                System.out.println("El numero restante es divisible por 3");
            } else {
                System.out.println("El numero restante NO es divisible por 3");
            }   
   
        }
    
    }
}