package ro.ase.cts.decoratorMultiplu.clase;

public class Bilet implements OperatorAbstract {
    private String numeEchipaGazda;
    private String numeEchipaOaspeti;

    public Bilet(String numeEchipaGazda, String numeEchipaOaspeti) {
        super();
        this.numeEchipaGazda = numeEchipaGazda;
        this.numeEchipaOaspeti = numeEchipaOaspeti;
    }


    @Override
    public void rezervaBilet() {
        System.out.println(numeEchipaGazda+ " joaca impotriva " +numeEchipaOaspeti);
    }

    @Override
    public String getNumeEchipaGazda() {
        return numeEchipaGazda;
    }

    @Override
    public String getNumeEchipaOaspeti() {
        return numeEchipaOaspeti;
    }


}
