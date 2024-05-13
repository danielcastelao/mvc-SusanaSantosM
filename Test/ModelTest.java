import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import cod.mvc.model.Model;
import cod.mvc.Coche;

public class ModelTest {

    @Test
    public void pruebaCrearCoche(){
        Coche coche = Model.crearCoche("501301D","Toyota",0);
        Assertions.assertEquals("501301D", coche.matricula);
        Assertions.assertEquals("Toyota", coche.modelo);
        Assertions.assertEquals(0, coche.velocidad);
    }

    @Test
    public void pruebaGetCoche(){
        Coche coche = Model.crearCoche("501301D","Toyota",0);
        Assertions.assertSame(coche, Model.getCoche("501301D"));
    }

    @Test
    public void pruebaCambiarVelocidad(){
        Coche coche = Model.crearCoche("501301D","Toyota",0);
        Integer velocidad = Model.cambiarVelocidad("501301D", 80);
        Assertions.assertEquals(80, velocidad);
        Assertions.assertEquals(coche.velocidad, velocidad);
    }

    @Test
    public void pruebaGetVelocidad(){
        Coche coche = Model.crearCoche("501301D","Toyota",80);
        Assertions.assertEquals(80, Model.getVelocidad("501301D"));
    }

}
