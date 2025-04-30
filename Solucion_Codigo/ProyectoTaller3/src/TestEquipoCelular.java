public class TestEquipoCelular {
    public static void main(String[] args) {
        EquipoCelular equipo1 = new EquipoCelular("Android", 6.5, 1000.0, 16.0, "00:1B:44:11:3A:B7", "123456789012345");
        System.out.println("Equipo 1: " + equipo1.toString());

        EquipoCelular equipo2 = new EquipoCelular("iOS", 6.1, 1200.0, 16.0, "00:1B:44:11:3A:B8", "543210987654321");
        System.out.println("Equipo 2: " + equipo2.toString());
    }
}

class EquipoCelular {
    public String sistemaOperativo;
    public double tamanoPantalla;
    public double costoInicial;
    public double ivaPorcentaje;
    public double ivaCostoInicial;
    public double costoFinal;
    public String direccionMAC;
    public String informacionIMEI;
    
    public EquipoCelular(){
    }

    public EquipoCelular(String sistemaOperativo, double tamanoPantalla, double costoInicial, 
                         double ivaPorcentaje, String direccionMAC, String informacionIMEI) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanoPantalla = tamanoPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.direccionMAC = direccionMAC;
        this.informacionIMEI = informacionIMEI;
        this.calcularIvaCostoInicial();
        this.calcularCostoFinal();
    }

    public void calcularIvaCostoInicial() {
        this.ivaCostoInicial = this.costoInicial * (this.ivaPorcentaje / 100);
    }

    public void calcularCostoFinal() {
        this.costoFinal = this.costoInicial + this.ivaCostoInicial;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public void setTamanoPantalla(double tamanoPantalla) {
        this.tamanoPantalla = tamanoPantalla;
    }

    public void setCostoInicial(double costoInicial) {
        this.costoInicial = costoInicial;
        this.calcularIvaCostoInicial();
        this.calcularCostoFinal();
    }

    public void setIvaPorcentaje(double ivaPorcentaje) {
        this.ivaPorcentaje = ivaPorcentaje;
        this.calcularIvaCostoInicial();
        this.calcularCostoFinal();
    }

    public void setDireccionMAC(String direccionMAC) {
        this.direccionMAC = direccionMAC;
    }

    public void setInformacionIMEI(String informacionIMEI) {
        this.informacionIMEI = informacionIMEI;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public double getTamanoPantalla() {
        return tamanoPantalla;
    }

    public double getCostoInicial() {
        return costoInicial;
    }

    public double getIvaPorcentaje() {
        return ivaPorcentaje;
    }

    public double getIvaCostoInicial() {
        return ivaCostoInicial;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public String getDireccionMAC() {
        return direccionMAC;
    }

    public String getInformacionIMEI() {
        return informacionIMEI;
    }

    @Override
    public String toString() {
        return "EquipoCelular [sistemaOperativo=" + sistemaOperativo + ", tamanoPantalla=" + tamanoPantalla +
               ", costoInicial=" + costoInicial + ", ivaPorcentaje=" + ivaPorcentaje + ", ivaCostoInicial=" + ivaCostoInicial +
               ", costoFinal=" + costoFinal + ", direccionMAC=" + direccionMAC + ", informacionIMEI=" + informacionIMEI + "]";
    }
}