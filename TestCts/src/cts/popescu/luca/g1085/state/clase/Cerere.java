package cts.popescu.luca.g1085.state.clase;

public class Cerere implements ICerereStudent {
    private int idCerere;
    private int termenulPrimireCerere;
    private String motiv;
    private StareCerere stareCerere;

    public Cerere(int idCerere, int termenulPrimireCerere, String motiv) {
        this.idCerere = idCerere;
        this.termenulPrimireCerere = termenulPrimireCerere;
        this.motiv = motiv;
        stareCerere = new TrimisaPeFlux();
    }

    @Override
    public void confirmare() {
        if (this.getStareCerere() instanceof TrimisaPeFlux) {
            System.out.println("Cerere primita");
            this.setStareCerere(new InVerificare());
        }
    }

    @Override
    public void verificare() {
        if (this.getStareCerere() instanceof InVerificare) {
            System.out.println("Cerere in curs de verificare");
            this.setStareCerere(new Avizata());
        }
    }

    @Override
    public void avizareDecanat() {
        if (this.getStareCerere() instanceof Avizata) {
            System.out.println("Cerere Avizata");
        }
    }

    @Override
    public void respingere() {
        if (getTermenulPrimireCerere() > 10 || getMotiv().equals("")) {
            System.out.println("Cerere Respinsa");
            this.setStareCerere(new Respinsa());
        }
    }


    public int getTermenulPrimireCerere() {
        return termenulPrimireCerere;
    }


    public String getMotiv() {
        return motiv;
    }


    public StareCerere getStareCerere() {
        return stareCerere;
    }

    public void setStareCerere(StareCerere stareCerere) {
        this.stareCerere = stareCerere;
    }
}
