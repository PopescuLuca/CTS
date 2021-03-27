package cts.ase.ro.SimpleFactory.Clase;

public class Atacant extends Jucator {
    public Atacant(String numeJucator, int varsta) {
        super(numeJucator, varsta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Atacant{");
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
