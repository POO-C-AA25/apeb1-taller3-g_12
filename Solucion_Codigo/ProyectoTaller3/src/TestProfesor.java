public class TestProfesor{
    public static void main(String[] args) {

        Profesor profesor1 = new Profesor("Juan", "Perez", 1000.0, "1234567890");
        System.out.println("Profesor 1: " + profesor1.toString());

        Profesor profesor2 = new Profesor("Maria", "Lopez", 1500.0, "0987654321");
        System.out.println("Profesor 2: " + profesor2.toString());
    }
}

class Profesor {
    public String nombre;
    public String apellido;
    public double sueldoBasico;
    public double sueldoTotal;
    public String cedula;
    
    public Profesor(){
    }
    
    public Profesor(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
        this.calcularSueldoTotal();
    }

    public void calcularSueldoTotal() {
        this.sueldoTotal = this.sueldoBasico * 1.20;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
        this.calcularSueldoTotal();
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getSueldoTotal() {
        return sueldoTotal;
    }

    public String getCedula() {
        return cedula;
    }
    
    public String toString() {
        return "Profesor [nombre=" + nombre + ", apellido=" + apellido + ", sueldoBasico=" + sueldoBasico +
               ", sueldoTotal=" + sueldoTotal + ", cedula=" + cedula + "]";
    }
}