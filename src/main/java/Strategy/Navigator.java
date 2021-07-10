package Strategy;

public class Navigator {

    private RouteStrategy ruta;

    public Navigator(RouteStrategy ruta) {
        this.ruta = ruta;
    }

    public void generateRoute(String A, String B){
        this.ruta.generateRoute(A,B);
    }

}
