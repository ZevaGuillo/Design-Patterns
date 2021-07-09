package Facade;

public class App {
    public static void main(String[] args) {
        FacadeCelular facadeCelular = new FacadeCelular();

        System.out.println(facadeCelular.verSistemaIPhone());
        System.out.println(facadeCelular.verSistemaSamsung());

    }
}
