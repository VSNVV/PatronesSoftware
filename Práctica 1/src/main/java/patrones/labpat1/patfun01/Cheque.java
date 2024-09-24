package patrones.labpat1.patfun01;

public class Cheque implements IPago {

    private Cuenta cuenta;

    public Cheque() {
    }

    public Cheque(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    @Override
    public void cantidad(double importe) {
        cuenta.cantidad(importe);
    }

}
