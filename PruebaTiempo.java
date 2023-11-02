package Tiempo;

public class PruebaTiempo {
    public static void main(String[] args) {
        Tiempo2 t = new Tiempo2(13, 27, 35);
        System.out.println(t); // Muestra 13:27:35

        t.establecerHora(9);
        t.establecerMinuto(30);
        t.establecerSegundo(45);
        System.out.println(t); // Muestra 09:30:45
    }
}