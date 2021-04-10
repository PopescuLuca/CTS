package ro.ase.cts.clase;

public class Leasing {
    private String numeClient;
    private float suma;

    public Leasing(String numeClient, float suma) {
        super();
        this.numeClient = numeClient;
        this.suma = suma;
    }
    public void createLeasing(){
        System.out.println(numeClient+" are un leasing de "+suma);
    }
}
