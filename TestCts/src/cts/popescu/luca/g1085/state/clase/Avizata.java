package cts.popescu.luca.g1085.state.clase;

public class Avizata implements StareCerere {

    @Override
    public void modificaStare(Cerere cerere) {
        if(cerere.getStareCerere() instanceof InVerificare && cerere.getTermenulPrimireCerere()<10){
            cerere.setStareCerere(this);
        }
    }
}
