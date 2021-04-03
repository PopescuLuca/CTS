package ro.ase.cts.factoryMethod;

public class Mijlocas extends Jucator {
    public Mijlocas(String nume, int meciuriJucate) {
        super(nume, meciuriJucate);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Mijlocas{");
        sb.append(super.toString());
        return sb.toString();
    }
}
