package cts.ase.ro.Reader;

import cts.ase.ro.Clase.Angajat;
import cts.ase.ro.Clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderAngajat extends ReaderAplicant {
    public ReaderAngajat(String numeFisier) {
        super(numeFisier);
    }
    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner textFisier = new Scanner(new File(super.numeFisier));
        textFisier.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<Aplicant>();

        while (textFisier.hasNext()) {
            Angajat angajat=new Angajat();
            readerAplicant(textFisier,angajat);
            int salariu = textFisier.nextInt();
            String ocupatie = textFisier.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        textFisier.close();
        return angajati;
    }
}
