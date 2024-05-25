package cod.mvc.Controller;

import cod.mvc.Model.Coche;
import cod.mvc.Model.Model;

public interface Observer {

    void update(Coche coche, Model model);
}
