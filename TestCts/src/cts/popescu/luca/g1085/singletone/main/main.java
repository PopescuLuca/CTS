package cts.popescu.luca.g1085.singletone.main;

import cts.popescu.luca.g1085.singletone.clase.RobotSoftware;

public class main {
    public static void main(String[] args) {
        RobotSoftware robotSoftware=RobotSoftware.getInstance(1);
        RobotSoftware robotSoftware2=RobotSoftware.getInstance(2);
        System.out.println(robotSoftware.getIdRobot());
        System.out.println(robotSoftware2.getIdRobot());
        robotSoftware.trimiteCerere("Materii");
        System.out.println(robotSoftware.getInformatii("Categorie"));
        robotSoftware.prelucrareCerere("Materii");
    }
}
