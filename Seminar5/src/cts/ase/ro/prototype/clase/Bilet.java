package cts.ase.ro.prototype.clase;

public class Bilet implements AbstractPrototype {
    private int cod;
    private String numeEchipa1;
    private String numeEchipa2;
    private String dataOra;

    public Bilet() {
        super();
    }

    public Bilet(int cod, String numeEchipa1, String numeEchipa2, String dataOra) {
        super();
        this.cod = cod;
        this.numeEchipa1 = numeEchipa1;
        this.numeEchipa2 = numeEchipa2;
        this.dataOra = dataOra;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Bilet{");
        sb.append("cod=").append(cod);
        sb.append(", numeEchipa1='").append(numeEchipa1).append('\'');
        sb.append(", numeEchipa2='").append(numeEchipa2).append('\'');
        sb.append(", dataOra='").append(dataOra).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public AbstractPrototype copiaza() {
        Bilet copie = new Bilet();
        copie.numeEchipa1=this.numeEchipa1;
        copie.numeEchipa2=this.numeEchipa2;
        copie.dataOra=this.dataOra;
        return copie;
    }
}
