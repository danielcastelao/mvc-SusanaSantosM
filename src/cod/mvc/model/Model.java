package cod.mvc.model;

import cod.mvc.controller.Observer;

import java.util.ArrayList;
import java.util.List;

public class Model implements Observable{
    //ArrayList de coches
    private static ArrayList<Coche> parking = new ArrayList<Coche>();

    //Lista de observadores
    private static final List<Observer> observers = new ArrayList<>();


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Coche coche) {
        for (Observer observer : observers){
            observer.update(coche);
        }
    }

    /**
     * Crea un coche y lo añade al parking
     * @param modelo del coche
     * @param matricula del coche
     * @param velocidad del coche
     */
    public static Coche crearCoche(String matricula, String modelo, Integer velocidad){
        Coche cocheNuevo = new Coche(matricula, modelo, velocidad);
        parking.add(cocheNuevo);
        return cocheNuevo;
    }

    /**
     * Va a buscar un coche según su matricula
     * @param matricula es lo que identifica al coche
     * @return
     */
    public static Coche getCoche(String matricula){
        for (Coche coche : parking){
            if (coche.matricula.equals(matricula)){
                return coche;
            }
        }
        return null;
    }

    /**
     * Cambia la velocidad del coche
     * @param matricula
     * @param velocidad
     * @return
     */
    public static Integer cambiarVelocidad(String matricula, Integer velocidad){
        Coche coche = getCoche(matricula);
        if (coche != null){
            coche.velocidad = velocidad;
        }
        return velocidad;
    }

    /**
     * Devuelve la velocidad del coche
     * @param matricula
     * @return
     */
    public static Integer getVelocidad(String matricula){
        Coche coche = getCoche(matricula);
        return coche.velocidad;
    }

}
