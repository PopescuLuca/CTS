package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Libera;
import ro.ase.cts.state.clase.Masa;
import ro.ase.cts.state.clase.Ocupata;
import ro.ase.cts.state.clase.Rezervat;

public class main {
    public static void main(String[] args) {
        Masa masa = new Masa(1);
        masa.rezervareMasa("Luca");
        masa.rezervareMasa("Ana");
        masa.ocupareMasa("Tudor");

        Masa masa1=new Masa(2);
        Rezervat rezervat=new Rezervat();
        Ocupata ocupata=new Ocupata();
        Libera libera=new Libera();
        libera.modificaStare(masa1);
        rezervat.modificaStare(masa1);
        ocupata.modificaStare(masa1);
    }
}
