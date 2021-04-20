package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.OperatorRezervare;
import ro.ase.cts.proxy.clase.ProxyRezervare;

public class main {
    public static void main(String[] args) {
        OperatorRezervare operatorRezervare=new OperatorRezervare("Socului");
        operatorRezervare.Rezervari(2);
        ProxyRezervare proxyRezervare=new ProxyRezervare(operatorRezervare,4);
        proxyRezervare.Rezervari(2);
        proxyRezervare.Rezervari(4);
    }
}
