package patrones.labpat1.patfun02;

import java.util.ArrayList;

public class Cliente {

    public static void main(String args[]) {
        ArrayList<Titulacion> listaTitulaciones = new ArrayList<>();
        
        SegundoBachilleratoPublico titulacion01 = new SegundoBachilleratoPublico("Humanidades IES público Alcalá");
        titulacion01.addAsignatura(new Asignatura("Historia de España", 4));
        titulacion01.addAsignatura(new Asignatura("Historia de la Filosofía", 3));
        titulacion01.addAsignatura(new Asignatura("Lengua castellana y literatura II", 5));
        titulacion01.addAsignatura(new Asignatura("Lengua extranjera II", 2));
        
        SegundoBachilleratoPrivado titulacion02 = new SegundoBachilleratoPrivado("Humanidades IES privado Alcalá");
        titulacion02.addAsignatura(new Asignatura("Historia de España", 4, 10.5));
        titulacion02.addAsignatura(new Asignatura("Historia de la Filosofía", 3, 20));
        titulacion02.addAsignatura(new Asignatura("Lengua castellana y literatura II", 5, 9));
        titulacion02.addAsignatura(new Asignatura("Lengua extranjera II", 2, 5));        
        
        listaTitulaciones.add(titulacion01);
        listaTitulaciones.add(titulacion02);
        
        for (Titulacion titulacion : listaTitulaciones){
            titulacion.calculaMatricula();
        }
    }
}
