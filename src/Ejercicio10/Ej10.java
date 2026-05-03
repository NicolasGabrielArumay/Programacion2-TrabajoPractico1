/*
Escribe una aplicación que determine el sueldo bruto para cada uno de cinco empleados. La
empresa paga la cuota normal en las primeras 40 horas de trabajo de cada empleado, y cuota y
media en todas las horas trabajadas que excedan de 40. Usted recibe una lista de los empleados de
la empresa, el número de horas que trabajó cada uno la semana pasada y la tarifa por horas de cada
empleado. Su programa debe recibir como entrada esta información para cada empleado, debe
determinar y mostrar el sueldo bruto de cada trabajador.
 */
package Ejercicio10;

import java.util.Scanner;
public class Ej10 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nEmpleado " + i);

            System.out.print("Horas trabajadas: ");
            double horas = sc.nextDouble();

            System.out.print("Tarifa por hora: ");
            double tarifa = sc.nextDouble();

            double sueldo;

            if (horas <= 40) {
                sueldo = horas * tarifa;
            } else {
                double horasExtra = horas - 40;
                sueldo = (40 * tarifa) + (horasExtra * tarifa * 1.5);
            }

            System.out.println("Sueldo bruto: " + String.format("%.2f", sueldo));
        }
    }
}
