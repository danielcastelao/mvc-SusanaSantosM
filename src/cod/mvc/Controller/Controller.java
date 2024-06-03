package cod.mvc.Controller;

import cod.mvc.Model.Model;

public class Controller {

    private Model miModelo = new Model();;

    public Controller(Model miModelo){

        ObsVelocidad observerVelocidad = new ObsVelocidad();
        this.miModelo.addObserver(observerVelocidad);

        ObserverLimite obsLimite = new ObserverLimite();
        this.miModelo.addObserver(obsLimite);
        
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
     * Método para subir la velocidad de un coche
     * @param matricula del coche
     * @param velocidad que sube
     */
    public void subirVelocidad(String matricula, Integer velocidad){
        miModelo.subirVelocidad(matricula, velocidad);
    }

    /**
     * Método para cambiar la velocidad de un coche
     * @param matricula del coche
     * @param velocidad que baja
     */
    public void bajarVelocidad(String matricula, Integer velocidad){
        miModelo.bajarVelocidad(matricula, velocidad);
    }

    /**
     * Método que busca un coche
     * @param matricula del coche
     * @param velocidad del coche
     */
    public void buscarCoche(String matricula, Integer velocidad){
        miModelo.buscarCoche(matricula, velocidad);
    }
}