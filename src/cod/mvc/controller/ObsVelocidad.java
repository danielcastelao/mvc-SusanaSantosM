package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;
import cod.mvc.view.View;

public class ObsVelocidad implements Observer{

    /**
     * Método que se encarga de actualizar la velocidad del coche
     * @param arg es el coche que se va a actualizar la velocidad
     */
    @Override
    public void update(Coche arg, Model model) {
        System.out.println("[ObserverVelocidad] La velocidad actual es: " + arg.velocidad.toString()+"km/h");
        //Es para comunicar a la view que muestre el coche con la velocidad actual
        View.mostrarVelocidad(arg.matricula, arg.velocidad);
    }
}

