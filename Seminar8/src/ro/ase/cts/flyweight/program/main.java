package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaClienti;
import ro.ase.cts.flyweight.clase.Rezervare;

public class main {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare(100,3,10);
        Rezervare rezervare1=new Rezervare(101,6,12);
        Rezervare rezervare2=new Rezervare(102,4,16);
        FabricaClienti fabricaClienti=new FabricaClienti();
        Client client=fabricaClienti.getClient("sahsa@email.com");
        client.printeazaInformatiiRezervare(rezervare);

        fabricaClienti.getClient("client2@email.com").printeazaInformatiiRezervare(rezervare1);
        fabricaClienti.getClient("sahsa@email.com").printeazaInformatiiRezervare(rezervare2);
    }
}
