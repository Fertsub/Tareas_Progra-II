import java.util.Scanner;

public class Ejercicio_4_23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maximo1 = Integer.MIN_VALUE; // Inicializamos con el valor mínimo posible
        int maximo2 = Integer.MIN_VALUE; // Inicializamos con el valor mínimo posible

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese un número: ");
            int numero = scanner.nextInt();

            if (numero > maximo1) {
                maximo2 = maximo1; // Movemos el antiguo valor máximo a la segunda posición
                maximo1 = numero; // Asignamos el nuevo valor máximo
            } else if (numero > maximo2) {
                maximo2 = numero; // Asignamos el nuevo valor máximo
            }
        }

        System.out.printf("El primer valor máximo es: %d%n", maximo1);
        System.out.printf("El segundo valor máximo es: %d%n", maximo2);
        scanner.close();
    }
}
