package cts.ase.ro.SimpleFactory.Clase;

public class Factory {

    public Jucator getJucator(TipJucator tipJucator, String nume, int varsta) {
        switch (tipJucator) {
            case Portar:
                return new Portar(nume, varsta);
            case Fundas:
                return new Fundas(nume, varsta);
            case Atacant:
                return new Atacant(nume, varsta);
            default:
                throw new IllegalArgumentException();
        }
    }
}
