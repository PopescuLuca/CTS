package ro.ase.cts.factoryMethod;

public class FundasFactory implements AbstractFactory{
    @Override
    public Jucator getJucator(String nume, int meciuriJucate) {
        return new Fundas(nume,meciuriJucate);
    }
}
