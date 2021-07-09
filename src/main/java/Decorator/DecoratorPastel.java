package Decorator;

public abstract class DecoratorPastel implements Pastel{

    public abstract double costo();

    public abstract String descripcion();

}

class Chocolate extends DecoratorPastel{

    private Pastel pastel;

    public Chocolate(Pastel pastel) {
        this.pastel = pastel;
    }

    @Override
    public double costo() {
        return 3.5;
    }

    @Override
    public String descripcion() {
        return "agregado chocolate";
    }
}

class Chicle extends DecoratorPastel{

    private Pastel pastel;

    public Chicle(Pastel pastel) {
        this.pastel = pastel;
    }

    @Override
    public double costo() {
        return 3.5;
    }

    @Override
    public String descripcion() {
        return "agregado Chicle";
    }
}