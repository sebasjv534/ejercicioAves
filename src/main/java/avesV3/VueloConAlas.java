package avesV3;

public class VueloConAlas implements TipoVuelo {

    public static final Looger logger =LoggerFactory.getLogger(VueloConAlas.class);
     public void vuelo(){
         logger.debug("vuelo con alas");
         System.out.println("Vuelo con alas");
     }
}
