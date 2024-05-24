package cod.mvc.controller;

import cod.mvc.model.Coche;

public class obsOtro implements Observer{
    /**
     * Método que se encarga de actualizar la velocidad del coche
     * @param arg se va a actualizar la velocidad
     */
    @Override
    public void update(Coche arg) {
        System.out.println("Yo también me enteré que la velocidad actual cambió: " + arg.toString());
    }

}
