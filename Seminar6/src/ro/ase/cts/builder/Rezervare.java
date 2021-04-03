package ro.ase.cts.builder;

public class Rezervare {
    private int cod;
    private boolean mancareInclusa;
    private boolean scaunErgonomic;
    private boolean bauturaInculsa;
    private boolean muzicaAmbientalaPersonalizata;
    private String muzica;

    public Rezervare(int cod, boolean mancareInclusa, boolean scaunErgonomic, boolean bauturaInculsa, boolean muzicaAmbientalaPersonalizata, String muzica) {
        this.cod = cod;
        this.mancareInclusa = mancareInclusa;
        this.scaunErgonomic = scaunErgonomic;
        this.bauturaInculsa = bauturaInculsa;
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
        this.muzica = muzica;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public boolean isMancareInclusa() {
        return mancareInclusa;
    }

    public void setMancareInclusa(boolean mancareInclusa) {
        this.mancareInclusa = mancareInclusa;
    }

    public boolean isScaunErgonomic() {
        return scaunErgonomic;
    }

    public void setScaunErgonomic(boolean scaunErgonomic) {
        this.scaunErgonomic = scaunErgonomic;
    }

    public boolean isBauturaInculsa() {
        return bauturaInculsa;
    }

    public void setBauturaInculsa(boolean bauturaInculsa) {
        this.bauturaInculsa = bauturaInculsa;
    }

    public boolean isMuzicaAmbientalaPersonalizata() {
        return muzicaAmbientalaPersonalizata;
    }

    public void setMuzicaAmbientalaPersonalizata(boolean muzicaAmbientalaPersonalizata) {
        this.muzicaAmbientalaPersonalizata = muzicaAmbientalaPersonalizata;
    }

    public String getMuzica() {
        return muzica;
    }

    public void setMuzica(String muzica) {
        this.muzica = muzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("cod=").append(cod);
        sb.append(", mancareInclusa=").append(mancareInclusa);
        sb.append(", scaunErgonomic=").append(scaunErgonomic);
        sb.append(", bauturaInculsa=").append(bauturaInculsa);
        sb.append(", muzicaAmbientalaPersonalizata=").append(muzicaAmbientalaPersonalizata);
        sb.append(", muzica='").append(muzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
