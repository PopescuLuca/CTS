package cts.ase.ro.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMeci {
    private List<Memento> mementoList;

    public ManagerMeci() {
        this.mementoList = new ArrayList<>();

    }

    public void adaugaMemento(Memento memento) {
        mementoList.add(memento);
    }

    public Memento getMemento(int pozitie) {
        if (pozitie >= 0 && pozitie < this.mementoList.size()) {
            return this.mementoList.get(pozitie);
        }
        throw new IndexOutOfBoundsException();
    }
    public Memento undo(){
        //returneaza elementul de pe ultima pozitie
        return this.mementoList.get(mementoList.size()-1);
    }
}
