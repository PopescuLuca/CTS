package ro.ase.cts.command.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerComenzi {
    private List<ComandaAbstracta> comandaAbstractaList;

    public ManagerComenzi() {
        this.comandaAbstractaList = new ArrayList<ComandaAbstracta>();
    }
    public void invocareComanda(ComandaAbstracta comandaAbstracta){
        comandaAbstractaList.add(comandaAbstracta);
    }
    public void executaComanda(){
        if(comandaAbstractaList.size()>0){
            comandaAbstractaList.get(0).executa();
            comandaAbstractaList.remove(0);

        }
    }

}
