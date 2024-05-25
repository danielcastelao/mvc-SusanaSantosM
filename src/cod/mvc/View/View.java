package cod.mvc.View;

public class View {
    /**
     * Muestra la velocidad de un coche
     * @param matricula es la modelo del coche
     * @param velocidad es la velocidad del coche
     */
    public static void mostrarVelocidad(String matricula, Integer velocidad){
        System.out.println("[View]  Coche de  matricula: "+matricula+" con velocidad: " + velocidad);

    }
}
