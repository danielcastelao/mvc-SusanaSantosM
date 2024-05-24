package cod.mvc.model;

import cod.mvc.controller.Observer;

public interface Observable {

    /**
     * Añade un observador a la lista de observadores
     * @param observer es el observador que se va a añadir
     */
    void addObserver(Observer observer);

    /**
     * Elimina un observador de la lista de observadores
     * @param observer es el observador que se va a eliminar
     */
    void removeObserver(Observer observer);

    /**
     * Notifica a los observadores
     */
    void notifyObservers(Coche cohe, Model model);
}
