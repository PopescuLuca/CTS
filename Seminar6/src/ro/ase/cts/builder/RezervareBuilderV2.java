package ro.ase.cts.builder;

public class RezervareBuilderV2 implements AbstractBuilder {
    private int cod;
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaInculsa;
    private boolean muzicaAmbientalaPersonalizata;
    private String muzica;
    public RezervareBuilderV2(){

    }

    public RezervareBuilderV2 setCod(int cod) {
        this.cod = cod;
        return this;
    }

    public RezervareBuilderV2 setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
        return this;
    }

    public RezervareBuilderV2 setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
        return this;
    }

    public RezervareBuilderV2 setBauturaInculsa(boolean bauturaInculsa) {
        this.bauturaInculsa = bauturaInculsa;
        return this;
    }

    public RezervareBuilderV2 setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        return this;
    }

    public RezervareBuilderV2 setMuzica(String muzica) {
        this.muzica = muzica;
        return this;
    }

    @Override
    public Rezervare build() {
        return new Rezervare(cod,mancareInclusa,scaunErgonomic,bauturaInculsa,muzicaAmbientalaPersonalizata,muzica);
    }
}
