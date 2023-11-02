class CuentaDeAhorros {
    static double tasaInteresAnual;
    private double saldoAhorros;

    public CuentaDeAhorros(double saldoAhorros) {
        this.saldoAhorros = saldoAhorros;
    }

    public double calcularInteresMensual() {
        double interesMensual = saldoAhorros * tasaInteresAnual / 12;
        saldoAhorros += interesMensual;
        return interesMensual;
    }

    public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }

    public double getSaldoAhorros() {
        return saldoAhorros;
    }
}

