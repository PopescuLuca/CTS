package ro.ase.cts.proxy.clase;

public class ProxyRezervare implements IOperatorRezervari {
    private OperatorRezervare operatorRezervare;
    private int nrMinimDePers;

    public ProxyRezervare(OperatorRezervare operatorRezervare, int nrMinimDePers) {
        this.operatorRezervare = operatorRezervare;
        this.nrMinimDePers = nrMinimDePers;
    }

    @Override
    public void Rezervari(int nrPers) {
        if (nrPers>=nrMinimDePers){
            operatorRezervare.Rezervari(nrPers);
        }
        else{
            System.out.println("Numarul de persoane e prea mic");
        }
    }
}
