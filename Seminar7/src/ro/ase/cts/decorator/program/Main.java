package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Card;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorContactless;
import ro.ase.cts.decorator.clase.DecoratorTelefon;

public class Main {
    public static void main(String[] args) {
        Card card=new Card("Flori","151231421");
        card.platesteOnline();
        card.platestePOS();
        DecoratorAbstract decoratorAbstract=new DecoratorContactless(card);
        decoratorAbstract.platesteOnline();
        decoratorAbstract.platestePOS();
        decoratorAbstract.platesteContactless();
        DecoratorAbstract decoratorAbstract1=new DecoratorTelefon(card);
        decoratorAbstract1.platesteContactless();
        decoratorAbstract1.platestePOS();
        decoratorAbstract1.platesteOnline();

        DecoratorAbstract decoratorAbstract2=new DecoratorContactless(decoratorAbstract1);
        decoratorAbstract2.platesteContactless();
    }
}
