package cod.mvc.Model;

public class Coche {
    public String matricula;
    public String modelo;
    public Integer velocidad;

    public Coche(String matricula, String modelo, Integer velocidad){
        this.matricula = matricula;
        this.modelo = modelo;
        this.velocidad = 0;
    }
}
