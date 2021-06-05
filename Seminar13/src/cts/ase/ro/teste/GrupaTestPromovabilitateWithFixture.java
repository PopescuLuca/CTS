package cts.ase.ro.teste;

import cts.ase.ro.clase.Grupa;
import cts.ase.ro.clase.Student;
import org.junit.Before;
import org.junit.Test;

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
    public void testPerformancePentruTimp() {
        grupa.getPromovabilitate();
    }
}