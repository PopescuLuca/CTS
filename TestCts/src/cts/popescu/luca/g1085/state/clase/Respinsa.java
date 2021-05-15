package cts.popescu.luca.g1085.state.clase;

public class Respinsa implements StareCerere {

    @Override
    public void modificaStare(Cerere cerere) {
        if(cerere.getMotiv().isEmpty() && cerere.getTermenulPrimireCerere()>10){
            cerere.setStareCerere(this);
        }
    }
}
