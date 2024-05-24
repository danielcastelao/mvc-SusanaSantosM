package cod.mvc.controller;

import cod.mvc.model.Coche;
import cod.mvc.model.Model;

public interface Observer {

     /**
      * Actualiza el estado del coche
      * @param arg es el coche que se va a actualizar
      */
     void update(Coche arg, Model model);
}
