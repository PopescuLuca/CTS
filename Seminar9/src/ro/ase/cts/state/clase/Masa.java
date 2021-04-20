package ro.ase.cts.state.clase;

public class Masa {
    private int id;
    private StareMasa stareMasa;

    public Masa(int id) {
        this.id = id;
        this.stareMasa=new Libera();
    }

    public StareMasa getStareMasa() {
        return stareMasa;
    }

     void setStareMasa(StareMasa stareMasa) {
        this.stareMasa = stareMasa;
    }
    public void rezervareMasa(String numeClient){
        if(this.getStareMasa() instanceof Libera){
            System.out.println(numeClient+" a rezervat masa");
            this.setStareMasa(new Rezervat());
        }
        else {
            System.out.println("Masa nu este libera ");
        }
    }
    public void ocupareMasa(String numeClient){
        if(!(this.getStareMasa() instanceof  Ocupata)){
            System.out.println(numeClient+" a ocupat masa");
            this.setStareMasa(new Ocupata());
        }
        else {
            System.out.println("Masa nu poate sa fie ocupata");
        }
    }
    public void elibereazaMasa(String numeClient){
        if(!(this.getStareMasa() instanceof Libera)){
            System.out.println(numeClient +" a eliberat masa");
            this.setStareMasa(new Libera());
        }
        else {
            System.out.println("Masa este deja libera");
        }
    }

}
