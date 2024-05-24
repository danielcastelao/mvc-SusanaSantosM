package cod.mvc;

import cod.mvc.controller.Controller;
import cod.mvc.model.Model;

public class App {
    public static void main(String[] args){

        //Inicializamos la aplicación
        //Instanciamos el modelo
        Model miModel = new Model();

        //Instanciamos el controlador
        Controller miController = new Controller(miModel);

        //Creamos dos coches
        miController.crearCoche("1234ABC", "Seat", 100);
        miController.crearCoche("5678DEF", "Renault", 120);

        //Otro cambio de velocidad
        miController.cambiarVelocidad("1234ABC", 210);

    }
}
