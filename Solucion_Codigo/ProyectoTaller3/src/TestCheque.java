import java.util.Random;

public class TestCheque {
    public static void main(String[] args) {

        Cheque cheque1 = new Cheque();
        System.out.println("Cheque 1 (datos aleatorios):");
        System.out.println(cheque1.toString());

        Cheque cheque2 = new Cheque("Luis Rodriguez", "Banco del Pacifico", 5000.0);
        System.out.println("\nCheque 2 (datos específicos):");
        System.out.println(cheque2.toString());
    }
}

class Cheque {
    private String nombreCliente;
    private String nombreBanco;
    private double valorCheque;
    private double comisionBanco;

    public Cheque() {
        this.nombreCliente = generarNombreAleatorio();
        this.nombreBanco = generarBancoAleatorio();
        this.valorCheque = generarValorAleatorio();
        calcularComision();
    }

    public Cheque(String nombreCliente, String nombreBanco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = nombreBanco;
        this.valorCheque = valorCheque;
        calcularComision();
    }

    public void calcularComision() {
        this.comisionBanco = this.valorCheque * 0.00003;  // 0.003% del valor del cheque
    }

    private String generarNombreAleatorio() {
        String[] nombres = {"Juan Perez", "Maria Lopez", "Carlos Garcia", "Ana Martinez"};
        Random random = new Random();
        return nombres[random.nextInt(nombres.length)];
    }

    private String generarBancoAleatorio() {
        String[] bancos = {"Banco del Austro", "Banco de Guayaquil", "Banco Pichincha", "Banco Bolivariano"};
        Random random = new Random();
        return bancos[random.nextInt(bancos.length)];
    }

    private double generarValorAleatorio() {
        Random random = new Random();
        return 1000 + (random.nextDouble() * 9000);  // Valores entre 1000 y 10000
    }

    public String toString() {
        return "Cheque:\n" +
               "Nombre del Cliente: " + nombreCliente + "\n" +
               "Nombre del Banco: " + nombreBanco + "\n" +
               "Valor del Cheque: " + valorCheque + "\n" +
               "Comisión del Banco: " + comisionBanco;
    }
}