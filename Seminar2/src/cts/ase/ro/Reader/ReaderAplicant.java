package cts.ase.ro.Reader;

import cts.ase.ro.Clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;

public interface ReaderAplicant {
    List<Aplicant> readAplicants(String file) throws FileNotFoundException;
}
