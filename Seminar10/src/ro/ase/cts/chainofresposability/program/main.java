package ro.ase.cts.chainofresposability.program;

import ro.ase.cts.chainofresposability.clase.Cont;
import ro.ase.cts.chainofresposability.clase.ContCredit;
import ro.ase.cts.chainofresposability.clase.ContCurent;
import ro.ase.cts.chainofresposability.clase.ContEconomii;

public class main {
    public static void main(String[] args) {
        Cont contcurent=new ContCurent(200);
        Cont contEconomii=new ContEconomii(300);
        Cont contCredit=new ContCredit(400);
        contcurent.setCont(contEconomii);
        contEconomii.setCont(contCredit);
        contcurent.realizeazaPlata(160);
        contcurent.realizeazaPlata(50);
        contcurent.realizeazaPlata(40);
        contcurent.realizeazaPlata(20);
        contcurent.realizeazaPlata(30);
        contcurent.realizeazaPlata(500);
    }
}
