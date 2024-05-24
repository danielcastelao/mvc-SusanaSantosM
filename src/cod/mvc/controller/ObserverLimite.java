package cod.mvc.controller;

import cod.mvc.model.Coche;

public class ObserverLimite implements Observer{

    //Velocidad límite
    int velocidadLimite = 200;

    /**
     * Metodo que se encarga de actualizar el coche y la nueva velocidad
     * @param coche es el coche que se va a actualizar
     */
   public void update(Coche coche){
      if(coche.velocidad > velocidadLimite){
          System.out.println("[ObserverLimite] El coche con matricula "+coche.matricula+
                  " superó el límite de velocidad con "+ coche.velocidad+" km/h");
      }
   }
}
