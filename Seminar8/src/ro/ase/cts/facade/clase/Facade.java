package ro.ase.cts.facade.clase;

public class Facade {
    public static boolean potIntraOameniiLaMasa(Masa masa) {
        if (OperatorMese.esteLibera(masa)) {
            Picolo jimmy = new Picolo("Jimmy");
            if (jimmy.esteAranjata(masa) && jimmy.esteDebarasata(masa)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
