package V2;
import V2.Volar;
public class Canario extends Ave implements Volar {
    @Override
    public void makeSound() {
        System.out.println("Canta");

    }

    @Override
    public void vuela() {
        System.out.println("vuela con alas");
    }
}
