public class TestEquivalenteHora {
    public static void main(String[] args) {
        
        EquivalenteHora hora1 = new EquivalenteHora(24);
        System.out.println("Equivalente de 24 horas:");
        System.out.println(hora1.toString());

        EquivalenteHora hora2 = new EquivalenteHora(12.5);
        System.out.println("\nEquivalente de 12.5 horas:");
        System.out.println(hora2.toString());
    }
}

class EquivalenteHora{
    public double horas;
    public double minutos;
    public double segundos;
    public double dias;
    
    public EquivalenteHora(){
    }
    
    public EquivalenteHora(double horas) {
        this.horas = horas;
        calcularEquivalentes();
    }
    
    public void calcularEquivalentes() {
        this.minutos = this.horas * 60;
        this.segundos = this.horas * 3600;
        this.dias = this.horas / 24;
    }
    
    public String toString() {
        return "Horas: " + this.horas + "\n" +
               "Minutos: " + this.minutos + "\n" +
               "Segundos: " + this.segundos + "\n" +
               "Días: " + this.dias;
    }
}