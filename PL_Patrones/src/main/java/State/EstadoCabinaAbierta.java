package State;

import FactoryMethod.CabinaAutomatica;

public class EstadoCabinaAbierta implements Estado{
    // Atributos de la clase EstadoCabinaAbierta


    // Métodos de la clase EstadoCabinaAbierta
    @Override
    public void ejecutar(CabinaAutomatica cabina) {
        // Cambiamos el estado de la cabina a abierto
        cabina.setAbierto(true);
    }
}
