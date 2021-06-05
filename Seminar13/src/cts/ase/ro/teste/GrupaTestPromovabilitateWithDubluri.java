package cts.ase.ro.teste;

import cts.ase.ro.clase.Grupa;
import cts.ase.ro.clase.Student;
import cts.ase.ro.dummy.StudentDub;
import cts.ase.ro.dummy.StudentDummy;
import cts.ase.ro.dummy.StudentFake;
import org.junit.Test;

import static org.junit.Assert.*;

public class GrupaTestPromovabilitateWithDubluri {
    @Test
    public void testRefrenceAdaugaStudent() {
        Grupa grupa = new Grupa(1070);
        grupa.adaugaStudent(new StudentDummy());
        grupa.adaugaStudent(new StudentDummy());
        assertEquals(2, grupa.getStudenti().size());
    }

    public void testReferenceCuStub() {
        Grupa grupa = new Grupa(1063);
        grupa.adaugaStudent(new StudentDub());
        grupa.adaugaStudent(new StudentDub());
        assertEquals(1, grupa.getPromovabilitate(), 0.01);
    }

    public void testReferenceCuFake() {
        Grupa grupa = new Grupa(1063);
        for (int i = 0; i < 7; i++) {
            StudentFake studentFake = new StudentFake();
            studentFake.setValoareareRestante(false);
            grupa.adaugaStudent(studentFake);
        }
        for (int i = 0; i < 3; i++) {
            StudentFake studentFake1 = new StudentFake();
            studentFake1.setValoareareRestante(true);
            grupa.adaugaStudent(studentFake1);
        }
        assertEquals(0.7, grupa.getPromovabilitate(), 0.01);
    }

}