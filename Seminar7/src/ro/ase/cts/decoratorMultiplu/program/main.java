package ro.ase.cts.decoratorMultiplu.program;

import ro.ase.cts.decoratorMultiplu.clase.Bilet;
import ro.ase.cts.decoratorMultiplu.clase.DecoratorAbstract;
import ro.ase.cts.decoratorMultiplu.clase.DecoratorPasteFericit;
import ro.ase.cts.decoratorMultiplu.clase.DecoratorSustinereEchipa;

public class main {
    public static void main(String[] args) {
        Bilet bilet=new Bilet("Steaua","Rapid");
        bilet.rezervaBilet();
        DecoratorAbstract meciInGhecea=new DecoratorSustinereEchipa(bilet);
        meciInGhecea.rezervaBilet();

        DecoratorAbstract meciDePaste = new DecoratorPasteFericit(bilet);
        meciDePaste.rezervaBilet();

        DecoratorAbstract meciInGhenceaDePaste=new DecoratorSustinereEchipa(meciDePaste);
        System.out.println("\n");
        meciInGhenceaDePaste.rezervaBilet();
    }
}
