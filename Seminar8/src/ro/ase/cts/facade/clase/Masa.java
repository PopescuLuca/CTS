package ro.ase.cts.facade.clase;

public class Masa {
    private int Cod;
    private int nrPersoane;

    public Masa(int cod, int nrPersoane) {
        Cod = cod;
        this.nrPersoane = nrPersoane;
    }

    public int getCod() {
        return Cod;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }
}
