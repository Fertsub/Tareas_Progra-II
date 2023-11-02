package Rectangulo;

import java.util.Scanner;

public class PruebaRectangulo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Rectangulo rectangulo = new Rectangulo();

            System.out.println("Ingrese la longitud:");
            rectangulo.establecerLongitud(scanner.nextDouble());

            System.out.println("Ingrese la anchura:");
            rectangulo.establecerAnchura(scanner.nextDouble());

            System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
            System.out.println("El área del rectángulo es: " + rectangulo.calcularArea());
        }

    }
}
