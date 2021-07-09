package Facade;

public interface Celular {
    String sistemaOperativo();
}

class IPhone implements Celular{

    @Override
    public String sistemaOperativo() {
        return "IOS 11";
    }
}

class Samsung implements Celular{

    @Override
    public String sistemaOperativo() {
        return "Android 12";
    }
}
