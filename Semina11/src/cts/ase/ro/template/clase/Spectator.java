package cts.ase.ro.template.clase;

public class Spectator extends SpectatorAbstract {
    public String  nume;

    public Spectator(String nume) {
        this.nume = nume;
    }

    @Override
    public void asezareCoada() {
        System.out.println(this.nume+ " s-a asezat la coada");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.nume+ " a prezentat bilet");
    }

    @Override
    public void realizeazaControlCorporal() {
        System.out.println(this.nume+ " a fost controlat corporal");
    }

    @Override
    public void ocupaLoc() {
        System.out.println(this.nume+ " a ocupat locul");
    }
}
