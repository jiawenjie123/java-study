package demo11_interface_implements;

public class PingpangMan implements Sportman,Law {
    //实现类
//类与接口 多实现
    public String name;

    public PingpangMan(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name+"必须跑步");

    }

    @Override
    public void competition() {
        System.out.println(name+"参加比赛");

    }

    @Override
    public void rule() {
        System.out.println("守法");
    }
}


