package cts.ase.ro.Reader;

import cts.ase.ro.Clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public abstract class ReaderAplicant {
    protected String numeFisier;

    public abstract List<Aplicant> readAplicants() throws FileNotFoundException;

    public ReaderAplicant(String numeFisier) {
        this.numeFisier = numeFisier;
    }

    public String getNumeFisier() {
        return numeFisier;
    }

    public void setNumeFisier(String numeFisier) {
        this.numeFisier = numeFisier;
    }
}
