package ro.ase.cts.factoryMethod;

public class PortarFactory implements AbstractFactory {
    @Override
    public Jucator getJucator(String nume, int meciuriJucate) {
        return new Portar(nume, meciuriJucate);
    }
}
