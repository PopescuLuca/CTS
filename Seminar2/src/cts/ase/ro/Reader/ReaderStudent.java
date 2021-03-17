package cts.ase.ro.Reader;

import cts.ase.ro.Clase.Aplicant;
import cts.ase.ro.Clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReaderStudent extends ReaderAplicant {
    public ReaderStudent(String numeFisier) {
        super(numeFisier);
    }

    @Override
    public List<Aplicant> readAplicants() throws FileNotFoundException {
        Scanner textFisier = new Scanner(new File(super.numeFisier));
        textFisier.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        while (textFisier.hasNext()) {
            Student student = new Student();
            readerAplicant(textFisier, student);
            int an_studii = textFisier.nextInt();
            String facultate = (textFisier.next()).toString();
            student.setAn_studii(an_studii);
            student.setFacultate(facultate);
            studenti.add(student);
        }
        textFisier.close();
        return studenti;
    }
}
