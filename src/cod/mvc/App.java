package cod.mvc;

import cod.mvc.Model.Model;
import cod.mvc.Controller.Controller;

public class App {
    public static void main(String[] args){

        //Instanciamos el modelo
        Model miModelo = new Model();

        //Instanciamos el controlador
        Controller miControlador = new Controller(miModelo);

        //Creamos un coche
        miControlador.crearCoche("129874EU", "Ferrari", 80);
        miControlador.crearCoche("897435EU", "AudiA3", 100);

        //Cambiamos la velocidad de un coche
        miControlador.cambiarVelocidad("129874EU", 100);
        miControlador.cambiarVelocidad("897435EU", 150);

    }
}
