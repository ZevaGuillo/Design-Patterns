package AbstractFactory;

public interface Laptop { }

class HP implements Laptop { }

class Dell implements Laptop {}

class ASUS implements Laptop {}

class LaptopFactory extends AbstractFactory<Laptop>{

    @Override
    public Laptop crearProducto(Class marca) {
        if(marca == HP.class) return new HP();
        if(marca == Dell.class) return new Dell();
        if(marca == ASUS.class) return new ASUS();
        return null;
    }
}