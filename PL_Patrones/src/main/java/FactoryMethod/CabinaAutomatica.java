package FactoryMethod;

import Singleton.Log;
import State.Estado;
import State.EstadoCabinaAbierta;
import Strategy.Contexto;
import Strategy.EstrategiaEstandar;
import Strategy.EstrategiaPremium;
import Strategy.EstrategiaReducida;
import concurrencia.Cabina;
import concurrencia.Factura;
import concurrencia.ListaThreads;
import concurrencia.Vehiculo;

import javax.swing.*;
import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CabinaAutomatica extends Cabina {
    //Atributos de la clase cabina
    private boolean abierto = true;
    private ListaThreads listaVehiculo;
    private Lock cabinaAutomatica = new ReentrantLock();
    private Log log = Log.getInstancia(); // Uso del patron Singleton
    private Estado estadoActual = new EstadoCabinaAbierta(); // Uso del patron State

    //Métodos de la clase cabina
    public CabinaAutomatica(String _nombre, JTextField jTextFieldVehiculo) {
        super(_nombre);
        this.listaVehiculo = new ListaThreads(jTextFieldVehiculo);
    }
    //Método para que un vehículo acceda a la cabina
    public void entraVehiculo(Vehiculo vehiculo){
        try{
            cabinaAutomatica.lock();
            //Le añadimos a la lista de vehículos que están dentro de la cabina
            listaVehiculo.meterVehiculo(vehiculo);
            getLog().escribirEnLog("[" + getNombreCabina() + "]: El vehiculo " + vehiculo.getIdentificador() + " ha entrado a la " + getNombreCabina());
            System.out.println("[" + getNombreCabina() + "]: El vehiculo " + vehiculo.getIdentificador() + " ha entrado a la " + getNombreCabina());
        }finally{
            cabinaAutomatica.unlock();
        }
    }
    //Método para que el vehiculo pague
    public void vehiculoPaga(Vehiculo vehiculo){
        try{
            cabinaAutomatica.lock();
            double precioBase;
            double precioFinal = 0;
            Contexto contexto;
            Factura factura;
            if(vehiculo.getIdentificador().contains("Coche")){
                precioBase = 3.0;
            }
            else if(vehiculo.getIdentificador().contains("Camion")){
                precioBase = 5.0;
            }
            else{
                precioBase = 0.0;
            }
            Random r = new Random();
            int eleccionTarifa = r.nextInt(3);
            switch(eleccionTarifa){
                case 0:
                    // Tarfia estandar
                    contexto = new Contexto(new EstrategiaEstandar(), precioBase);
                    precioFinal = contexto.ejecutaEstrategia(); // Patron Strategy
                    break;
                case 1:
                    //Tarifa reducida
                    contexto = new Contexto(new EstrategiaReducida(), precioBase);
                    precioFinal = contexto.ejecutaEstrategia(); // Patron Strategy
                    break;
                case 2:
                    // Tarifa premium
                    contexto = new Contexto(new EstrategiaPremium(), precioBase);
                    precioFinal = contexto.ejecutaEstrategia(); // Patron Strategy
            }
            // Una vez que tenemos el precio final, hacemos la factura y se la damos al vehiculo
            factura = new Factura(vehiculo.getIdentificador(), precioFinal);
            vehiculo.setFactura(factura);
            getLog().escribirEnLog("[" + getNombreCabina() + "]: El vehiculo " + vehiculo.getIdentificador() + " esta pagando su peaje en la cabina " + getNombreCabina());
            System.out.println("[" + getNombreCabina() + "]: El vehiculo " + vehiculo.getIdentificador() + " esta pagando su peaje en la cabina " + getNombreCabina());
            vehiculo.pagaCabinaAutomatica();
            getLog().escribirEnLog("[" + getNombreCabina() + "]: El vehiculo " + vehiculo.getIdentificador() + " ha pagado su peaje en la cabina " + getNombreCabina());
            System.out.println("[" + getNombreCabina() + "]: El vehiculo " + vehiculo.getIdentificador() + " ha pagado su peaje en la cabina " + getNombreCabina());
        }finally{
            cabinaAutomatica.unlock();
        }
    }
    //Método para que los vehiculos salgan de la cabina
    public void saleVehiculo(Vehiculo vehiculo){
        try{
            cabinaAutomatica.lock();
            //Como va a salir de la cabina, la cabina podrá ser ocupada por otro vehiculo
            //Nos saldremos de la lista de vehiculos
            listaVehiculo.sacarVehiculo(vehiculo);
            getLog().escribirEnLog("[" + getNombreCabina() + "] El vehiculo " + vehiculo.getIdentificador() + " ha salido de la cabina");
            System.out.println("[" + getNombreCabina() + "] El vehiculo " + vehiculo.getIdentificador() + " ha salido de la cabina");
        }finally{
            cabinaAutomatica.unlock();
        }
    }
    //Método get del booleano abierto
    public boolean isAbierto() {
        return abierto;
    }
    public boolean acceso(){
        return (isAbierto() && isDisponible());
    }
    //Método set del booleano abierto
    public void setAbierto(boolean abierto) {
        this.abierto = abierto;
    }
    //Método get del log
    public Log getLog() {
        return log;
    }
    // Método de get del estado actual
    public Estado getEstado(){
        return this.estadoActual;
    }
    // Método set del estado actual
    public void setEstado(Estado estado){
        this.estadoActual = estado;
        estado.ejecutar(this);
    }
}
