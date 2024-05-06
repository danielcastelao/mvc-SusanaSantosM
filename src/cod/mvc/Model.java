package cod.mvc;

import java.util.ArrayList;

public class Model {
    private static ArrayList<Coche> parking = new ArrayList<Coche>();

    /**
     * Método para crear un coche
     * @param matricula identificador del coche
     * @param modelo describe el modelo del coche
     * @param velocidad identifica cuanto puede correr un coche
     * @return cocheNuevo de tipo Coche
     */
    public static Coche crearCoche(String matricula, String modelo, Integer velocidad){
        Coche cocheNuevo = new Coche(matricula, modelo, velocidad);
        parking.add(cocheNuevo);
        return cocheNuevo;
    }

    /**
     * Método para obtener un coche a partir de su matrícula
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
     * Método para cambiar la velocidad del coche
     */
    public static Integer cambiarVelocidad(String matricula, Integer velocidad){
        Coche coche = getCoche(matricula);
        if (coche != null){
            coche.velocidad = velocidad;
        }
        return velocidad;
    }

    /**
     * Método para obtener la velocidad del coche nuevo
     * @return la velocidad del coche creado
     */
    public static Integer getVelocidad(String matricula){
        Coche coche = getCoche(matricula);
        assert coche != null;
        return coche.velocidad;
    }
}
