import java.util.Scanner;

public class Ejercicio_4_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalKilometros = 0;
        int totalLitros = 0;

        System.out.println("Ingrese los kilómetros conducidos y los litros usados (Ingrese -1 para terminar):");

        int contadorViajes = 0;

        while (true) {
            System.out.print("Kilómetros conducidos (-1 para terminar): ");
            int kilometros = scanner.nextInt();

            if (kilometros == -1) {
                break; // Salir del bucle si se ingresa -1.
            }

            System.out.print("Litros usados: ");
            int litros = scanner.nextInt();

            double kilometrosPorLitro = (double) kilometros / litros;
            System.out.printf("Kilómetros por litro en este viaje: %.2f%n", kilometrosPorLitro);

            totalKilometros += kilometros;
            totalLitros += litros;
            contadorViajes++;
        }

        if (contadorViajes > 0 && totalLitros > 0) {
            double promedioKilometrosPorLitro = (double) totalKilometros / totalLitros;
            System.out.printf("Kilómetros por litro en todos los viajes: %.2f%n", promedioKilometrosPorLitro);
        } else {
            System.out.println("No se registraron viajes o no se ingresaron litros.");
        }
        scanner.close();
    }
}
