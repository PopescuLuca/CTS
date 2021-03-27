package cts.ase.ro.prototype.program;

import cts.ase.ro.prototype.clase.AbstractPrototype;
import cts.ase.ro.prototype.clase.Bilet;
import cts.ase.ro.prototype.clase.ClientStadion;

public class Main {
    public static void main(String[] args) {
        AbstractPrototype abstractPrototype = new ClientStadion("Luca", 20);
        AbstractPrototype abstractPrototype1 = abstractPrototype.copiaza();
        ClientStadion clientStadion = (ClientStadion) abstractPrototype.copiaza();

        clientStadion.setDenumire("DenumireSchimbata");

        System.out.println(abstractPrototype.toString());
        System.out.println(abstractPrototype1.toString());
       System.out.println(clientStadion.toString());
       Bilet bilet1=new Bilet(1,"FCSB","Dinamo","10/20/2021 20:20");
       Bilet bilet2= (Bilet) bilet1.copiaza();
       bilet2.setCod(10);
        System.out.println(bilet1);
        System.out.println(bilet2);
    }
}
