package ro.ase.cts.decoratorMultiplu.clase;

public class DecoratorSustinereEchipa extends DecoratorAbstract{
    public DecoratorSustinereEchipa(OperatorAbstract bilet) {
        super(bilet);
    }
    public void rezervaBilet(){
        super.rezervaBilet();
        System.out.println("Sustinem " + super.getNumeEchipaGazda());
    }
}
