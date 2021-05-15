package cts.ase.ro.observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerAbstract {
    List<Observer> observerList;

    public ManagerAbstract() {
        super();
        this.observerList = new ArrayList<>();
    }
    public void aboneaza(Observer observer){
        observerList.add(observer);
    }
    public void dezaboneaza(Observer observer){
        observerList.remove(observer);
    }
    public void notifica(String mesaj) {
        for (Observer observer : observerList) {
            observer.primesteAnunt(mesaj);
        }
    }
}
