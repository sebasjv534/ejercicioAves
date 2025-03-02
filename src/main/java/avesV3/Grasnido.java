package avesV3;
import avesV3.TipoSonido;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
public class Grasnido implements TipoSonido {

    public static final Logger logger = LoggerFactory.getLogger(Grasnido.class);
     public void makeSound(){
         logger.debug("grasnido");
         System.out.println("Grasnido");
     }
}
