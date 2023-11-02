package Rectangulo;

class Rectangulo {
    private double longitud;
    private double anchura;

    public Rectangulo() {
        this.longitud = 1;
        this.anchura = 1;
    }

    public Rectangulo(double longitud, double anchura) {
        this.longitud = longitud;
        this.anchura = anchura;
    }

    public double obtenerLongitud() {
        return this.longitud;
    }

    public double obtenerAnchura() {
        return this.anchura;
    }

    public void establecerLongitud(double longitud) {
        if (longitud > 0.0 && longitud < 20.0) {
            this.longitud = longitud;
        } else {
            System.out.println("Longitud no válida.");
        }
    }

    public void establecerAnchura(double anchura) {
        if (anchura > 0.0 && anchura < 20.0) {
            this.anchura = anchura;
        } else {
            System.out.println("Anchura no válida.");
        }
    }

    public double calcularPerimetro() {
        return 2 * (this.longitud + this.anchura);
    }

    public double calcularArea() {
        return this.longitud * this.anchura;
    }
}

