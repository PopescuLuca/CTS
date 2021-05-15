package cts.popescu.luca.g1085.singletone.clase;

    public interface IRobotSoftware {
        public void trimiteCerere(String denumire);

        public String getInformatii(String categorie);

        public void prelucrareCerere(String tip);

        public int getIdRobot();
    }
