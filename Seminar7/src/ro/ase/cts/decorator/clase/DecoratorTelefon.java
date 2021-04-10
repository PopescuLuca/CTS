package ro.ase.cts.decorator.clase;

public class DecoratorTelefon extends DecoratorAbstract {
    public DecoratorTelefon(CardAbstract cardAbstract) {
        super(cardAbstract);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCardAbstract()).getNumeTitular()+" a platit prin telefon");
    }
}
