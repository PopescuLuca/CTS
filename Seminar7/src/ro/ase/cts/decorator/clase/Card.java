package ro.ase.cts.decorator.clase;

public class Card implements CardAbstract {
    private String numeTitular;
    private String numarCard;

    public Card(String numeTitular, String numarCard) {
        super();
        this.numeTitular = numeTitular;
        this.numarCard = numarCard;
    }

    public String getNumeTitular() {
        return numeTitular;
    }

    public String getNumarCard() {
        return numarCard;
    }

    @Override
    public void platestePOS() {
        System.out.println(numeTitular+" a platit POS cu cardul "+numarCard);
    }

    @Override
    public void platesteOnline() {
        System.out.println(numeTitular+" a platit online cu cardul "+numarCard);
    }
}
