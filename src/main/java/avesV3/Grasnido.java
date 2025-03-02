package avesV3;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
public class Grasnido implements TipoSonido {

    public static final Logger logger = LoggerFactory.getLogger(Grasnido.class);
     public void makeSound(){
         logger.debug("Grasnido");
         System.out.println("Grasnido");
     }
}
