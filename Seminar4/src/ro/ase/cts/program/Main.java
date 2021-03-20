package ro.ase.cts.program;

import ro.ase.cts.clasaMea.Aplicant;
import ro.ase.cts.singletonLazy.AsigurareMedicala;

public class Main {
    public static void main(String[] args){
        AsigurareMedicala asigurareMedicala1=AsigurareMedicala.getInstance(1,"Luca",50.5f);
        AsigurareMedicala asigurareMedicala2=AsigurareMedicala.getInstance(2, "Alex",60.5f);

        System.out.println(asigurareMedicala1.toString());
        System.out.println(asigurareMedicala2.toString());

        Aplicant aplicant1 = Aplicant.getInstance(1,"Luca",true);
        Aplicant aplicant2 = Aplicant.getInstance(2,"Alex",false);
        aplicant1.setId(3);
        System.out.println(aplicant1);
        System.out.println(aplicant2);
    }
}
