package cod.mvc.controller;

import cod.mvc.model.Coche;

public interface Observer {

     /**
      * Actualiza el estado del coche
      * @param coche es el coche que se va a actualizar
      */
     void update(Coche coche);
}
