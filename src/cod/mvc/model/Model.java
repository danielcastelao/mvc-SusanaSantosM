package cod.mvc.model;

import cod.mvc.controller.Observer;

import java.util.ArrayList;
import java.util.List;

public class Model implements Observable{
    //ArrayList de coches
    private static ArrayList<Coche> parking = new ArrayList<>();

    //Lista de observadores
    private static final ArrayList<Observer> observers = new ArrayList<>();


    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(Coche coche, Model model) {
        for (Observer observer : observers){
            observer.update(coche,this);
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
    public void  cambiarVelocidad(String matricula, Integer velocidad){
        //Buscamos el coche y cambiamos la velocidad
        getCoche(matricula).velocidad = velocidad;
        //Notificamos a los observadores
        notifyObservers(getCoche(matricula),this);

        // ya no retornamos la nueva velocidad
        // porque vamos a utilizar el patron observer
        // return getCoche(matricula).velocidad;
    }

    /**
     * Devuelve la velocidad del coche
     *
     * @param matricula
     * @return
     */
    public static Integer getVelocidad(String matricula){
        return getCoche(matricula).velocidad;
    }

}
