public class Ejercicio_4_22 {
    public static void main(String[] args) {
        // Imprimir encabezado de la tabla
        System.out.println("N\t10*N\t100*N\t1000*N");

        // Utilizar un bucle for para imprimir los valores
        for (int n = 1; n <= 5; n++) {
            int diezN = 10 * n;
            int cienN = 100 * n;
            int milN = 1000 * n;

            System.out.printf("%d\t%d\t%d\t%d%n", n, diezN, cienN, milN);
        }
    }
}
