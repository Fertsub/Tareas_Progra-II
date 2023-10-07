import java.util.Scanner;

public class Ejercicio_4_18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Ingrese el número de cuenta (o -1 para salir): ");
            int numeroCuenta = scanner.nextInt();

            if (numeroCuenta == -1) {
                break;
            }

            System.out.print("Ingrese el saldo al inicio del mes: ");
            double saldoInicial = scanner.nextDouble();

            System.out.print("Ingrese el total de artículos cargados por el cliente en el mes: ");
            double cargos = scanner.nextDouble();

            System.out.print("Ingrese el total de créditos aplicados a la cuenta del cliente en el mes: ");
            double creditos = scanner.nextDouble();

            System.out.print("Ingrese el límite de crédito permitido: ");
            double limiteCredito = scanner.nextDouble();

            double nuevoSaldo = saldoInicial + cargos - creditos;

            System.out.printf("Número de cuenta: %d%n", numeroCuenta);
            System.out.printf("Saldo al inicio del mes: %.2f%n", saldoInicial);
            System.out.printf("Total de artículos cargados: %.2f%n", cargos);
            System.out.printf("Total de créditos aplicados: %.2f%n", creditos);
            System.out.printf("Límite de crédito permitido: %.2f%n", limiteCredito);
            System.out.printf("Nuevo saldo: %.2f%n", nuevoSaldo);
            

            if (nuevoSaldo > limiteCredito) {
                System.out.println("El cliente se ha excedido del límite de crédito.");
            }

            System.out.println("------------------------------");
            scanner.close();
        }
    }
}
