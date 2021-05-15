package cts.ase.ro.template.main;

import cts.ase.ro.template.clase.Spectator;
import cts.ase.ro.template.clase.SpectatorVip;

public class main {
    public static void main(String[] args) {
        Spectator spectator=new Spectator("Luca");
        SpectatorVip spectatorVip= new SpectatorVip("Vip","1");
        spectator.intrarePeStadion();
        spectatorVip.intrarePeStadion();

    }
}
