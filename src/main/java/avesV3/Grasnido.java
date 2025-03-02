package avesV3;
import avesV3.TipoSonido;
public class Grasnido implements TipoSonido {

    public static final Looger logger =LoggerFactory.getLogger(Grasnido.class);
     public void makeSound(){
         logger.debug("grasnido");
         System.out.println("Grasnido");
     }
}
