package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune extends ComponentaMeniu{

    private List<ComponentaMeniu> componentaMeniuList;
    public Sectiune(String nume) {
        super(nume);
        this.componentaMeniuList=new ArrayList<>();
    }

    @Override
    public void afisareDescriere() {
        System.out.println("Sectiune: "+this.getNume());
        for(ComponentaMeniu componentaMeniu: this.componentaMeniuList){
            componentaMeniu.afisareDescriere();
        }
    }

    @Override
    public ComponentaMeniu getComponenta(int poz) throws Exception {
        if(poz<componentaMeniuList.size()&&poz>=0){
            return componentaMeniuList.get(poz);
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void adaugaComponenta(ComponentaMeniu componentaMeniu) {
        componentaMeniuList.add(componentaMeniu);
    }

    @Override
    public void stergeComponenta(ComponentaMeniu componentaMeniu) {
        componentaMeniuList.remove(componentaMeniu);
    }

}
