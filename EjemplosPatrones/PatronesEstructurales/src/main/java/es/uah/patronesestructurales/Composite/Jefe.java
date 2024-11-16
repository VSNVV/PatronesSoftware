package es.uah.patronesestructurales.Composite;

import java.util.ArrayList;

/**
 * Compuesto. Jefe con subordinados.
 */
public class Jefe extends Trabajador {

    /**
     * Lista de subordinados.
     */
    private ArrayList<Trabajador> subordinados;

    /**
     * Constructor.
     *
     * @param puesto Puesto que ocupa el trabajador.
     * @param salario Salario del trabajador.
     */
    public Jefe(String puesto, double salario) {
        super(puesto, salario);
        subordinados = new ArrayList<>();// Inicializa la lista.
    }

    @Override
    public void añadirSubordinado(Trabajador t) {
        subordinados.add(t); // Añade elemento a la lista.
    }

    @Override
    public void eliminarSubordinado(Trabajador t) {
        subordinados.remove(t);// Elimina elemento de la lista.
    }

    @Override
    public double getSalarios() {
        double sum = getSalario(); // Suma el salario de este empleado.
        for (Trabajador subordinado : subordinados) {
            sum += subordinado.getSalarios();// Suma el salario de su subordinado.
        }
        return sum;
    }

    @Override
    public String getDescripcion() {
        String desc = this.toString(); //Añade a la cadena el puesto de este empleado
        for (Trabajador subordinado : subordinados) {
            //Añade a la cadena el puesto de su subordinado.
            desc += "\n\t### " + subordinado.getDescripcion();
        }
        return desc;
    }
}
