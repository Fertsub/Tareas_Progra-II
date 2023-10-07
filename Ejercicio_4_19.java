import java.util.Scanner;

public class Ejercicio_4_19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Definir los valores de los artículos
        double valorArticulo1 = 239.99;
        double valorArticulo2 = 129.75;
        double valorArticulo3 = 99.95;
        double valorArticulo4 = 350.89;

        System.out.print("Ingrese la cantidad de Artículo 1 vendidos: ");
        int cantidadArticulo1 = scanner.nextInt();

        System.out.print("Ingrese la cantidad de Artículo 2 vendidos: ");
        int cantidadArticulo2 = scanner.nextInt();

        System.out.print("Ingrese la cantidad de Artículo 3 vendidos: ");
        int cantidadArticulo3 = scanner.nextInt();

        System.out.print("Ingrese la cantidad de Artículo 4 vendidos: ");
        int cantidadArticulo4 = scanner.nextInt();

        // Calcular los ingresos por artículo y el ingreso total
        double ingresosArticulo1 = cantidadArticulo1 * valorArticulo1;
        double ingresosArticulo2 = cantidadArticulo2 * valorArticulo2;
        double ingresosArticulo3 = cantidadArticulo3 * valorArticulo3;
        double ingresosArticulo4 = cantidadArticulo4 * valorArticulo4;
        double ingresosTotales = ingresosArticulo1 + ingresosArticulo2 + ingresosArticulo3 + ingresosArticulo4;

        // Calcular las comisiones y agregarlas a los ingresos totales
        double comision = ingresosTotales * 0.09;
        ingresosTotales += comision;

        System.out.printf("Ingresos totales del vendedor: %.2f%n", ingresosTotales);
        scanner.close();
    }
}

