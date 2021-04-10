package ro.ase.cts.decoratorMultiplu.clase;

public class DecoratorPasteFericit extends DecoratorAbstract {
    public DecoratorPasteFericit(OperatorAbstract bilet) {
        super(bilet);
    }
    @Override
    public void rezervaBilet(){
        super.rezervaBilet();
        System.out.println("Paste Fericit si Hai la meci ");
    }
}
