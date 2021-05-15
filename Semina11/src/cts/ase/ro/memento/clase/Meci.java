package cts.ase.ro.memento.clase;

public class Meci {
    private int nrSpectatori;
    private String numeEchipaGazda;
    private String numeEchipaOaspeti;
    private int nrBileteVandute;
    private int nrJandarmi;

    public Meci(int nrSpectatori, String numeEchipaGazda, String numeEchipaOaspeti, int nrBileteVandute, int nrJandarmi) {
        this.nrSpectatori = nrSpectatori;
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspeti = numeEchipaOaspeti;
        this.nrBileteVandute = nrBileteVandute;
        this.nrJandarmi = nrJandarmi;
    }

    public Memento creareMemento() {
        return new Memento(this.nrSpectatori, this.numeEchipaGazda, this.numeEchipaOaspeti);
    }

    public void setMemento(Memento memento) {
        this.nrSpectatori = memento.getNrSpectatori();
        this.numeEchipaGazda = memento.getNumeEchipaGazda();
        this.numeEchipaOaspeti = memento.getNumeEchipaOaspeti();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Meci{");
        sb.append("nrSpectatori=").append(nrSpectatori);
        sb.append(", numeEchipaGazda='").append(numeEchipaGazda).append('\'');
        sb.append(", numeEchipaOaspeti='").append(numeEchipaOaspeti).append('\'');
        sb.append(", nrBileteVandute=").append(nrBileteVandute);
        sb.append(", nrJandarmi=").append(nrJandarmi);
        sb.append('}');
        return sb.toString();
    }

    public void setNrSpectatori(int nrSpectatori) {
        this.nrSpectatori = nrSpectatori;
    }

    public void setNumeEchipaGazda(String numeEchipaGazda) {
        this.numeEchipaGazda = numeEchipaGazda;
    }

    public void setNumeEchipaOaspeti(String numeEchipaOaspeti) {
        this.numeEchipaOaspeti = numeEchipaOaspeti;
    }

    public void setNrBileteVandute(int nrBileteVandute) {
        this.nrBileteVandute = nrBileteVandute;
    }

    public void setNrJandarmi(int nrJandarmi) {
        this.nrJandarmi = nrJandarmi;
    }
}
