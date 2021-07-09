package Factory;

public interface Celular {
    void llamar();
    void mensaje();
}

class IPhone implements Celular{

    @Override
    public void llamar() { }

    @Override
    public void mensaje() { }

}

class Samsung implements Celular{

    @Override
    public void llamar() { }

    @Override
    public void mensaje() { }

}

class Huawei implements Celular{

    @Override
    public void llamar() { }

    @Override
    public void mensaje() { }

}

class CelularFactory{

    public static Celular crearCelular(String marca){
        if (marca.equalsIgnoreCase("IPhone")){
            return new IPhone();
        }else if(marca.equalsIgnoreCase("Samsung")){
            return new Samsung();
        }else if (marca.equalsIgnoreCase("Huawei")){
            return new Huawei();
        }
        return null;
    }
}

class main{
    public static void main(String[] args) {
        System.out.println(CelularFactory.crearCelular("IPhone"));
        System.out.println(CelularFactory.crearCelular("Samsung"));
        System.out.println(CelularFactory.crearCelular("Huawei"));
    }
}

