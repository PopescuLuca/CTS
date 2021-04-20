package ro.ase.cts.strategy.clase;

public class PlataCash implements IModPlata{


    @Override
    public void plateste(int suma) {
        System.out.println("Clientul a platit cash suma de "+suma);
    }
}
