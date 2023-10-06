import java.util.Scanner;
import java.util.InputMismatchException;

public class Ejercicio_4_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1;
        int mayor = Integer.MIN_VALUE;

        while (contador <= 10) {
            try {
                System.out.print("Ingrese un número entero: ");
                int numero = scanner.nextInt();

                if (numero > mayor) {
                    mayor = numero;
                }

                contador++;
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número entero válido.");
                scanner.next(); // Limpia el búfer de entrada para evitar un bucle infinito.
            }
        }

        System.out.println("El número más grande es: " + mayor);
    }
}
