public class PruebaCuenta {
    public static <CuentaDeAhorros> void main(String[] args) {
        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00);

        CuentaDeAhorros.modificarTasaInteres(0.04);

        for (int i = 0; i < 12; i++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();
            System.out.println("Nuevo saldo de ahorrador1: " + ahorrador1.getSaldoAhorros());
            System.out.println("Nuevo saldo de ahorrador2: " + ahorrador2.getSaldoAhorros());
        }

        CuentaDeAhorros.modificarTasaInteres(0.05);

        for (int i = 0; i < 12; i++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();
            System.out.println("Nuevo saldo de ahorrador1: " + ahorrador1.getSaldoAhorros());
            System.out.println("Nuevo saldo de ahorrador2: " + ahorrador2.getSaldoAhorros());
        }
    }
}