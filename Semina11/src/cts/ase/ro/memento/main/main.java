package cts.ase.ro.memento.main;

import cts.ase.ro.memento.clase.ManagerMeci;
import cts.ase.ro.memento.clase.Meci;
import cts.ase.ro.memento.clase.Memento;
import cts.ase.ro.observer.clase.ManagerSala;

public class main {
    public static void main(String[] args) {
        Meci meci=new Meci(10,"Fcsb","Dinamo",20,100);
        Memento memento= meci.creareMemento();
        ManagerMeci managerMeci=new ManagerMeci();
        managerMeci.adaugaMemento(memento);

        meci.setNrSpectatori(200);
        meci.setNumeEchipaGazda("U Craiova");
        meci.setNumeEchipaOaspeti("CFR CLUJ");
        managerMeci.adaugaMemento(meci.creareMemento());
        System.out.println(meci);
        meci.setMemento(managerMeci.getMemento(0));
        System.out.println("\n"+meci);
    }
}
