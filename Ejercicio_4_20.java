import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio_4_20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int empleado = 1; empleado <= 3; empleado++) {
            System.out.println("Empleado " + empleado);

            try {
                System.out.print("Ingrese el número de horas trabajadas: ");
                int horasTrabajadas = scanner.nextInt();

                System.out.print("Ingrese la tarifa por horas: ");
                double tarifaPorHoras = scanner.nextDouble();

                double sueldoBruto;

                if (horasTrabajadas <= 40) {
                    sueldoBruto = horasTrabajadas * tarifaPorHoras;
                } else {
                    int horasNormales = 40;
                    int horasExtras = horasTrabajadas - 40;
                    sueldoBruto = (horasNormales * tarifaPorHoras) + (horasExtras * tarifaPorHoras * 1.5);
                }

                System.out.println("Sueldo bruto del empleado " + empleado + ": $" + sueldoBruto);
                System.out.println("------------------------");
                
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un valor numérico válido.");
                scanner.next(); // Limpiar el búfer de entrada para evitar un bucle infinito.
                empleado--; // Restablecer el contador para volver a ingresar los datos.
                scanner.close();
            }
        }
    }
}
