package Singleton;

public class Impresora {
    private static Impresora impresora;

    private Impresora(){}

    public static Impresora getInstance(){
        return impresora==null? impresora = new Impresora(): impresora;
    }
}

class Main{
    public static void main(String[] args) {
        Impresora p1 = Impresora.getInstance();
        Impresora p2 = Impresora.getInstance();
        Impresora p3 = Impresora.getInstance();



        System.out.println("La referencia de memoria de la impresora 1: "+p1);
        System.out.println("La referencia de memoria de la impresora 2: "+p2);
        System.out.println("La referencia de memoria de la impresora 3: "+p3);
    }
}
