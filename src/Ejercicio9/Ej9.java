/*
Escribe una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima
el diámetro de la circunferencia y el área del círculo mediante el uso del valor de punto flotante
3.14159 para PI. También puede utilizar la constante predefinida Math.PI para el valor. Esta
constante es más precisa que el valor 3.14159. La clase Math se define en el paquete java.lang. Las
clases en este paquete se importan de manera automática, por lo que no necesita importar la clase
Math mediante la instrucción import para usarla. Use las siguientes fórmulas (r es el radio):
diámetro = 2 r
circunferencia = 2 * PI * r
área = PI * r2
 */
package Ejercicio9;

import java.util.Scanner;

public class Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Le pido al usuario el radio
        System.out.println("Ingrese el radio de un circulo: ");
        int radio = sc.nextInt();
        //Calculo el diametro del circulo
        int diametro = 2 * radio;
        //Calculo la circuferencia del circulo
        double circunferencia = 2 * Math.PI * radio;
        //Calculo el area del circulo
        double area = Math.PI * Math.pow(radio, 2);
        
        //Muestro por pantalla los resultados
        System.out.println("El circulo de radio " + radio + " tiene como: ");
        System.out.println("Diametro: " + diametro);
        System.out.println("Circunferencia: " + String.format("%.2f", circunferencia));
        System.out.println("Area: " + String.format("%.2f", area));
        
    }
}
