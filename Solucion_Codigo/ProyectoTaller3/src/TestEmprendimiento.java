public class TestEmprendimiento {
    public static void main(String[] args) {

        Emprendimiento emp = new Emprendimiento("Mi Tienda", "1234567890", "Comercio", "Juan Pérez", 
                                               "Loja", "2015-01-01", 15000.0);

        System.out.println("Información inicial:");
        System.out.println(emp.toString());

        emp.actualizarInformacion("Nueva Tienda", "Comercio", "Ana Gómez", "Loja");

        System.out.println("\nInformación actualizada:");
        System.out.println(emp.toString());
    }
}

class Emprendimiento{
    private String nombreComercial;
    private String ruc;
    private String sector;
    private String propietario;
    private String ubicacion;
    private String fechaInicio;  // Formato "yyyy-MM-dd"
    private double capitalInicial;
    
    public Emprendimiento(){
    }
    
    public Emprendimiento(String nombreComercial, String ruc, String sector, String propietario, 
                         String ubicacion, String fechaInicio, double capitalInicial) {
        this.nombreComercial = nombreComercial;
        this.ruc = ruc;
        this.sector = sector;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
        this.fechaInicio = fechaInicio;
        this.capitalInicial = capitalInicial;
    }

    public void actualizarInformacion(String nombreComercial, String sector, String propietario, String ubicacion) {
        this.nombreComercial = nombreComercial;
        this.sector = sector;
        this.propietario = propietario;
        this.ubicacion = ubicacion;
    }

    public int calcularAntiguedad() {
        int anioActual = 2025;
        int anioInicio = Integer.parseInt(this.fechaInicio.substring(0, 4));
        return anioActual - anioInicio;
    }

    public String determinarTamanio() {
        if (this.capitalInicial < 10000) {
            return "Micro";
        } else if (this.capitalInicial >= 10000 && this.capitalInicial < 50000) {
            return "Pequeño";
        } else {
            return "Mediano";
        }
    }

    public String toString() {
        return "Emprendimiento{" +
                "nombreComercial='" + nombreComercial + '\'' +
                ", ruc='" + ruc + '\'' +
                ", sector='" + sector + '\'' +
                ", propietario='" + propietario + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", fechaInicio='" + fechaInicio + '\'' +
                ", capitalInicial=" + capitalInicial +
                ", antigüedad=" + calcularAntiguedad() + " años" +
                ", tamaño='" + determinarTamanio() + '\'' +
                '}';
    }
}