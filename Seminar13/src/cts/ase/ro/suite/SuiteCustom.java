package cts.ase.ro.suite;

import cts.ase.ro.suite.categorii.TestPromovabilitateCategorii;
import cts.ase.ro.suite.categorii.TesteUrgente;
import cts.ase.ro.teste.GrupaTest;
import cts.ase.ro.teste.GrupaTestPromovabilitateWithDubluri;
import cts.ase.ro.teste.GrupaTestPromovabilitateWithFixture;
import jdk.jfr.Category;
import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Suite.SuiteClasses({GrupaTest.class, GrupaTestPromovabilitateWithFixture.class, GrupaTestPromovabilitateWithDubluri.class,GrupaTestPromovabilitateWithFixture.class})
@Categories.IncludeCategory(TestPromovabilitateCategorii.class)
@Categories.ExcludeCategory(TesteUrgente.class)
public class SuiteCustom {

}
