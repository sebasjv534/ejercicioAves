package avesV3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Avestruz extends Ave {
    public static final Logger logger = LoggerFactory.getLogger(Avestruz.class);
    public Avestruz () {
        logger.debug("instanciando avestruz");
                this.setTipoSonido(new SinCanto());
                this.setTipoVuelo(new SinVuelo());
    }
}
