package AbstractFactory;

public abstract class AbstractFactory<T> {
    public abstract <T> T crearProducto(Class<T> marca);
}
