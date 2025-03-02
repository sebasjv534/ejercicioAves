package avesV3;

import avesV3.TipoSonido;
import org.slf4j.Logger;
public class SinCanto  implements TipoSonido{
    public static final Logger logger=LoggerFactory.getLogger(SinCanto.class);
    public void makeSound(){
        logger.debug("silencio");
        System.out.println("Silencio");
    }
}
