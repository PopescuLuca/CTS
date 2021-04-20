package ro.ase.cts.strategy.program;

import ro.ase.cts.strategy.clase.Client;
import ro.ase.cts.strategy.clase.PlataCard;
import ro.ase.cts.strategy.clase.PlataCash;

public class main {
    public static void main(String[] args) {
        Client client=new Client("Luca",new PlataCard());
        client.platesteNota(20);
        client.setiModPlata(new PlataCash());
        client.platesteNota(50);
    }
}
