package ro.ase.cts.facade.clase;

public class OperatorMese {

    public static boolean esteLibera(Masa masa) {
        return masa.getNrPersoane() == 0 ;
    }
}
