package demo11_interface_implements;

import demo13_interface_jdk8.SportMan;

public class Test {
    public static void main(String[] args) {
        PingpangMan pingpangMan=new PingpangMan("zhang");
        pingpangMan.run();
        pingpangMan.competition();
        pingpangMan.rule();

        SportMan.inAddr();
    }
}
