package Proxy.proxy;

import Proxy.impls.TarjetaCredito;
import Proxy.services.Pago;

public class ProxyPago implements Pago {

    private Pago pago;
    private String propietario;

    public ProxyPago(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public void pagar(int monto) {

        if(pago == null){
            pago = new TarjetaCredito(propietario);
        }
        pago.pagar(monto);
    }
}
