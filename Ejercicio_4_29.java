import java.util.Scanner;

public class Ejercicio_4_29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el tamaño del lado del cuadrado (1-20): ");
        int lado = scanner.nextInt();

        if (lado >= 1 && lado <= 20) {
            for (int i = 1; i <= lado; i++) {
                for (int j = 1; j <= lado; j++) {
                    if (i == 1 || i == lado || j == 1 || j == lado) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  "); // Espacio en blanco para el interior del cuadrado
                    }
                }
                System.out.println(); // Nueva línea para la siguiente fila
            }
        } else {
            System.out.println("Tamaño del lado fuera del rango permitido.");
        }

        scanner.close();
    }
}
