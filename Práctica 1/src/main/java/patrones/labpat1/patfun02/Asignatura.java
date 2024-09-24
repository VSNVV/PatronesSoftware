package patrones.labpat1.patfun02;

public class Asignatura {

    private String nombre;
    private int creditos;
    private double precioCredito;
    
    public Asignatura(String nombre, int creditos) {
        this.nombre = nombre;
        this.creditos = creditos;
    }   
    
    public Asignatura(String nombre, int creditos, double precioCredito) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.precioCredito = precioCredito;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public double getPrecioCredito() {
        return precioCredito;
    }
 }
