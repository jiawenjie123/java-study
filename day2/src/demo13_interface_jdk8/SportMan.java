package demo13_interface_jdk8;

public abstract class SportMan {
    //1.jdk 开始默认方法(实例方法) 必须default修饰 默认使用public修饰
    //接口不能创建对象 实现类调用
    public void run(){
        System.out.println("跑");
        go();
    }
    //2.静态方法 必须用static 默认加public 接口自己调用
    public static void inAddr() {
        System.out.println("新增语法");
    }

    //私有方法 jdk9开始 接口内部可以访问
    private void go(){
        System.out.println("跑");
    }
}

class PingpongMan extends SportMan {

}
class Test{
    public static void main(String[] args) {
        PingpongMan p=new PingpongMan();
        p.run();

    }
}
