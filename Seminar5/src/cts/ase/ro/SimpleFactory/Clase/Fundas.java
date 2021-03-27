package cts.ase.ro.SimpleFactory.Clase;

public class Fundas extends Jucator {
    public Fundas(String numeJucator, int varsta) {
        super(numeJucator, varsta);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fundas{");
        sb.append('}');
        sb.append(super.toString());
        return sb.toString();
    }
}
