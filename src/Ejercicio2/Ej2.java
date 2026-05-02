/*
Escribe un programa que tome un año introducido por el usuario y diga si es bisiesto o no. Recuerda
que los años múltiplos de 4 son bisiestos, excepto aquellos que son múltiplos de 100 y no lo son de
400. Es decir el año 2000 si es bisiesto, pero no lo son el 1990 ni el 2100.
 */
package Ejercicio2;

import java.util.Scanner;


public class Ej2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("AÑO BISIESTO");
        System.out.println("Ingrese un año: ");
        int año = sc.nextInt();
        
        if (año%4 == 0){
            
            if (año%100 == 0){
                if (año%400 == 0){
                    System.out.println("El año " + año + " es BISIESTO");
                }else{
                    System.out.println("El año " + año + " NO es BISIESTO");
                }
            }else{
            
                System.out.println("El año " + año + " es BISIESTO");
            }

        }else {
            System.out.println("El año " + año + " NO es BISIESTO");
        }
        
    }
}
