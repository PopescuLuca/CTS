package ro.ase.cts.main;

import ro.ase.cts.factoryMethod.*;

public class Main {
    private static void afisareInformatii(AbstractFactory abstractFactory,String nume, int meciuriJucate){
        Jucator jucator=abstractFactory.getJucator(nume, meciuriJucate) ;
        System.out.println(jucator.toString());
    }
    public static void main(String[] args) {
        afisareInformatii(new AtacantFactory(),"Andrei",5);
        afisareInformatii(new PortarFactory(),"Mihai",6);
        afisareInformatii(new FundasFactory(),"Rares",205);
        afisareInformatii(new MijlocasFactory(),"tas",15);
    }
}
