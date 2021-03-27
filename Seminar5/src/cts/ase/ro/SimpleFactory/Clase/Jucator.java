package cts.ase.ro.SimpleFactory.Clase;

public class Jucator {
    private String numeJucator;
    private int varsta;

    public Jucator(String numeJucator, int varsta) {
        super();
        this.numeJucator = numeJucator;
        this.varsta = varsta;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jucator{");
        sb.append("numeJucator='").append(numeJucator).append('\'');
        sb.append(", varsta=").append(varsta);
        sb.append('}');
        return sb.toString();
    }
}
