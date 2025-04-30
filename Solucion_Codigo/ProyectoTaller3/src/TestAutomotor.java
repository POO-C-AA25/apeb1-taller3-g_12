import java.time.LocalDate;

public class TestAutomotor {
    public static void main(String[] args) {
        Automotor auto1 = new Automotor("1234567890", "Toyota", 2010, 20000.0);
        System.out.println("Automotor 1: " + auto1.toString());

        Automotor auto2 = new Automotor("0987654321", "Honda", 2015, 15000.0);
        System.out.println("Automotor 2: " + auto2.toString());
    }
}

class Automotor {
    public String cedulaDueno;
    public String marcaVehiculo;
    public int anioFabricacion;
    public double valorVehiculo;
    public double valorMatricula;
    
    public Automotor(){
    }

    public Automotor(String cedulaDueno, String marcaVehiculo, int anioFabricacion, double valorVehiculo) {
        this.cedulaDueno = cedulaDueno;
        this.marcaVehiculo = marcaVehiculo;
        this.anioFabricacion = anioFabricacion;
        this.valorVehiculo = valorVehiculo;
        this.calcularValorMatricula();
    }

    public void calcularValorMatricula() {
        int anioActual = LocalDate.now().getYear();
        int antiguedad = anioActual - this.anioFabricacion;
        this.valorMatricula = (0.002 / 100) * this.valorVehiculo * antiguedad;
    }

    public void setCedulaDueno(String cedulaDueno) {
        this.cedulaDueno = cedulaDueno;
    }

    public void setMarcaVehiculo(String marcaVehiculo) {
        this.marcaVehiculo = marcaVehiculo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
        this.calcularValorMatricula();
    }

    public void setValorVehiculo(double valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
        this.calcularValorMatricula();
    }

    public String getCedulaDueno() {
        return cedulaDueno;
    }

    public String getMarcaVehiculo() {
        return marcaVehiculo;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public double getValorVehiculo() {
        return valorVehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    public String toString() {
        return "Automotor [cedulaDueno=" + cedulaDueno + ", marcaVehiculo=" + marcaVehiculo +
               ", anioFabricacion=" + anioFabricacion + ", valorVehiculo=" + valorVehiculo +
               ", valorMatricula=" + valorMatricula + "]";
    }
}