package avesV3;

public class SinVuelo  implements TipoVuelo{

    public static final Logger logger = LoogerFactory.getLogger(SinVuelo.class);

    public void vuelo(){
        logger.debug("no puedo volar");
        System.out.println("No puedo volar");
    }
}
