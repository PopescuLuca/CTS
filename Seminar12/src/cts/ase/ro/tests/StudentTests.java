package cts.ase.ro.tests;

import cts.ase.ro.clase.Student;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTests {
    @Test
    public void testCorectitudineConstructorCuParametri(){
        String nume="Gigel";
        Student student= new Student(nume);
        assertEquals(nume,student.getNume());
    }
    @Test
    public void testInitializareInConstructorCuParametru(){
            Student student=new Student("Gigel");
            assertNotNull(student.getNote());
    }
    @Test
    public void testCorectitudineConstructorDefault(){
        Student student=new Student();
        assertNotNull("Notele nu au fost initializate",student.getNote());
        assertNotNull("NUmele nu a fost initializat",student.getNume());
    }
    @Test
    public void testMetodaAdaugareNotaInLista(){
        Student student=new Student();
        student.adaugaNota(10);
        student.adaugaNota(8);
        student.adaugaNota(6);
        assertEquals(10,student.getNota(0));
        assertEquals(8,student.getNota(1));
        assertEquals(6,student.getNota(2));
    }
}