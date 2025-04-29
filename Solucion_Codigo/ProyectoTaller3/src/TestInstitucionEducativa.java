public class TestInstitucionEducativa {
    public static void main(String[] args) {

        InstitucionEducativa institucion1 = new InstitucionEducativa(
            "Universidad XYZ",
            "Universidad",
            1000,
            50,
            2,
            5000.0
        );
        
        System.out.println("Institución 1:\n" + institucion1.toString());

        InstitucionEducativa institucion2 = new InstitucionEducativa();
        institucion2.setNombre("Colegio ABC");
        institucion2.setTipo("Colegio");
        institucion2.setNumeroAlumnos(500);
        institucion2.setNumeroDocentes(30);
        institucion2.setNumeroSedes(1);
        institucion2.setGastosProyectadosPorEstudiante(3000.0);
        System.out.println("\nInstitución 2:\n" + institucion2.toString());
    }
}

class InstitucionEducativa {
    private String nombre;
    private String tipo;
    private int numeroAlumnos;
    private int numeroDocentes;
    private int numeroSedes;
    private double gastosProyectadosPorEstudiante;
    private double presupuesto;

    public InstitucionEducativa() {
    }

    public InstitucionEducativa(String nombre, String tipo, int numeroAlumnos, int numeroDocentes, int numeroSedes, double gastosProyectadosPorEstudiante) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.numeroAlumnos = numeroAlumnos;
        this.numeroDocentes = numeroDocentes;
        this.numeroSedes = numeroSedes;
        this.gastosProyectadosPorEstudiante = gastosProyectadosPorEstudiante;
        this.calcularPresupuesto();
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numeroAlumnos = numeroAlumnos;
        this.calcularPresupuesto();
    }

    public void setNumeroDocentes(int numeroDocentes) {
        this.numeroDocentes = numeroDocentes;
    }

    public void setNumeroSedes(int numeroSedes) {
        this.numeroSedes = numeroSedes;
    }

    public void setGastosProyectadosPorEstudiante(double gastosProyectadosPorEstudiante) {
        this.gastosProyectadosPorEstudiante = gastosProyectadosPorEstudiante;
        this.calcularPresupuesto();
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getNumeroAlumnos() {
        return numeroAlumnos;
    }

    public int getNumeroDocentes() {
        return numeroDocentes;
    }

    public int getNumeroSedes() {
        return numeroSedes;
    }

    public double getGastosProyectadosPorEstudiante() {
        return gastosProyectadosPorEstudiante;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void calcularPresupuesto() {
        this.presupuesto = this.numeroAlumnos * this.gastosProyectadosPorEstudiante;
    }

    public String toString() {
        return "Institución Educativa:\n" +
               "Nombre: " + nombre + "\n" +
               "Tipo: " + tipo + "\n" +
               "Número de Alumnos: " + numeroAlumnos + "\n" +
               "Número de Docentes: " + numeroDocentes + "\n" +
               "Número de Sedes: " + numeroSedes + "\n" +
               "Gastos Proyectados por Estudiante: " + gastosProyectadosPorEstudiante + "\n" +
               "Presupuesto: " + presupuesto;
    }
}    