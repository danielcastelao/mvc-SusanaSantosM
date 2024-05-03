package cod.mvc;

import java.util.ArrayList;

public class Model {
    private static ArrayList<Coche> parking = new ArrayList<Coche>();

    public static Coche crearCoche(String matricula, String modelo, Integer velocidad){
        Coche cocheNuevo = new Coche(matricula, modelo, velocidad);
        parking.add(cocheNuevo);
        return cocheNuevo;
    }
}
