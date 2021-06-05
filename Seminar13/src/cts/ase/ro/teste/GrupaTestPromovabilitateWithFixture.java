package cts.ase.ro.teste;

import cts.ase.ro.clase.Grupa;
import cts.ase.ro.clase.Student;
import cts.ase.ro.suite.categorii.TestPromovabilitateCategorii;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class GrupaTestPromovabilitateWithFixture {
    private Grupa grupa;
    @Before
    public void setUp() {
         grupa = new Grupa(1085);
        for (int i = 0; i < 35; i++) {
            Student student = new Student("Rares");
            student.adaugaNota(7);
            student.adaugaNota(8);
            grupa.adaugaStudent(student);
        }
    }

    @Test(timeout = 500)
    @Category(TestPromovabilitateCategorii.class)
    public void testPerformancePentruTimp() {
        grupa.getPromovabilitate();
    }
}