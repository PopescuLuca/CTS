package cts.popescu.luca.g1085.command.clase;

import java.util.ArrayList;
import java.util.List;

public class RobotSoftware {
    private List<IProcesatorCerere> iProcesatorCerereList;
    private TipCerere tipCerere;

    public RobotSoftware(TipCerere tipCerere) {
        this.iProcesatorCerereList = new ArrayList<>();
        this.tipCerere = tipCerere;
    }

    public void invocareCerere() {
    }

    public void executaComanda() {
        if (iProcesatorCerereList.size() > 0) {
            iProcesatorCerereList.get(0).procesareCerere(tipCerere,"");
            iProcesatorCerereList.remove(0);
        }
    }
}
