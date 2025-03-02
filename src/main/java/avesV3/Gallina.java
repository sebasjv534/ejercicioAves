package avesV3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Gallina extends Ave{
    public static final Logger logger = LoggerFactory.getLogger(Gallina.class);
    public Gallina() {
        logger.debug("instanciando gallina");
        this.setTipoSonido(new Grasnido());
        this.setTipoVuelo(new VueloConAlas());
    }
}
