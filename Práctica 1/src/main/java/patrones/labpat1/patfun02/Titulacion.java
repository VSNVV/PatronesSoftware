package patrones.labpat1.patfun02;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Titulacion implements OperacionesTitulacion, Serializable {

    private ArrayList<Asignatura> asignaturas;
    private String nombre;

    public Titulacion(String nombre) {
        this.nombre = nombre;
        this.asignaturas = new ArrayList<>();
    }  
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void addAsignatura(Asignatura asignatura) {        
        asignaturas.add(asignatura);
    }

    @Override
    public void removeAsignatura(Asignatura asignatura) {
        if (asignaturas != null) {
            asignaturas.remove(asignatura);
        }
    }

    @Override
    public ArrayList<Asignatura> getAsignaturas() {
        return asignaturas;
    }

    @Override
    public abstract void calculaMatricula();
}
