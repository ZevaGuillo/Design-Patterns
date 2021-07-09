package AbstractFactory;

public interface Celular { }

class IPhone implements Celular{ }

class Samsung implements Celular { }

class Huawei implements Celular { }


class CelularFactory extends AbstractFactory {

    @Override
    public Celular crearProducto(Class marca) {
        if(marca == IPhone.class) return new IPhone();
        if(marca == Samsung.class) return new Samsung();
        if(marca == Huawei.class) return new Huawei();
        return null;
    }
}