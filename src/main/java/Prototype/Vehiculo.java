package Prototype;

public abstract class Vehiculo implements Cloneable {
    private String matricula;
    private String Marca;

    public Vehiculo(String matricula, String marca) {
        this.matricula = matricula;
        Marca = marca;
    }

    public Vehiculo clonar() {
        Vehiculo clone = null;
        try{
            clone = (Vehiculo) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
