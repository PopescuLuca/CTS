package ro.ase.cts.chainofresposability.clase;

public class ContCurent extends Cont {

    public ContCurent(float sold) {
        super(sold);
    }

    @Override
    public void realizeazaPlata(float suma) {
        if (suma < getSold()) {
            System.out.println("Se face plata din contul curent pt suma de " + suma);
            super.setSold(super.getSold() - suma);
        } else {
            if(super.getCont()!=null){
                super.getCont().realizeazaPlata(suma);
            }else {
                System.out.println("Plata este refuzata ");
            }
        }
    }
}
