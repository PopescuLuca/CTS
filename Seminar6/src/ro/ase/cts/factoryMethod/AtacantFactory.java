package ro.ase.cts.factoryMethod;

public class AtacantFactory implements AbstractFactory {
    @Override
    public Jucator getJucator(String nume, int meciuriJucate) {
        return new Atacant(nume,meciuriJucate);
    }
}
