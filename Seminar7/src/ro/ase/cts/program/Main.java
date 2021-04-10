package ro.ase.cts.program;

import ro.ase.cts.clase.AdapterCrediteClasa;
import ro.ase.cts.clase.AdapterLeasing;
import ro.ase.cts.clase.CreditAbstract;
import ro.ase.cts.clase.Leasing;

public class Main {
    public static void creeazaCredit(CreditAbstract creditAbstract){
        creditAbstract.oferaCredit();
    }

    public static void main(String[] args) {
        Leasing leasing=new Leasing("Luca",15);
        AdapterLeasing adapterLeasing=new AdapterLeasing(leasing);
        creeazaCredit(adapterLeasing);

        AdapterCrediteClasa adapterCrediteClasa=new AdapterCrediteClasa("Alex",1000);
        creeazaCredit(adapterCrediteClasa);
    }
}
