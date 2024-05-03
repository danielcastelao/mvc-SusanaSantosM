package cod.mvc;

import java.util.ArrayList;

public class Model {
    private static ArrayList<Coche> parking = new ArrayList<Coche>();

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
}
