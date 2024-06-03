import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import cod.mvc.Model.Model;
import cod.mvc.Model.Coche;

public class ModelTest {

    Model miModel = new Model();

    @Test
    public void pruebaCrearCoche(){
        Coche coche = miModel.crearCoche("501301D","Toyota",0);
        Assertions.assertEquals("501301D", coche.matricula);
    }

    @Test
    public void pruebaGetCoche(){
        Coche coche = miModel.crearCoche("501301D","Toyota",0);
        Assertions.assertSame(coche, miModel.getCoche("501301D"));
    }

    @Test
    public void pruebaSubirVelocidad(){
        Coche coche = miModel.crearCoche("501301D","Toyota",0);
        Assertions.assertEquals(80, miModel.subirVelocidad("501301D",80));
    }

    @Test
    public void pruebaBajarVelocidad(){
        Coche coche = miModel.crearCoche("501301D","Toyota",100);
        Assertions.assertEquals(0, miModel.bajarVelocidad("501301D",50));
    }

    @Test
    public void pruebaGetVelocidad(){
        Coche coche = miModel.crearCoche("501301D","Toyota",80);
        Assertions.assertEquals(0, miModel.getVelocidad("501301D"));
    }

}
