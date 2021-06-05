package cts.ase.ro.suite;

import cts.ase.ro.clase.Grupa;
import cts.ase.ro.teste.GrupaTest;
import cts.ase.ro.teste.GrupaTestPromovabilitateGrupa;
import cts.ase.ro.teste.GrupaTestPromovabilitateWithDubluri;
import cts.ase.ro.teste.GrupaTestPromovabilitateWithFixture;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({GrupaTestPromovabilitateGrupa.class, GrupaTestPromovabilitateWithDubluri.class, GrupaTestPromovabilitateWithFixture.class})
public class SuitaCompleta {
}
