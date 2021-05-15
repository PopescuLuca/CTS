package cts.popescu.luca.g1085.state.clase;

public class Primita implements StareCerere {
    @Override
    public void modificaStare(Cerere cerere) {
        if(cerere.getStareCerere() instanceof TrimisaPeFlux){
            cerere.setStareCerere(this);
        }
    }
}
