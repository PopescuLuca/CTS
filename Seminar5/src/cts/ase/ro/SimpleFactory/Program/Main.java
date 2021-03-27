package cts.ase.ro.SimpleFactory.Program;

import cts.ase.ro.SimpleFactory.Clase.*;

public class Main {
    public static void main(String[] args) {
        //Factory factory=new Factory();
        FactorySingleton factorySingleton = FactorySingleton.getInstance();
        Jucator portar = factorySingleton.getJucator(TipJucator.Portar, "Luca", 20);
        Jucator atacant = factorySingleton.getJucator(TipJucator.Atacant, "Alex", 21);
        Jucator fundas = factorySingleton.getJucator(TipJucator.Fundas, "Rares", 21);

        System.out.println(portar.toString());
        System.out.println(fundas.toString());
        System.out.println(atacant.toString());
    }
}
