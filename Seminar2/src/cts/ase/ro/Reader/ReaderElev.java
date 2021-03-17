package cts.ase.ro.Reader;

import cts.ase.ro.Clase.Aplicant;
import cts.ase.ro.Clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderElev extends   ReaderAplicant{
    public ReaderElev(String numeFisier) {
        super(numeFisier);
    }
    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner textFisier = new Scanner(new File(super.numeFisier));
        textFisier.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (textFisier.hasNext()) {
           Elev elev=new Elev();
           readerAplicant(textFisier,elev);
            int clasa = textFisier.nextInt();
            String tutore = textFisier.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }
        textFisier.close();
        return elevi;
    }
}
