package Tiempo;

public class Tiempo2 {
    private int hora;
    private int minuto;
    private int segundo;

    public Tiempo2(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >= 0 && segundo < 60) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Tiempo no válido.");
        }
    }

    public int obtenerHora() {
        return hora;
    }

    public int obtenerMinuto() {
        return minuto;
    }

    public int obtenerSegundo() {
        return segundo;
    }

    public void establecerHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora;
        } else {
            throw new IllegalArgumentException("Hora no válida.");
        }
    }

    public void establecerMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        } else {
            throw new IllegalArgumentException("Minuto no válido.");
        }
    }

    public void establecerSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        } else {
            throw new IllegalArgumentException("Segundo no válido.");
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}