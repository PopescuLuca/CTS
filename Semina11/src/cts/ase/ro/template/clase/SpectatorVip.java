package cts.ase.ro.template.clase;

public class SpectatorVip extends  SpectatorAbstract {
    private String nume;
    private String loja;

    public SpectatorVip(String nume, String loja) {
        this.nume = nume;
        this.loja = loja;
    }

    @Override
    public void asezareCoada() {
        System.out.println(this.nume+ " intra direct pe intrare de VIP");
    }

    @Override
    public void prezintaBilet() {
        System.out.println(this.nume+ " prezinta biletul VIP");
    }

    @Override
    public void realizeazaControlCorporal() {
        System.out.println(this.nume + " este controlat corporal");
    }

    @Override
    public void ocupaLoc() {
        System.out.println(this.nume+" ocupa locul in loja "+loja);
    }
}
