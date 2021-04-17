package ro.ase.cts.flyweight.clase;

public class Client implements FlyweightAbstract {
    private String nume;
    private String nrTelefon;
    private String adresaEmail;

    public Client(String nume, String nrTelefon, String adresaEmail) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
        this.adresaEmail = adresaEmail;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Client{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", nrTelefon=").append(nrTelefon);
        sb.append(", adresaEmail='").append(adresaEmail).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void printeazaInformatiiRezervare(Rezervare rezervare) {
        System.out.println(rezervare.toString()+this.toString());
    }
}
