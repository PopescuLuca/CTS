package ro.ase.cts.clasaMea;


public class Aplicant {
    private int id;
    private String nume;
    private boolean isAngajat;

    private static Aplicant aplicant = null;

    private Aplicant(int id, String nume, boolean isAngajat) {
        this.id = id;
        this.nume = nume;
        this.isAngajat = isAngajat;
    }

    public static synchronized Aplicant getInstance (int id, String nume, boolean isAngajat){
        if(aplicant == null){
            aplicant=new Aplicant(id,nume,isAngajat);
        }
        return aplicant;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setAngajat(boolean angajat) {
        isAngajat = angajat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Aplicant{");
        sb.append("id=").append(id);
        sb.append(", nume='").append(nume).append('\'');
        sb.append(", isAngajat=").append(isAngajat);
        sb.append('}');
        return sb.toString();
    }
}
