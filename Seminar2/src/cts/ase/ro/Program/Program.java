package cts.ase.ro.Program;

import cts.ase.ro.Clase.Angajat;
import cts.ase.ro.Clase.Aplicant;
import cts.ase.ro.Clase.Utils;
import cts.ase.ro.Reader.ReaderAngajat;
import cts.ase.ro.Reader.ReaderAplicant;
import cts.ase.ro.Reader.ReaderElev;
import cts.ase.ro.Reader.ReaderStudent;

import java.io.FileNotFoundException;
import java.util.List;

public class Program {

	public static List<Aplicant> citireAplicanti(ReaderAplicant readerAplicant) throws FileNotFoundException {
		return readerAplicant.readAplicants();
	}

	public static void main(String[] args) {
		List<Aplicant> listaAplicanti;
		try {
			listaAplicanti = citireAplicanti(new ReaderStudent("studenti.txt"));
			for(Aplicant aplicant:listaAplicanti)
				System.out.println(aplicant.toString());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
