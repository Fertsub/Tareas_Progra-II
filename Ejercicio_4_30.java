import java.util.Scanner;

public class Ejercicio_4_30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numero = 0;

        // Solicitar al usuario un número de cinco dígitos y asegurarse de que sea válido
        while (true) {
            System.out.print("Ingrese un número de cinco dígitos: ");
            numero = scanner.nextInt();

            if (numero >= 10000 && numero <= 99999) {
                break; // Salir del bucle si es un número de cinco dígitos válido
            } else {
                System.out.println("Número no válido. Intente de nuevo.");
            }
        }

        // Convertir el número a una cadena para facilitar la comparación
        String numeroStr = String.valueOf(numero);

        // Verificar si es un palíndromo
        if (esPalindromo(numeroStr)) {
            System.out.println("El número " + numero + " es un palíndromo.");
        } else {
            System.out.println("El número " + numero + " no es un palíndromo.");
        }

        scanner.close();
    }

    // Función para verificar si una cadena es un palíndromo
    public static boolean esPalindromo(String cadena) {
        int longitud = cadena.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(longitud - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
