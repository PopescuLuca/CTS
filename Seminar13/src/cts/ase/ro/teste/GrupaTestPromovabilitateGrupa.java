package cts.ase.ro.teste;

import cts.ase.ro.clase.Grupa;
import cts.ase.ro.clase.Student;
import cts.ase.ro.dummy.StudentDummy;
import cts.ase.ro.suite.categorii.TestPromovabilitateCategorii;
import cts.ase.ro.suite.categorii.TesteUrgente;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

@Category(TestPromovabilitateCategorii.class)
public class GrupaTestPromovabilitateGrupa {
    @Test
    @Category({TestPromovabilitateCategorii.class,TesteUrgente.class})
    public void testRight() {
        Grupa grupa=new Grupa(1085);
        for(int i=0;i<3;i++) {
            Student student=new Student("Gigel");
            student.adaugaNota(4);
            student.adaugaNota(5);
            grupa.adaugaStudent(student);
        }
        for(int i=0;i<7;i++) {
            Student student=new Student("Gigel");
            student.adaugaNota(9);
            student.adaugaNota(5);
            grupa.adaugaStudent(student);
        }
        assertEquals(0.7, grupa.getPromovabilitate(), 0.01);
    }
    @Test
    @Category(TestPromovabilitateCategorii.class)
    public void testGetPromovabilitateLowerBound() {
        Grupa grupa = new Grupa(1085);
        for(int i=0;i<6;i++) {
            Student student = new Student("Rares");
            student.adaugaNota(3);
            student.adaugaNota(8);
            grupa.adaugaStudent(student);
        }
        assertEquals(0, grupa.getPromovabilitate(), 0.01);
    }

    @Test
    @Category(TestPromovabilitateCategorii.class)
    public void testGetPromovabilitateUpperBound() {
        Grupa grupa = new Grupa(1085);
        for(int i=0;i<6;i++) {
            Student student = new Student("Rares");
            student.adaugaNota(7);
            student.adaugaNota(8);
            grupa.adaugaStudent(student);
        }
        assertEquals(1, grupa.getPromovabilitate(), 0.01);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    @Category(TestPromovabilitateCategorii.class)
    public void testError() {
        Grupa grupa = new Grupa(1001);
//        Student student=new Student("ASSD");
//        student.adaugaNota(5);
//        student.adaugaNota(7);
//        grupa.adaugaStudent(student);
        grupa.getPromovabilitate();
    }

    @Test
    public void testReference() {
        Grupa grupa = new Grupa(1070);
        grupa.adaugaStudent(new StudentDummy());
        grupa.adaugaStudent(new StudentDummy());
        assertEquals(2, grupa.getStudenti().size());
    }
}