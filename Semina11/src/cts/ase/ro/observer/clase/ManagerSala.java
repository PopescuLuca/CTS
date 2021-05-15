package cts.ase.ro.observer.clase;

public class ManagerSala extends ManagerAbstract {
    private String denumireSala;

    public ManagerSala(String denumireSala) {
        this.denumireSala = denumireSala;
    }
    public void anuntaMeci(String tipMeci){
        super.notifica("Va avea loc un meci de "+tipMeci + "in sala "+denumireSala);
    }
}
