package V2;


import V2.Volar

public class Gallina extends Ave implements Volar {
    @Override
    public void makeSound() {
        System.out.println("Grasna");
    }

    @Override
    public void vuela() {
        System.out.println("vuela con alas");
    }
}
