package cts.popescu.luca.g1085.state.main;

import cts.popescu.luca.g1085.state.clase.*;

public class main {
    public static void main(String[] args) {
        Cerere cerere=new Cerere(1,2,"Mate");
        Cerere cerere2=new Cerere(2,20,"Romana");
        Cerere cerere3 =new Cerere(3,5,"");

        cerere.confirmare();
        cerere.verificare();
        cerere.respingere();
        cerere.avizareDecanat();
        System.out.println("\n");
        cerere2.confirmare();
        cerere2.verificare();
        cerere2.respingere();
        cerere2.avizareDecanat();
        System.out.println("\n");
        cerere3.confirmare();
        cerere3.verificare();
        cerere3.respingere();
        cerere3.avizareDecanat();
    }
}
