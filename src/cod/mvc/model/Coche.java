package cod.mvc.model;

public class Coche {
    public String matricula;
    public String modelo;
    public Integer velocidad;

    /**
     * Constructor de la clase Coche
     * @param matricula es la matricula del coche
     * @param modelo es el modelo del coche
     * @param velocidad es la velocidad del coche
     */
    public Coche(String matricula, String modelo, Integer velocidad){
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad = 0;
    }
}
