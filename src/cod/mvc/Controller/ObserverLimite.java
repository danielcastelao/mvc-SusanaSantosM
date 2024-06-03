package cod.mvc.Controller;

import cod.mvc.Model.Coche;
import cod.mvc.Model.Model;

public class ObserverLimite implements Observer{
    /**
     * Velocidad límite en km/h
     */
    private final int velocidadLimite = 120;

    /**
     * La cantidad de velocidad que se reduce si se supera el límite
     */
    private int reduccionVelocidad = 10;

    /**
     * Método que se ejecuta cuando se notifica a los observadores
     * si un coche supera el límite de velocidad.
     * @param coche es el objeto tipo Coche que se cambia la velocidad
     * @param model es el objeto tipo Model que se actualiza
     */
    @Override
    public void update(Coche coche, Model model) {
        if(coche.velocidad > velocidadLimite){
            System.out.println("[INFRACCIÓN]  El coche con matrícula " + coche.matricula + " superó el límite de velocidad");

            // Reducir la velocidad del coche
            model.bajarVelocidad(coche.matricula, reduccionVelocidad);
            coche.velocidad -= reduccionVelocidad;
            System.out.println("La velocidad del coche " + coche.matricula + " se redujo a " + coche.velocidad + " km/h");
        }
    }
}
