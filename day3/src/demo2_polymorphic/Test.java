package demo2_polymorphic;

public class Test {
    public static void main(String[] args) {
        Computer computer=new Computer("外星人");
        computer.run();

        Usb u=new Keyboard("双飞燕");
        computer.installUSB(u);

        Usb u1=new Mouse("逻辑");
        computer.installUSB(u1);
    }
}
