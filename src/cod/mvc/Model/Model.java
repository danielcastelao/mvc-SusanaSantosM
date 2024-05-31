package cod.mvc.Model;

import cod.mvc.Controller.Observer;

import java.util.ArrayList;

public class Model implements Observable{

    private static ArrayList<Coche> parking = new ArrayList<>();

    private static ArrayList<Observer> observers = new ArrayList<>();

    /**
     * Método para añadir un objeto de tipo Observer al ArrayList de observers
     * @param observer es el objeto tipo Observer que se añade
     */
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    /**
     * Método para eliminar un objeto de tipo Observer del ArrayList de observers
     * @param observer es el objeto tipo Observer
     */
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    /**
     * Método para notificar a los observadores, este recorre el ArrayList de observers
     * @param coche es el objeto tipo Coche
     * @param model es el objeto tipo Model
     */
    public void notifyObservers(Coche coche, Model model) {
        for (Observer observer : observers) {
            observer.update(coche,model);
        }
    }

    /**
     * Método para crear un coche
     * @param matricula identificador del coche
     * @param modelo describe el modelo del coche
     * @param velocidad identifica cuanto puede correr un coche
     * @return cocheNuevo de tipo Coche
     */
    public Coche crearCoche(String matricula, String modelo, Integer velocidad){
        Coche cocheNuevo = new Coche(matricula, modelo, velocidad);
        parking.add(cocheNuevo);
        return cocheNuevo;
    }

    /**
     * Método para obtener un coche a partir de su matrícula
     */
    public Coche getCoche(String matricula){
        for (Coche coche : parking){
            if (coche.matricula.equals(matricula)){
                return coche;
            }
        }
        return null;
    }

    /**
     * Método para cambiar la velocidad del coche
     */
    public Integer cambiarVelocidad(String matricula, Integer velocidad){
        Coche coche = getCoche(matricula);
        coche.velocidad = velocidad;
        notifyObservers(coche, this);
        return coche.velocidad;
    }

    /**
     * Método para obtener la velocidad del coche nuevo
     * @return la velocidad del coche creado
     */
    public Integer getVelocidad(String matricula){
        Coche coche = getCoche(matricula);
        assert coche != null;
        return coche.velocidad;
    }

    /**
     * Método para buscar un coche a partir de su matrícula
     * @param matricula identificador del coche
     * @param velocidad es lo que puede correr un coche
     * @return coche de tipo Coche
     */
    public Coche buscarCoche(String matricula, Integer velocidad){
        for (Coche coche : parking){
            if (coche.matricula.equals(matricula)){
                return coche;
            }
        }
        return null;
    }

    /**
     * Utilizaremos el Model como un singleton
     */
    private static Model instaceModel = new Model();

    private Model() {
    }

    public static Model getInstance() {
        return instaceModel;
    }
}
