package cts.ase.ro.SimpleFactory.Clase;

public class FactorySingleton {

    private static FactorySingleton factorySingleton = null;

    private FactorySingleton() {

    }

    public static synchronized FactorySingleton getInstance() {
        if(factorySingleton==null){
            factorySingleton=new FactorySingleton();
        }
        return factorySingleton;
    }

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
