package cod.mvc.Controller;

import cod.mvc.Model.Coche;
import cod.mvc.Model.Model;
import cod.mvc.View.View;

public class ObsVelocidad implements Observer {

    /**
     * Metodo que muestra el cambio de velocidad de un coche
     * @param coche es el objeto tipo Coche que se actualiza
     * @param model es el objeto tipo Model que se actualiza
     */
    @Override
    public void update(Coche coche, Model model) {
        System.out.println("[Observer Velocidad] El coche con matrícula " + coche.matricula + " cambió su velocidad a " + coche.velocidad);
        View.mostrarVelocidad(coche.matricula, coche.velocidad);
    }
}
