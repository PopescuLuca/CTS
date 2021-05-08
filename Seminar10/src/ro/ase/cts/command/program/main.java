package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.*;

public class main {
    public static void main(String[] args) {
        ManagerComenzi managerComenzi=new ManagerComenzi();
        ContBancar contBancar=new ContBancar("Alex");
        managerComenzi.invocareComanda(new ComandaConstituire(contBancar,50));
        managerComenzi.invocareComanda(new ComandaDepunere(contBancar,10));
        managerComenzi.executaComanda();
        managerComenzi.invocareComanda(new ComandaRetragere(contBancar,30));
        managerComenzi.executaComanda();
        managerComenzi.executaComanda();
        managerComenzi.invocareComanda(new ComandaRetragere(contBancar,40));
        managerComenzi.executaComanda();
    }
}
