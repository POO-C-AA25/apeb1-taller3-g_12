public class TestCandidatoPresidencial {

    public static void main(String[] args) {

        CandidatoPresidencial cand1 = new CandidatoPresidencial();
        cand1.setNombre("Carlos Pérez");
        cand1.setPartido("Partido A");
        cand1.setEdad(28);
        cand1.setPlanGobierno("Educación y Salud");
        cand1.setNumPropuestas(5);

        System.out.println(">> CANDIDATO 1: ");
        System.out.println(cand1);
        System.out.println("Edad mínima OK? " + cand1.validarEdadMinima());
        System.out.println();

        CandidatoPresidencial cand2 = new CandidatoPresidencial(
            "Ana Gómez",
            42,
            "Partido C",
            "Desarrollo Sostenible",
            8
        );
        System.out.println(">> CANDIDATO 2 :");
        System.out.println(cand2);
        System.out.println("Edad mínima OK? " + cand2.validarEdadMinima());
    }
}

class CandidatoPresidencial {
    public String nombre;
    public int    edad;
    public String partido;
    public String planGobierno;
    public int    numPropuestas;

    public CandidatoPresidencial() { }

    public CandidatoPresidencial(String nombre,
                                 int edad,
                                 String partido,
                                 String planGobierno,
                                 int numPropuestas) {
        this.nombre = nombre;
        this.edad = edad;
        this.partido = partido;
        this.planGobierno = planGobierno;
        this.numPropuestas = numPropuestas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setPartido(String partido) {
        this.partido = partido;
    }
    public void setPlanGobierno(String planGobierno) {
        this.planGobierno = planGobierno;
    }
    public void setNumPropuestas(int numPropuestas) {
        this.numPropuestas = numPropuestas;
    }

    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getPartido() {
        return partido;
    }
    public String getPlanGobierno() {
        return planGobierno;
    }
    public int getNumPropuestas() {
        return numPropuestas;
    }

    public boolean validarEdadMinima() {
        return this.edad >= 35;
    }

    public String toString() {
        return String.format(
            "{Nombre: %s, Edad: %d, Partido: %s, Plan: %s, Propuestas: %d}",
            getNombre(),
            getEdad(),
            getPartido(),
            getPlanGobierno(),
            getNumPropuestas()
        );
    }
}
