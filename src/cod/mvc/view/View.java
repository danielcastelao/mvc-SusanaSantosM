package cod.mvc.view;

public class View {
    /**
     * Muestra la velocidad de un coche
     * @param matricula del coche
     * @param velocidad del coche
     */
    public static void mostrarVelocidad(String matricula, Integer velocidad){
        System.out.println("[View] Coche de  matricula: "+matricula+" con velocidad: " + velocidad);
    }
}
