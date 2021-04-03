package ro.ase.cts.builder.Main;

import ro.ase.cts.builder.Rezervare;
import ro.ase.cts.builder.RezervareBuilder;
import ro.ase.cts.builder.RezervareBuilderV2;

public class main {
    public static void main(String[] args) {
        Rezervare rezervare=new Rezervare(1,false,true,false,true,"pop");
        System.out.println(rezervare);
        Rezervare rezervare1=new RezervareBuilder().setCod(2).setBauturaInclusa(true).setMuzica("rock").build();
        System.out.println(rezervare1);
        Rezervare rezervare2=new RezervareBuilder().setCod(3).setMancareInclusa(true).setMancareInclusa(true).build();
        System.out.println(rezervare2);
        Rezervare rezervare3=new RezervareBuilder(10).setMancareInclusa(true).setMuzica("Jazz").build();
        System.out.println(rezervare3);

        RezervareBuilder rezervareBuilder=new RezervareBuilder();
        Rezervare r1;
        Rezervare r2;
        r1=rezervareBuilder.setCod(13).build();
        r2=rezervareBuilder.setCod(14).setMancareInclusa(true).build();
        System.out.println(r1);
        System.out.println(r2);

        RezervareBuilderV2 rezervareBuilderV2=new RezervareBuilderV2().setBauturaInculsa(true).setMuzicaAmbientalaPersonalizata(true);
        Rezervare rezervare4=rezervareBuilderV2.setCod(16).build();
        Rezervare rezervare5=rezervareBuilderV2.setCod(17).build();
        Rezervare rezervare6=rezervareBuilderV2.setCod(18).build();
        System.out.println(rezervare4);
        System.out.println(rezervare5);
        System.out.println(rezervare6);
    }
}
