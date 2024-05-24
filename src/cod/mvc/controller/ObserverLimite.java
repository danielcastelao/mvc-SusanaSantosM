package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;

public class ObserverLimite implements Observer{

    //Velocidad límite
    int velocidadLimite = 200;

    //Velocidad que reduce al pasar el limite
    int reduccionDeVelocidad = 10;

    /**
     * Metodo que se encarga de actualizar el coche y la nueva velocidad
     * @param coche es el coche que se va a actualizar
     */
    @Override
   public void update(Coche coche, Model model){
      if(coche.velocidad > velocidadLimite){
          System.out.println("[Observer Limite] INFRACCIÓN: El coche con matricula "+coche.matricula+
                  " superó el límite de velocidad");
          model.cambiarVelocidad(coche.matricula, coche.velocidad-reduccionDeVelocidad);
          System.out.println("Se redujo la velocidad a "+(coche.velocidad-reduccionDeVelocidad)+" km/h");
      }
   }

}
