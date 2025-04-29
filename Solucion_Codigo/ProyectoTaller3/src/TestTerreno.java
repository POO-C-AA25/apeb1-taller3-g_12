public class TestTerreno {

    public static Terreno terrenox = new Terreno();

    public static void main(String[] args) {
       
        double ancho = (Math.random() * 10) + 1;
        double largo = (Math.random() * 10) + 1;
        double valorMetro = (Math.random() * 10) + 1;
        
        System.out.println("FORMA LARGA: ");
        
        terrenox.setAncho(ancho);
        terrenox.setLargo(largo);
        terrenox.setValorMetro(valorMetro);

        terrenox.calcularArea();
        terrenox.calcularCostoTerreno();

        System.out.println("TerrenoX : " + terrenox.toString());
        System.out.println("FORMA EFICIENTE: ");

        Terreno miTerreno = new Terreno(2, 3, 3);
        miTerreno.calcularArea();
        miTerreno.calcularCostoTerreno();

        System.out.println("Terreno mio: " + miTerreno.toString());
    }
}

class Terreno {
    public double ancho;
    public double largo;
    public double valorMetro;
    public double area;
    public double costoTerreno;
    
    public Terreno(){
    }
   
    public Terreno(double ancho, double largo, double valorMetro) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetro = valorMetro;
    }

 
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetro(double valorMetro) {
        this.valorMetro = valorMetro;
    }

    public double getAncho() {
        return this.ancho;
    }

    public double getLargo() {
        return this.largo;
    }

    public double getValorMetro() {
        return this.valorMetro;
    }

    public double getArea() {
        return this.area;
    }

    public double getCostoTerreno() {
        return this.costoTerreno;
    }

   
    public void calcularArea() {
        this.area = this.ancho * this.largo;
    }

    public void calcularCostoTerreno() {
        this.costoTerreno = this.area * this.valorMetro;
    }

    public String toString() {
        return "{Ancho: " + this.getAncho() + ", " +
               "Largo: " + this.getLargo() + ", " +
               "ValorMetro: " + this.getValorMetro() + ", " +
               "Area: " + this.getArea() + ", " +
               "CostoTerreno: " + this.getCostoTerreno() + "}";
    }
}