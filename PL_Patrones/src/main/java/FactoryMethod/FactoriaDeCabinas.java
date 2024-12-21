package FactoryMethod;

import concurrencia.Cabina;

import javax.swing.*;
import java.util.ArrayList;

public class FactoriaDeCabinas {
    // Atributos de la clase FactoriaDeCabinas
    public static final int automatica = 0;
    public static final int manual = 1;

    // Métodos de la clase FactoriaDeCabinas

    // Método para crear una cabina manual o automatica segun el tipo introduciudo
    public Cabina getCabina(int tipo, String nombre, JTextField tfVehiculo, JTextField tfEmpleado){
        if(tipo == automatica){

            return new CabinaAutomatica(nombre, tfVehiculo);
        }
        else{
            return new CabinaManual(nombre, tfEmpleado, tfVehiculo);
        }
    }

}
