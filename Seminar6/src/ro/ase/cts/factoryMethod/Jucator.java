package ro.ase.cts.factoryMethod;

public class Jucator {
    private String nume;
    private int meciuriJucate;

    public Jucator(String nume, int meciuriJucate) {
        super();
        this.nume = nume;
        this.meciuriJucate = meciuriJucate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Jucator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", meciuriJucate=").append(meciuriJucate);
        sb.append('}');
        return sb.toString();
    }
}
