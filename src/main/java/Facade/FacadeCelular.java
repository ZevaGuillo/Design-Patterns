package Facade;

public class FacadeCelular {
    private IPhone iPhone;
    private Samsung samsung;

    public FacadeCelular() {
        this.iPhone = new IPhone();
        this.samsung = new Samsung();
    }

    public String verSistemaIPhone() {
        return iPhone.sistemaOperativo();
    }

    public String verSistemaSamsung() {
        return samsung.sistemaOperativo();
    }
}
