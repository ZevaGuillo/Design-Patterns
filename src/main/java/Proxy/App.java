package Proxy;

import Proxy.impls.TarjetaCredito;
import Proxy.proxy.ProxyPago;
import Proxy.services.Pago;

public class App {
    public static void main(String[] args) {
        Pago tarjetaCredito = new ProxyPago("Guillermo Zevallos");

        tarjetaCredito.pagar(100);

    }
}
