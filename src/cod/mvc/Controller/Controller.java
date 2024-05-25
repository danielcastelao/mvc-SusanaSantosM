package cod.mvc.Controller;

import cod.mvc.Model.Model;

public class Controller {

    private final Model miModelo = new Model();

    public Controller(Model miModelo){

        ObsVelocidad observerVelocidad = new ObsVelocidad();
        miModelo.addObserver(observerVelocidad);

        ObserverLimite obsLimite = new ObserverLimite();
        miModelo.addObserver(obsLimite);

    }


    /**
     * Método que crea un coche
     * @param matricula del coche
     * @param modelo del coche
     * @param velocidad del coche
     */
    public void crearCoche(String matricula, String modelo, Integer velocidad){
        miModelo.crearCoche(matricula, modelo, velocidad);
    }

    /**
     * Método que cambia la velocidad de un coche
     * @param matricula del coche
     * @param velocidad del coche
     */
    public void cambiarVelocidad(String matricula, Integer velocidad){
        miModelo.cambiarVelocidad(matricula,velocidad);
    }
}