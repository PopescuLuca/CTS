package ro.ase.cts.factoryMethod;

public class MijlocasFactory implements AbstractFactory {
    @Override
    public Jucator getJucator(String nume, int meciuriJucate) {
        return new Mijlocas(nume, meciuriJucate);
    }
}
