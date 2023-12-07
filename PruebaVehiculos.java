class Vehiculo{
    private String marca;
    private int cantidadRuedas;

    public Vehiculo(String marca, int cantidadRuedas){
        this.marca= marca;
        this.cantidadRuedas= cantidadRuedas;
    }

    public String getMarca(){
        return marca;
    }

    public int getcantidadRuedas(){
        return cantidadRuedas;
    }
}

class Motocicleta extends Vehiculo{
    public Motocicleta(String marca, int cantidadRuedas){
        super(marca,(cantidadRuedas==4)?4:2);
    }    
}

class Turismo extends Vehiculo{
    public Turismo(String marca){
        super(marca,4);
    }
    
}

class Conductor{
    private String Nombre;

    public Conductor(String Nombre){
        this.Nombre= Nombre;
    }

    public void conducir(Vehiculo vehiculo){
        System.out.println(Nombre + " está conduciendo un vehículo de marca "+ vehiculo.getMarca());
    }
}

public class PruebaVehiculos{
    public static void main(String[] args){
        Motocicleta moto1= new Motocicleta("Honda",2);
        Motocicleta moto2= new Motocicleta("Suzuki",4);
        Turismo turismo1= new Turismo("Toyota");
        Turismo turismo2= new Turismo("Ford");
        Turismo turismo3= new Turismo("Nissan");

        Conductor motorista1= new Conductor("Jorge");
        Conductor motorista2= new Conductor("Mario");

    motorista1.conducir(moto1);
    motorista2.conducir(turismo3);

    System.out.println("Marcas de motocicletas: "+ moto1.getMarca() + ", "+ moto2.getMarca());
    System.out.println("Marcas de turismos: "+ turismo1.getMarca() + ", "+ turismo2.getMarca() + ", "+ turismo3.getMarca());

    System.out.println("Cantidad de ruedas de motocicletas: "+ moto1.getcantidadRuedas() + ", "+ moto2.getcantidadRuedas());
    System.out.println("Cantidad de ruedas de turismos: "+ turismo1.getcantidadRuedas() + ", "+ turismo2.getcantidadRuedas() + ", "+ turismo3.getcantidadRuedas());
    }  
}