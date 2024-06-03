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
        miControlador.crearCoche("129874EU", "Ferrari", 150);

        //Bajamos la velocidad de un coche
        miControlador.bajarVelocidad("897435EU", 50);

        //Subimos la velocidad de un coche
        miControlador.subirVelocidad("129874EU", 80);
    }
}
