package patrones.labpat1.patfun02;

import java.util.ArrayList;


public interface OperacionesTitulacion {

    public void addAsignatura(Asignatura asignatura);
    
    public void removeAsignatura(Asignatura asignatura);
    
    public ArrayList<Asignatura> getAsignaturas();

    public void calculaMatricula();

}
