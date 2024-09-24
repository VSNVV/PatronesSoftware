package patrones.labpat1.patfun02;

public class SegundoBachilleratoPublico extends Titulacion {

    public SegundoBachilleratoPublico(String nombre) {
        super(nombre);
    }
    
    @Override
    public void calculaMatricula() {
        System.out.println(super.getNombre() + "\nPrecio matrícula: " + 0);
    }
}
