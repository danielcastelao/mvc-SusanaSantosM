package cod.mvc.controller;

import cod.mvc.model.Coche;

public class ObsVelocidad implements Observer{

    /**
     * Método que se encarga de actualizar la velocidad del coche
     * @param coche es el coche que se va a actualizar la velocidad
     */
    @Override
    public void update(Coche coche) {
        System.out.println("La velocidad actual es: " + coche.velocidad);
    }
}
