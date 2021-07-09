package Decorator;

public interface Pastel {
    double costo();
    String descripcion();
}

class TresLeches implements Pastel{

    @Override
    public double costo() {
        return 3.5;
    }

    @Override
    public String descripcion() {
        return "Tres Leches";
    }
}

class Tiramisu implements Pastel{

    @Override
    public double costo() {
        return 3.5;
    }

    @Override
    public String descripcion() {
        return "Tiramisú";
    }
}