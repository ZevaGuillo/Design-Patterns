package AbstractFactory;

public class FabricaProducto{

    public static AbstractFactory getFactory(String producto){
        if(producto.equalsIgnoreCase("Laptop")){
            return new LaptopFactory();
        }else if(producto.equalsIgnoreCase("Celular")){
            return new CelularFactory();
        }
        return null;
    }
}
