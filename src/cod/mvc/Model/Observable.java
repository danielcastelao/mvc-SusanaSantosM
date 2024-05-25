package cod.mvc.Model;

import cod.mvc.Controller.Observer;

public interface Observable {
    static void addObserver(Observer observer) {}
    static void removeObserver(Observer observer) {}
    static void notifyObservers(Coche coche, Model model) {}
}
