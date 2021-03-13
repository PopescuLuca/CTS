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
        Scanner input2 = new Scanner(new File(super.numeFisier));
        input2.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<Aplicant>();

        while (input2.hasNext()) {
           Elev elev=new Elev();
           readerAplicant(input2,elev);
            int clasa = input2.nextInt();
            String tutore = input2.next();
            elev.setClasa(clasa);
            elev.setTutore(tutore);
            elevi.add(elev);
        }
        input2.close();
        return elevi;
    }
}
