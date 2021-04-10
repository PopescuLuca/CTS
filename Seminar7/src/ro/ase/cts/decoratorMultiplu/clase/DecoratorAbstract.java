package ro.ase.cts.decoratorMultiplu.clase;

public abstract class DecoratorAbstract implements OperatorAbstract{
    private OperatorAbstract bilet;

    @Override
    public void rezervaBilet() {
        bilet.rezervaBilet();
    }

    public DecoratorAbstract(OperatorAbstract bilet) {
        this.bilet = bilet;
    }

    @Override
    public String getNumeEchipaGazda() {
        return bilet.getNumeEchipaGazda();
    }

    @Override
    public String getNumeEchipaOaspeti() {
        return bilet.getNumeEchipaOaspeti();
    }
}
