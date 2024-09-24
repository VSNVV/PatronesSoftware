package es.uah.labpat1.patfun01;

public class Cliente {

    private static IPago iPago;

    public static void main(String args[]) {
        Cuenta cuenta = new Cuenta(1000);
        System.out.println(cuenta.toString());
        iPago = new Cheque(cuenta);
        iPago.cantidad(10);
        System.out.println(cuenta.toString());
    }
}
