package cts.popescu.luca.g1085.state.clase;

public class InVerificare implements StareCerere {

    @Override
    public void modificaStare(Cerere cerere) {
        if(cerere.getStareCerere() instanceof Primita){
            cerere.setStareCerere(this);
        }
    }
}
