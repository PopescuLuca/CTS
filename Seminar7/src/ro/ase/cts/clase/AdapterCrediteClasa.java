package ro.ase.cts.clase;

public class AdapterCrediteClasa extends Leasing implements CreditAbstract {

    public AdapterCrediteClasa(String numeClient, float suma) {
        super(numeClient, suma);

    }

    @Override
    public void oferaCredit() {
        super.createLeasing();
    }
}
