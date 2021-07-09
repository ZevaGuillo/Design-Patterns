package AbstractFactory;

public class App {
    public static void main(String[] args) {

        AbstractFactory celularFactory = FabricaProducto.getFactory("Celular");
        System.out.println(celularFactory);
        System.out.println(celularFactory.crearProducto(Huawei.class));

        AbstractFactory laptopFactory = FabricaProducto.getFactory("Laptop");
        System.out.println(laptopFactory);
        System.out.println(laptopFactory.crearProducto(ASUS.class));

    }
}
