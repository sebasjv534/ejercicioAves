package avesV3;
9
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lab5TestCase {

    public static final Logger logger =  LoggerFactory.getLogger(Lab5TestCase.class);
    @Test
public void CanarioTest(){
        Canario canario=new Canario();
    logger.debug("Canario realiza vuelo");
    System.out.println("Canario realiza vuelo");
 canario.realizarVuelo();
        logger.debug("Canario realizaSonido");
        System.out.println("Canario realizaSonido");
        canario.realizarVuelo();
}



}
