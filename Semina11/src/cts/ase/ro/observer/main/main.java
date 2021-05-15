package cts.ase.ro.observer.main;

import cts.ase.ro.observer.clase.ClientAbonat;
import cts.ase.ro.observer.clase.ManagerAbstract;
import cts.ase.ro.observer.clase.ManagerSala;

public class main {
    public static void main(String[] args) {
        ManagerSala managerSala=new ManagerSala("CSS4");
        ClientAbonat clientAbonat =new ClientAbonat("Luca");
        ClientAbonat clientAbonat1 =new ClientAbonat("alex");

        managerSala.aboneaza(clientAbonat);
        managerSala.aboneaza(clientAbonat1);
        managerSala.anuntaMeci("meci");
        managerSala.dezaboneaza(clientAbonat1);
        managerSala.anuntaMeci("Meci2");
    }
}
