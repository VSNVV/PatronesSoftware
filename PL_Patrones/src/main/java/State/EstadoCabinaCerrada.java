package State;

import FactoryMethod.CabinaAutomatica;

public class EstadoCabinaCerrada implements Estado{

    // Atributos de la clase EstadoCabinaCerrada

    // Métodos de la clase EstadoCabinaCerrada
    @Override
    public void ejecutar(CabinaAutomatica cabina){
        // Se cambia el estado a cabina cerrada
        cabina.setAbierto(false);
    }
}
