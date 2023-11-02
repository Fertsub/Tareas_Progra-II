import java.util.Scanner;

public class Simpletron extends SimpletronOperationCodes {
    public static void main(String[] args) {
        Simpletron simpletron = new Simpletron();
        simpletron.ejecutar();
    }

    private int[] memoria = new int[100];
    private int acumulador;
    private int contadorInstrucciones;
    private int registroInstrucciones;
    private int codigoOperacion;
    private int operando;
    private boolean ejecucion = true;

    public void ejecutar() {
        mensajeBienvenida();
        ejecutarPrograma();
    }

    private void mensajeBienvenida() {
        System.out.println("***            Bienvenido a Simpletron!           ***");
        System.out.println("*** Por favor ingrese su programa, una instrucción ***");
        System.out.println("*** (o palabra de datos) a la vez. Mostraré         ***");
        System.out.println("*** el número de ubicación y un signo de interrogación (?) ***");
        System.out.println("*** Luego, debe escribir la palabra para esa ubicación.   ***");
        System.out.println("*** Ingrese -99999 para detener la entrada del programa.  ***");
    }

    private void ejecutarPrograma() {
        Scanner entradaCodigo = new Scanner(System.in);
        int entradaInstruccion = 0;
        int punteroMemoria = 0;

        do {
            System.out.printf("%02d ? ", punteroMemoria);
            entradaInstruccion = entradaCodigo.nextInt();
            memoria[punteroMemoria] = entradaInstruccion;
            punteroMemoria++;
        } while (entradaInstruccion != -99999);

        System.out.printf("\n%s\n%s\n\n", "*** Carga del programa completa ***",
                "*** Comienza la ejecución del programa ***");

        while (ejecucion) {
            cargarCodigo();
            operaciones(codigoOperacion, operando);
        }

        System.exit(0);

        entradaCodigo.close();
    }

    private void cargarCodigo() {
        registroInstrucciones = memoria[contadorInstrucciones];
        codigoOperacion = registroInstrucciones / 100;
        operando = registroInstrucciones % 100;
        registroInstrucciones = memoria[contadorInstrucciones];
        codigoOperacion = registroInstrucciones / 100;
        operando = registroInstrucciones % 100;
    }

    private void operaciones(int codigoOperacion, int operando) {
        boolean bifurcacion = false;

        switch (codigoOperacion) {

            case LEE:
                Scanner lectura = new Scanner(System.in);
                System.out.print("Ingrese un número: ");
                int numero = lectura.nextInt();
                memoria[operando] = numero;
                break;

            case ESCRIBE:
                System.out.println(memoria[operando]);
                break;

            case CARGA:
                acumulador = memoria[operando];
                break;

            case ALMACENA:
                memoria[operando] = acumulador;
                break;

            case SUMA:
                acumulador += memoria[operando];
                break;

            case RESTA:
                acumulador -= memoria[operando];
                break;

            case DIVIDE:
                if (memoria[operando] == 0) {
                    System.out.printf("\n%s\n%s\n", "*** NO SE PUEDE DIVIDIR POR CERO ***", "*** SALIENDO AHORA ***");
                    System.exit(-1);
                } else {
                    acumulador /= memoria[operando];
                    break;
                }

            case MULTIPLICA:
                acumulador *= memoria[operando];
                break;

            case BIFURCA:
                contadorInstrucciones = operando;
                bifurcacion = true;
                break;

            case BIFURCANEG:
                if (acumulador < 0) {
                    contadorInstrucciones = operando;
                    bifurcacion = true;
                }
                break;

            case BIFURCACERO:
                if (acumulador == 0) {
                    contadorInstrucciones = operando;
                    bifurcacion = true;
                }
                break;

            case ALTO:
                System.out.println("Procesamiento completo...");
                ejecucion = false;
                volcarMemoria();
                break;
        }

        if (!bifurcacion) {
            contadorInstrucciones++;
        }
    }

    private void volcarMemoria() {
        int decenas, unidades;

        System.out.printf("\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\t%02d\n", 0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        for (decenas = 0; decenas < 100; decenas += 10) {
            System.out.printf("%02d\t", decenas);
            for (unidades = 0; unidades < 10; unidades++) {
                System.out.printf("%04d\t", memoria[decenas + unidades]);
            }
            System.out.println();
        }
    }
}
