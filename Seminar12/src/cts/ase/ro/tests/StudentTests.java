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
    @Test
    public void testDimensiuneLista(){
        Student student=new Student();
        student.adaugaNota(10);
        student.adaugaNota(9);
        assertEquals(2,student.getNote().size());
    }
    @Test
    public void testCalculeazaMedie(){
        Student student=new Student();
        student.adaugaNota(10);
        student.adaugaNota(7);
        assertEquals(8.5f,student.calculeazaMedie(),0.1);
    }
    @Test
    public void testRestante(){
        Student student=new Student();
        student.adaugaNota(4);
        student.adaugaNota(7);
        assertTrue(student.areRestante());
    }
    @Test
    public void testfaraRestante(){
        Student student=new Student();
        student.adaugaNota(6);
        assertFalse(student.areRestante());
    }
    @Test
    public void testgetNotaInafaraLimitei(){
        Student student=new Student();
        student.adaugaNota(10);
        //1
        try {
            //2
            student.getNota(-1);
            //3--nu se ajunge
            fail("Nu se ajunge aici. Metoda arunca exceptie");
        }catch (IndexOutOfBoundsException exception){
            //4
        }
        catch (Exception exception){
            //5--nu se ajunge
            fail("Tipul exceptiei aruncat nu este corect");
        }
        //6
    }
    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetNotaInvalida(){
        Student student=new Student();
        student.getNota(10);
        int nota=student.getNota(-1);
    }
}