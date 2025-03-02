package avesV3;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;


public class VueloConAlas implements TipoVuelo {

    public static final Logger logger = LoggerFactory.getLogger(VueloConAlas.class);
     public void vuelo(){
         logger.debug("vuelo con alas");
         System.out.println("Vuelo con alas");
     }
}
