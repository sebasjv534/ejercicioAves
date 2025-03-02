package com.sebasdev.ucatolica.ejercicios.v1;

public class AvesTruz extends Ave {
    @Override
    public void makeSound() {
        System.out.println("<<Silencio>>");
    }
    public void fly() {
        System.out.println("<<No puede volar>>");
    }
}
