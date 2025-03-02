package com.sebasdev.ucatolica.ejercicios.v1;

public class Canario extends Ave {
    @Override
    public void makeSound() {
        System.out.println("<<Canta>>");
    }

    public void fly() {
        System.out.println("<<Vuela con alas>>");
    }
}
