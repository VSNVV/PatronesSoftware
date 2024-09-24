package es.uah.labpat1.patfun01;

public class Cuenta implements IPago {

    private double importe;

    public Cuenta(float importeInicial) {
        importe = importeInicial;
    }

    @Override
    public void cantidad(double pago) {
        System.out.println("Descontando " + pago + "€ a la cuenta");
        this.importe = this.importe - pago;
    }

    @Override
    public String toString() {
        return ("Importe en cuenta: " + importe);
    }

}
