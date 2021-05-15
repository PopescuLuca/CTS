package cts.popescu.luca.g1085.singletone.clase;

public class RobotSoftware implements IRobotSoftware {

    private int idRobot;
    private static RobotSoftware robotSoftware = null;

    private RobotSoftware(int idRobot) {
        this.idRobot = idRobot;
    }

    public static synchronized RobotSoftware getInstance(int idRobot) {
        if (robotSoftware == null) {
            robotSoftware = new RobotSoftware(idRobot);
        }
        return robotSoftware;
    }

    @Override
    public void trimiteCerere(String denumire) {
        System.out.println("S-a trimis cererea cu denumirea " + denumire + " mai departe");
    }

    @Override
    public String getInformatii(String categorie) {
        return categorie;
    }

    @Override
    public void prelucrareCerere(String tip) {
        System.out.println("S-a prelucrat cererea de tip " + tip);
    }

    @Override
    public int getIdRobot() {
        return idRobot;
    }
}
