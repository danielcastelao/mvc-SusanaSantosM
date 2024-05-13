package cod.mvc.model;

import cod.mvc.controller.Observer;

import java.util.ArrayList;
import java.util.List;

public class Model {
    //ArrayList de coches
    private static ArrayList<Coche> parking = new ArrayList<Coche>();

    //Lista de observadores
    private List<Observer> observers = new ArrayList<>();

    public static Coche crearCoche(String matricula, String modelo, Integer velocidad){
        Coche cocheNuevo = new Coche(matricula, modelo, velocidad);
        parking.add(cocheNuevo);
        return cocheNuevo;
    }

    public static Coche getCoche(String matricula){
        for (Coche coche : parking){
            if (coche.matricula.equals(matricula)){
                return coche;
            }
        }
        return null;
    }

    public static Integer cambiarVelocidad(String matricula, Integer velocidad){
        Coche coche = getCoche(matricula);
        if (coche != null){
            coche.velocidad = velocidad;
        }
        return velocidad;
    }

    public static Integer getVelocidad(String matricula){
        Coche coche = getCoche(matricula);
        return coche.velocidad;
    }
}
