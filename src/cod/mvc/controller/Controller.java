package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;

public class Controller {

    private final Model miModelo;

    public Controller(Model miModelo) {
        //vamos a definir la instancia del model
        this.miModelo = miModelo;

        //Llamamos a los observadores
        ObsVelocidad obsVelocidad = new ObsVelocidad();
        miModelo.addObserver(obsVelocidad);

        ObserverLimite observerLimite = new ObserverLimite();
        miModelo.addObserver(observerLimite);

        //obsOtro obsOtro = new obsOtro();
        //miModelo.addObserver(obsOtro);

    }

    //Métodos que se comunican con el modelo
    public void crearCoche(String matricula, String modelo, Integer velocidad){
        miModelo.crearCoche(matricula, modelo, velocidad);
    }

    public void cambiarVelocidad(String matricula, Integer velocidad){
        miModelo.cambiarVelocidad(matricula, velocidad);
    }

}