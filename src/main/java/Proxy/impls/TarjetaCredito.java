package Proxy.impls;

import Proxy.services.Pago;

public class TarjetaCredito implements Pago {

    private String propietario;

    public TarjetaCredito(String propietario) {
        this.propietario = propietario;
    }

    @Override
    public void pagar(int monto) {
        System.out.println("Realizando pago... Monto: "+monto);
    }
}
