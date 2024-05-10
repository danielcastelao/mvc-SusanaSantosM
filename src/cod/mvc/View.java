package cod.mvc;

public class View {
    /**
     * Muestra la velocidad de un coche
     * @param matricula es la modelo del coche
     * @param velocidad es la velocidad del coche
     */
    public void mostrarVelocidad(String matricula,Integer velocidad){
        System.out.println("Coche de  matricula: "+matricula+" con velocidad: " + velocidad);
    }
}
