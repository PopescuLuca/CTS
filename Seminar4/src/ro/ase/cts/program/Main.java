package ro.ase.cts.program;

import javafx.scene.control.Alert;
import ro.ase.cts.singletoneLazy.AsigurareMedicala;

public class Main {
    public static void main(String[] args){
        AsigurareMedicala asigurareMedicala1=AsigurareMedicala.getInstance(1,"Luca",50.5f);
        AsigurareMedicala asigurareMedicala2=AsigurareMedicala.getInstance(2, "Alex",60.5f);

        System.out.println(asigurareMedicala1.toString());
        System.out.println(asigurareMedicala2.toString());
    }
}
