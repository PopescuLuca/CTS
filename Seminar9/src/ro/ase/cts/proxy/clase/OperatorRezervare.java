package ro.ase.cts.proxy.clase;

public class OperatorRezervare implements IOperatorRezervari {
    private String denumireRestaurant;

    public OperatorRezervare(String denumireRestaurant) {
        this.denumireRestaurant = denumireRestaurant;
    }
    @Override
    public void Rezervari(int nrPers) {
        System.out.println("S-a realizat o rezervare pentru "+nrPers+"persoane la restaurantul "
                +denumireRestaurant);
    }
}
