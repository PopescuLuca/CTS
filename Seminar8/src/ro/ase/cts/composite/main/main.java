package ro.ase.cts.composite.main;

import ro.ase.cts.composite.clase.ComponentaMeniu;
import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class main {
    public static void main(String[] args) {
        Sectiune bauturi=new Sectiune("Bauturi");
        Sectiune aperitive=new Sectiune("Aperitive");

        Item cola=new Item("Cola");
        Item fanta=new Item("Fanta");

        Item bruschete=new Item("Bruschete");

        bauturi.adaugaComponenta(cola);
        bauturi.adaugaComponenta(fanta);

        aperitive.adaugaComponenta(bruschete);

        Sectiune meniu=new Sectiune("Meniu");
        meniu.adaugaComponenta(bauturi);
        meniu.adaugaComponenta(aperitive);
        meniu.afisareDescriere();
    }
}
