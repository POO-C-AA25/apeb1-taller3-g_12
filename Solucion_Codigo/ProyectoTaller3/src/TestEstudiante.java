public class TestEstudiante {
    public static void main(String[] args) {

        double nota1 = Math.random() * 10; 
        double nota2 = Math.random() * 10;
        double nota3 = Math.random() * 10;

        Estudiante estudiante1 = new Estudiante("Juan Perez", nota1, nota2, nota3);
        System.out.println("Estudiante 1: " + estudiante1.toString());

        double nota4 = Math.random() * 10;
        double nota5 = Math.random() * 10;
        double nota6 = Math.random() * 10;

        Estudiante estudiante2 = new Estudiante("Maria Lopez", nota4, nota5, nota6);
        System.out.println("Estudiante 2: " + estudiante2.toString());
    }
}

class Estudiante{
    public String nombre;
    public double notaMateria1;
    public double notaMateria2;
    public double notaMateria3;
    public double promedio;
    public String estado;
    
    public Estudiante(){
    }

    public Estudiante(String nombre, double notaMateria1, double notaMateria2, double notaMateria3) {
        this.nombre = nombre;
        this.notaMateria1 = notaMateria1;
        this.notaMateria2 = notaMateria2;
        this.notaMateria3 = notaMateria3;
        this.calcularPromedio();
        this.determinarEstado();
    }

    public void calcularPromedio() {
        this.promedio = (this.notaMateria1 + this.notaMateria2 + this.notaMateria3) / 3;
    }

    public void determinarEstado() {
        if (this.promedio >= 6.5) {
            this.estado = "Aprobado";
        } else {
            this.estado = "Reprobado";
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotaMateria1(double notaMateria1) {
        this.notaMateria1 = notaMateria1;
        this.calcularPromedio();
        this.determinarEstado();
    }

    public void setNotaMateria2(double notaMateria2) {
        this.notaMateria2 = notaMateria2;
        this.calcularPromedio();
        this.determinarEstado();
    }

    public void setNotaMateria3(double notaMateria3) {
        this.notaMateria3 = notaMateria3;
        this.calcularPromedio();
        this.determinarEstado();
    }

    public String getNombre() {
        return nombre;
    }

    public double getNotaMateria1() {
        return notaMateria1;
    }

    public double getNotaMateria2() {
        return notaMateria2;
    }

    public double getNotaMateria3() {
        return notaMateria3;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getEstado() {
        return estado;
    }

    public String toString() {
        return "Estudiante [nombre=" + nombre + ", notaMateria1=" + notaMateria1 + ", notaMateria2=" + notaMateria2 +
               ", notaMateria3=" + notaMateria3 + ", promedio=" + promedio + ", estado=" + estado + "]";
    }
}