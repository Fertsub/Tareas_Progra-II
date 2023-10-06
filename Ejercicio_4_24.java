import java.util.Scanner;

public class Ejercicio_4_24{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int aprobados = 0;
        int reprobados = 0;
        int contadorEstudiantes = 1;

        while (contadorEstudiantes <= 10) {
            System.out.print("Escriba el resultado (1 = aprobado, 2 = reprobado): ");
            int resultado;

            // Cambiamos el do-while por un simple while
            while (true) {
                resultado = entrada.nextInt();
                if (resultado == 1 || resultado == 2) {
                    break; // Salimos del bucle si la entrada es válida (1 o 2)
                } else {
                    System.out.println("Valor incorrecto. Introduzca 1 o 2.");
                }
            }

            if (resultado == 1)
                aprobados++;
            else
                reprobados++;

            contadorEstudiantes++;
        }

        System.out.printf("Aprobados: %d%nReprobados: %d%n", aprobados, reprobados);

        if (aprobados > 8)
            System.out.println("Bono para el instructor!");
    }
}