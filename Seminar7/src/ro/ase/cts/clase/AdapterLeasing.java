package ro.ase.cts.clase;
import ro.ase.cts.clase.Leasing;
public class AdapterLeasing implements CreditAbstract {

    private Leasing leasing;
    public AdapterLeasing(Leasing leasing){
        this.leasing=leasing;
    }
    @Override
    public void oferaCredit() {
        leasing.createLeasing();

    }
}
